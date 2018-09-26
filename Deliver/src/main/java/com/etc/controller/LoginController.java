package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.dao.AdminMapper;
import com.etc.entity.Admin;
import com.etc.entity.AdminExample;

@Controller
public class LoginController {
	
	@Resource
	private AdminMapper adminMapper;
	
	@RequestMapping("/login")
	public String login(String adminname, String password, HttpServletRequest request){
		AdminExample ae = new AdminExample();
		ae.createCriteria().andAdminnameEqualTo(adminname).andAdminpwdEqualTo(password);
		List<Admin> admins = adminMapper.selectByExample(ae);
		if(admins.size()!=1){
			request.setAttribute("msg", "用户名或密码错误！");
			return "../../login";
		}else{			
			request.getSession().setAttribute("admin", admins.get(0));
			return "admin/Manageruser";
		}
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		request.setAttribute("msg", "您已安全退出系统");
		request.getSession().invalidate();
		return "../../login";
	}

}
