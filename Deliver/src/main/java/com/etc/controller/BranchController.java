package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.dao.BranchMapper;
import com.etc.entity.Branch;

@Controller
public class BranchController {
	@Resource
	private BranchMapper bMapper;
	
	@RequestMapping("/getbranch")
	@ResponseBody
	public List<Branch> getbranch(){
		return bMapper.selectByExample(null);
	}
	
	@RequestMapping("/showbranch")
	public String showbranch(){
		return "user/wangdianmap1";
	}
}
