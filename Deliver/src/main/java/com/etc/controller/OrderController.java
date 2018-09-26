package com.etc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.Resource;
import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.dao.CourierAddMapper;
import com.etc.dao.LogisticsMapper;
import com.etc.dao.OrdersMapper;
import com.etc.dao.PriceMapper;
import com.etc.entity.Logistics;
import com.etc.entity.Orders;
import com.etc.entity.Price;
import com.etc.entity.PriceExample;
import com.etc.entity.User;


@Controller
public class OrderController {
	static int count=0;
	
	@Resource 
	private OrdersMapper ordersMapper;
	
	@Resource
	private LogisticsMapper logisticsMapper;
	
	@Resource
	private PriceMapper priceMapper;
	
	@Resource
	private CourierAddMapper courierAddMapper;

	@RequestMapping("/orderlist")
	public String orderlist(Model model){
		List<Orders> list = ordersMapper.selectByExample(null);
		model.addAttribute("list",list);
		return "admin/ManagerOrder";
	}
	
	//修改订单(管理员)
	@RequestMapping("/changeorder")
	public String changeprice(Model model,Orders order){
		int a = ordersMapper.updateByPrimaryKeySelective(order);		
		return "forward:orderlist.html";
	}
	
	@RequestMapping("/removeorder")
	public String removeprice(Model model,int deliveryid){
		int a = ordersMapper.deleteByPrimaryKey(deliveryid);
		return "forward:orderlist.html";
	} 
	
	@RequestMapping("/showorder")
	public String showOrders( Model model,HttpServletRequest request){		
		int userid=((User) request.getSession().getAttribute("user")).getUserid();
		/*System.out.println(userid);*/
		List<Orders> list= ordersMapper.selectByUserId(userid);
		request.getSession().setAttribute("list", list);
	    return "showorders";
	}
	
	@RequestMapping("/showorder2")
	public String showOrders2( Model model,HttpServletRequest request){		
		int userid=((User) request.getSession().getAttribute("user")).getUserid();
		/*System.out.println(userid);*/
		List<Orders> list= ordersMapper.selectByUserId(userid);
		request.getSession().setAttribute("list", list);
	    return "user/claimsapply"; 
	}
	
	@RequestMapping("/showorderdetail")
	public String showOrderDetail(Model model,int deliveryid){
		Orders orders=ordersMapper.selectByPrimaryKey(deliveryid);
		model.addAttribute("orderdetail",orders);		
		/*for(Orders orde : orders){
			System.out.println(orde.getAcceptadd());
		}*/
		return "orderdetail";
	}
	
    //生成订单
	@RequestMapping("/addorders")
	public String insertOrders(String sendname,String sendphone,String sendpostcode,String senddetailadd,
			String acceptname,String acceptphone,String acceptpostcode,String acceptdetailadd, String type,
			float weight,String isinsurance,int insuranceprice,int payment,String sendadd,String acceptadd,
			HttpServletRequest request,String startadd,String endadd,Model model) throws InterruptedException{				
		Orders order=new Orders();
		order.setSendname(sendname);
		order.setSendphone(sendphone);
		order.setSendpostcode(sendpostcode);
		order.setSenddetailadd(senddetailadd);
		order.setAcceptname(acceptname);
		order.setAcceptphone(acceptphone);
		order.setAcceptpostcode(acceptpostcode);
		order.setAcceptdetailadd(acceptdetailadd);
		order.setType(type);
		order.setWeight(weight);
		order.setIsinsurance(isinsurance);
		order.setInsuranceprice(insuranceprice);
		order.setPayment(payment);
		order.setSendadd(sendadd);
		order.setAcceptadd(acceptadd);
		//生成时间
		long time=System.currentTimeMillis();
		Date date=new Date(time);
		String ma="yyMMddhhmm";
		SimpleDateFormat forma=new SimpleDateFormat(ma);
		String nwdate=forma.format(date);
		int a=Integer.parseInt(nwdate);
		order.setDeliveryid(a);				
		//用户查询价格函数 
		PriceExample example = new PriceExample();
		System.out.println("startadd"+startadd+"   endadd"+endadd);
		example.createCriteria().andEndaddEqualTo(endadd).andStartaddEqualTo(startadd);
		List<Price> pricelist = priceMapper.selectByExample(example);
		System.out.println(pricelist);			
		Price price1=pricelist.get(0);
		System.out.println(price1);
		double money=0;
		if(weight>1){
			money=(weight-1)*price1.getPerkgprice()+price1.getFirstkgprice();
		}else{
			money=price1.getFirstkgprice();
		}
		order.setMoney(money);
					
		int userid=((User) request.getSession().getAttribute("user")).getUserid();
		System.out.println("userid:"+userid);
		order.setUserid(userid);		
		order.setStatus(1);
		order.setTransportation(1);
		/*0810生成订单就生成物流*/		
		ordersMapper.insert(order);	
		Logistics logistics=new Logistics();
		logistics.setDeliveryid(a);
		logistics.setDltime(date);
		logistics.setDladdress(sendadd);
		logisticsMapper.insert(logistics);

			
		Timer timer = new Timer();	
		TimerTask task = new TimerTask() {
			public void run() {				
				doWork();								 
			}					
			private void doWork() {
				// TODO Auto-generated method stub
				ordersMapper.updatemap(order.getDeliveryid());
				count++;
				if(count>2) {
					System.gc();
		            cancel();
				}
			}
		};
		timer.schedule(task, 1000, 8000);			
		return "user/index";
	}
	@RequestMapping("/search")
	public String test(Orders order){
		return "user/search";
	}
	@RequestMapping("/logistics")
	public String showLogistics(int deliveryid,HttpServletRequest request){		
		//获取物流详情		
		List<Logistics> logistics= logisticsMapper.selectByDeliveryId(deliveryid);
		request.setAttribute("logistics",logistics);
		//获取快递状态
		Orders orders=ordersMapper.selectByPrimaryKey(deliveryid);
		request.setAttribute("deliverystatus", orders);
		return "user/search";
	}
	@RequestMapping("userorders")
	@ResponseBody
	public List<Map<String, Object>> userorder(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		int userId = user.getUserid();
		List<Map<String, Object>> list = courierAddMapper.userorders(userId);
		System.out.println("listsize"+list.size());
		return list;
	}
	@RequestMapping("userorders1")	
	public String userorders(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if(user==null) {
			return "user/login";
		}
		else {
		return "user/userorders";
		}
	}
	
}

