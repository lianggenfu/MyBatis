package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.dao.PriceMapper;
import com.etc.entity.Price;
import com.etc.entity.PriceExample;

@Controller
public class PriceController {
	@Resource
	private PriceMapper priceMapper;
	
	@RequestMapping("/showprice")
	public String price(Model model){
		List<Price> list = priceMapper.selectByExample(null);
		model.addAttribute("list",list);
		return "admin/ManagerPrice";
	}
	
	@RequestMapping("/showpriceBy")
	public String showpriceby(Model model,String startadd,String endadd){
		PriceExample example = new PriceExample();
		example.createCriteria().andEndaddEqualTo(endadd).andStartaddEqualTo(startadd);
		List<Price> price = priceMapper.selectByExample(example);
		Price price1 = price.get(0);
		model.addAttribute("price",price1);
		return "admin/ManagerPrice";
	}
	
	@RequestMapping("/addprice")
	public String addprice(Model model,Price price){
		int a = priceMapper.insert(price);
		return "forward:showprice.html";
	}
	
	@RequestMapping("/changeprice")
	public String changeprice(Model model,Price price){
		int a = priceMapper.updateByPrimaryKey(price);
		
		return "forward:showprice.html";
	}
	@RequestMapping("/removeprice")
	public String removeprice(Model model,int priceid){
		
		int a = priceMapper.deleteByPrimaryKey(priceid);		
		return "forward:showprice.html";
	}
	
	
	@RequestMapping("/searchprice")
	@ResponseBody
	public Double seachpriceby(Model model,String startadd,String endadd,float weight){
		PriceExample example = new PriceExample();
		System.out.println("endadd"+endadd);
		example.createCriteria().andEndaddEqualTo(endadd).andStartaddEqualTo(startadd);
		List<Price> price = priceMapper.selectByExample(example);
		Price price1 = price.get(0);
		double money=0;
		if(weight>1){
			money=(weight-1)*price1.getPerkgprice()+price1.getFirstkgprice();
		}else{
			money=price1.getFirstkgprice();
		}
		return money;
	}
}
