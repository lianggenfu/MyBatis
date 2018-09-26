package com.etc.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.dao.ClaimMapper;
import com.etc.entity.Claim;

import utils.ImgWriteUtil;
import utils.UploadUtil;

@Controller
public class ClaimController {
	@Resource
	public ClaimMapper cMapper;
	
	@RequestMapping("/showclaimlist")
	public String show(Model model){
		List<Claim> list = cMapper.selectByExample(null);
		model.addAttribute("claimlist", list);
		return "admin/ManagerClaimlist";
	}
	
	@RequestMapping("/changeclaim")
	public String changet(Model model,Claim claim){
		int a = cMapper.updateByPrimaryKeySelective(claim);	
		return "forward:showclaimlist.html";
	}
	
	@RequestMapping("/addclaim")
	public String changeProductInfo(HttpServletRequest request,Claim claim,Model model,HttpSession session
			) throws FileNotFoundException{
		UploadUtil uploadUtil = new UploadUtil(request);
		//获取表单中的值
		int deliveryid = Integer.valueOf(uploadUtil.getParameter("deliveryid"));
		
		String phone = uploadUtil.getParameter("phone");
		String reason  = uploadUtil.getParameter("reason");
		String reasondetail  = uploadUtil.getParameter("reasondetail");
		String picture = uploadUtil.getParameter("picture");	
		claim.setDeliveryid(deliveryid);
		claim.setPhone(phone);
		claim.setReason(reason);
		claim.setReasondetail(reasondetail);
		
		BufferedInputStream inputStream = uploadUtil.getInputStream("picture");
		String fileName  = uploadUtil.getFileName("picture");
		
		Calendar calendar = Calendar.getInstance();
		String name1 = String.valueOf(calendar.getTimeInMillis()) + fileName.substring(fileName.lastIndexOf(".") ,fileName.length());
		claim.setPicture(name1);
		String path = request.getRealPath("/images") + "/" + name1;
		File file = new File(path);
		
		OutputStream outStream = new FileOutputStream(file);
		BufferedOutputStream  outputStream = new BufferedOutputStream(outStream) ;
		System.out.println(claim.getPicture());
		ImgWriteUtil imgUtil = new ImgWriteUtil();
		imgUtil.writeImg(inputStream, outputStream);
		int a = cMapper.insertSelective(claim);		
		return "forward:showalltransfer.html";
	}
	
	
	@RequestMapping("/deleteclaim")
	public String delete(Model model,int deliveryid){
		int a = cMapper.deleteByPrimaryKey(deliveryid);
		return "forward:showalltransfer.html";
	}

}
