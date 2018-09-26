package com.etc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.dao.AccessinfoMapper;
import com.etc.dao.BranchMapper;
import com.etc.dao.CourierAddMapper;
import com.etc.dao.CourierMapper;
import com.etc.dao.LogisticsMapper;
import com.etc.dao.OrdersMapper;
import com.etc.entity.Accessinfo;
import com.etc.entity.Branch;
import com.etc.entity.Courier;
import com.etc.entity.CourierExample;
import com.etc.entity.Logistics;
import com.etc.entity.Orders;
import com.etc.entity.User;

@Controller
public class CourierController {
	@Resource
	private CourierMapper courierMapper;
	@Resource
	private OrdersMapper ordersMapper;
	@Resource
	private CourierAddMapper courierAddMapper;
	@Resource
	private BranchMapper branchMapper;
	@Resource
	private LogisticsMapper logisticsMapper;
	@Resource
	private AccessinfoMapper accessinfoMapper;

	
	// 骑手管理（管理员）
	@RequestMapping("/showcourier")
	public String courierlogin(Model model) {
		List<Map<String, Object>> couriers = courierMapper.selectmap();
		
		model.addAttribute("list", couriers);
		return "admin/Managercourier";
	}

	//骑手登录
	@RequestMapping("/crlogin")
	public String courierlogin(HttpServletRequest request) {
		String phone=request.getParameter("phone");
		String pwd=request.getParameter("pwd");
		System.out.println("骑手登录:"+phone+" "+pwd);
		CourierExample ce = new CourierExample();
		ce.createCriteria().andCutelEqualTo(phone).andCupwdEqualTo(pwd);
		List<Courier> couriers = courierMapper.selectByExample(ce);
		if (couriers.size() != 1) { 
			request.setAttribute("msg", "电话或密码错误！");
			return "user/login";
		} else {
			request.getSession().invalidate();
			request.getSession().setAttribute("courier", couriers.get(0));
			request.getSession().setAttribute("cuId", couriers.get(0).getCuid());
			return "user/courierchange";
		}
	}
	
	//转发到骑手接单界面
	@RequestMapping("/courierchange")
	public String courierchange(HttpServletRequest request) {
		Courier courier=(Courier) request.getSession().getAttribute("courier");
		if(courier==null){
			return "user/login";
		}
		return "user/courierchange";
	}
	
	// 增加骑手数据：注册
	@RequestMapping("/crregister")
	public String courierregister(String cutel, String cuname, int brandid, String cupwd, HttpServletRequest request) {
		Courier courier = new Courier();
		courier.setCuname(cuname);
		courier.setCutel(cutel);
		courier.setBrandid(brandid);
		courier.setCupwd(cupwd);		
		List<Courier> courierslist=courierMapper.selectByExample(null);
		for(Courier c:courierslist){
			if(c.getCutel().equals(cutel)){
				request.setAttribute("msg", "该手机号已被注册！");
				return "user/register";
			}
		}
		int row = courierMapper.insert(courier);
		if(row>0){
			request.setAttribute("msg", "注册成功！");			
			return "user/login";
		}
		else{
			request.setAttribute("msg", "注册失败！");	
			return "user/courierregister";
		}				
	}
		
	// 修改骑手信息
		@RequestMapping("/courierInfo")
		public String courierdelete() {
			return "courierInfo";
		}

	// 删除骑手数据
	@RequestMapping("/crdelete")
	public String courierdelete(int cuid, HttpServletRequest request) {
		int row = courierMapper.deleteByPrimaryKey(cuid);
		System.out.println("删除成功" + row);
		return "forward:showcourier.html";
	}

	// 骑手页面显示delivery
	@RequestMapping("/orderShowDelivery")
	@ResponseBody
	public List<Map<String, Object>> courierShow() {
		// 查询出所有的delivery
		List<Map<String, Object>> list = courierAddMapper.courierDeliveryList();
		System.out.println("执行 showDelivery");
		return list;
	}

	@RequestMapping("/updatecourier")
	public String courierchange(Courier courier,HttpServletRequest request){
		int a = courierMapper.updateByPrimaryKey(courier);
		return "forward:showcourier.html";
	   
	}
	
	// 骑手数据：修改
	@RequestMapping("/changecourier")	
	@ResponseBody
	public List<Branch> showdetail(Model model){		
		return branchMapper.selectByExample(null);
	}


	// 增加骑手数据：注册
	@RequestMapping("/addcourier")
	public String addcourier(Courier courier) {
		int row = courierMapper.insert(courier);
		return "forward:showcourier.html";
	}

	// 骑手接单
	@RequestMapping("/cuAddDelivery")
	public String courierAddOrders(int cuId, int deliveryId, HttpServletRequest request) {
		// 查询出所有的delivery
		System.out.println("cuId"+cuId+"  deliveryId"+deliveryId);
		
		String time = "";
		int breachId = 0;
		// 要把信息，写入到logistics里面，时间是获取当前时间，那 地点信息，是当前网点的位置:通过branch表
		Date nowTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		time = sdf.format(nowTime);
		Courier courier = courierMapper.selectByPrimaryKey(cuId);
		if (courier != null) {
			breachId = courier.getBrandid();
		}
		Branch branch = branchMapper.selectByPrimaryKey(breachId);
		String location = branch.getProvince() + branch.getCity() + branch.getRegion() + branch.getStreet();
		Logistics logistics = new Logistics();
		System.out.println("传入的deliveryId" + deliveryId);
		logistics.setDeliveryid(deliveryId);
		logistics.setDltime(nowTime);
		logistics.setDladdress(location);
		int row = logisticsMapper.insertSelective(logistics);
		// 执行接单操作，订单状态变为已派件
		Orders orders = ordersMapper.selectByPrimaryKey(deliveryId);
		orders.setStatus(5);
		Accessinfo accessinfo = new Accessinfo();
		accessinfo.setDeliveryid(deliveryId);
		accessinfo.setCuid(cuId);
		int row1 = accessinfoMapper.insertSelective(accessinfo);
		System.out.println("插入成功，插入一条新的快递员订单:快递员下面的快递订单" + row1);
		System.out.println("相应的删除delivery表的数据");
		ordersMapper.updateByPrimaryKeySelective(orders);
		return "user/courierchange";

	}
	
	

	@RequestMapping("/cuShowOrders")
	@ResponseBody
	public List<Map<String, Object>> courierShowOrders(int cuId,HttpServletRequest request) {
		List<Map<String, Object>> list = courierAddMapper.courierAddDelivery(cuId);
		System.out.println("执行了骑手展示订单");
		return list;

	}

}
