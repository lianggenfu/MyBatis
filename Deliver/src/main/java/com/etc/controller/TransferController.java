package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.dao.TransferMapper;
import com.etc.entity.Transfer;

@Controller
public class TransferController {
	@Resource
	public TransferMapper tMapper;
	
	@RequestMapping("/showalltransfer")
	public String show(Model model){
		List<Transfer> list = tMapper.selectByExample(null);
		model.addAttribute("transferlist", list);
		return "admin/ManagerTransfer";
	}
	
	@RequestMapping("/gettransfer")
	@ResponseBody
	public List<Transfer> gettransfer(){
		List<Transfer> list = tMapper.selectByExample(null);
		return list;
	}
	
	@RequestMapping("/maptransfer")
	public String showmap(Model model,Transfer transfer){
		return "user/wangdianmap";
	}
	
	@RequestMapping("/changetransfer")
	public String changet(Model model,Transfer transfer){
		int a = tMapper.updateByPrimaryKey(transfer);	
		return "forward:showalltransfer.html";
	}
		
	@RequestMapping("/addtransfer")
	public String add(Model model,Transfer transfer){
		int a = tMapper.insert(transfer);
		return "forward:showalltransfer.html";
	}
	
	@RequestMapping("/deletetransfer")
	public String delete(Model model,int tid){
		int a = tMapper.deleteByPrimaryKey(tid);
		return "forward:showalltransfer.html";
	}

}
