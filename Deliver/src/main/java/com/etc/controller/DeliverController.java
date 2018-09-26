package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.dao.AdminMapper;
import com.etc.dao.OrdersMapper;
import com.etc.entity.Admin;
import com.etc.entity.AdminExample;
import com.etc.entity.Orders;

@Controller
public class DeliverController {
	
	@Resource
	private AdminMapper adminMapper;
	
	@Resource
	private OrdersMapper ordMapper;
	
	@RequestMapping("/deliverview")
	public String view(Model model){
		Orders order =  ordMapper.selectByPrimaryKey(1);
		String start = order.getSendadd();
		String end = order.getAcceptadd();
		model.addAttribute("order",order);
		return "index";
	}

}
