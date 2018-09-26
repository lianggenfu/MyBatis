package com.etc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.dao.BranchMapper;
import com.etc.dao.OrdersMapper;
import com.etc.dao.TransferMapper;
import com.etc.entity.Branch;
import com.etc.entity.BranchExample;
import com.etc.entity.Orders;
import com.etc.entity.Transfer;
import com.etc.entity.TransferExample;

import utils.mail;

@Controller
public class MapController {
	@Resource 
	private OrdersMapper ordersMapper;
	
	@Resource 
	private TransferMapper tMapper;
	
	@Resource 
	private BranchMapper branchMapper;
	
	@RequestMapping("/mapemail")
	@ResponseBody
	public void mapemail(Model model){
		try {
			mail.sendmail(mail.qqcom);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/changemap")
	@ResponseBody
	public void changemap(Model model){
		ordersMapper.updatemap(mail.deliverid1);
	}
	
	@RequestMapping("/maphello")
	public String map(Model model,Integer deliveryId){
		System.out.println("deliveryId"+deliveryId);
		List<String> citylist = new ArrayList<>();
		Orders order = ordersMapper.selectByPrimaryKey(deliveryId);
		mail.qqcom = order.getAcceptpostcode();
		mail.deliverid1 = order.getDeliveryid();
		String endadd = order.getAcceptadd();
		System.out.println(order.getAcceptdetailadd());
		String  sendadd = order.getSendadd().replace(" ", "");
		citylist.add(sendadd + order.getSenddetailadd());
		String detailendadd = order.getAcceptadd();
		int start = detailendadd.indexOf("市");
		int end = detailendadd.indexOf("区");
		String deld = detailendadd.substring(start+2, end+1);
		
		TransferExample ex = new TransferExample();
		int start1 = order.getAcceptadd().indexOf("省");
		String deld1 = order.getAcceptadd().substring(0,start1+1);
		ex.createCriteria().andTprovinceEqualTo(deld1);
		List<Transfer> tlist = tMapper.selectByExample(ex);
		if(tlist.size() != 0){
			citylist.add(tlist.get(0).getTcity());
		}
		
		
		BranchExample example = new BranchExample();
		example.createCriteria().andRegionEqualTo(deld);
		List<Branch> branchs = branchMapper.selectByExample(example);
		
		Branch b1 = null;
		for(Branch bra : branchs){
			if(order.getAcceptadd().indexOf(bra.getRegion()) != -1){
				b1 = bra;
			}
		}
		System.out.println("i am bi:"+b1);
		if(b1 != null){
			citylist.add(b1.getProvince()+b1.getCity()+b1.getRegion()+b1.getStreet());
		}
		String  acceadd = order.getAcceptadd().replace(" ", "");
		citylist.add(acceadd + order.getAcceptdetailadd());
		for(String string : citylist) {
			System.out.println(string);
		}
		model.addAttribute("citylist", citylist);
		
		if(order.getStatus() == 3 || order.getStatus() == 4){
			return "user/map";
		}
		if(order.getStatus() == 5)
		return "user/map2";
		return "user/map3";
	}
}
