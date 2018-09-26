package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.chainsaw.Main;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.dao.UserMapper;
import com.etc.entity.Logistics;
import com.etc.entity.Orders;
import com.etc.entity.User;
import com.etc.entity.UserExample;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Controller
public class UserController {
	
	@Resource 
	private UserMapper userMapper;
	
	@RequestMapping("/main")
	public String Main(){
		return "user/index";
	}
	
	@RequestMapping("/order")
	public String order(){
		return "user/orders";
	}
	
	@RequestMapping("/ulogin")
	public String login(){
		return "user/login";
	}
	
	@RequestMapping("/form")
	public String form(HttpServletRequest request){
		System.out.println("在线填写表单");
		User user=(User) request.getSession().getAttribute("user");
		if(user==null){
			request.setAttribute("msg", "请先登录！");
			return "user/login";
		}
		else return "user/onlinedelivery";
	}
	
	@RequestMapping("/process")
	public String process(){
		System.out.println("业务");
		return "user/process";
	}	
	
	
	@RequestMapping("/register")
	public String register(){
		return "user/register";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "user/index";
	}
	
	@RequestMapping("/courierregister")
	public String courierregister(){
		return "user/courierregister";
	}
	
	
	//用户登录验证
	@RequestMapping("/userlogin")
	public String userlogin(String userPhone, String userPwd,int type, HttpServletRequest request){
		System.out.println(type);
		UserExample us=new UserExample();			
		us.createCriteria().andUserphoneEqualTo(userPhone).andUserpwdEqualTo(userPwd).andTypeEqualTo(type);
		List<User> users = userMapper.selectByExample(us);		
		if(users.size()!=1){
			request.setAttribute("msg", "用户名或密码错误！");
			return "user/login";
		}else{	
			request.getSession().invalidate();
			request.getSession().setAttribute("user", users.get(0));
			System.out.println(users.get(0).getNickname());
			return "user/index";			
		}		
	}
	
	//用户登出
	@RequestMapping("/userlogout")
	public String logout(HttpServletRequest request){
		request.setAttribute("msg", "您已安全退出系统");
		request.getSession().invalidate();
		return "user/login";
	} 
	
	
	//用户注册 (验证手机号)
	@RequestMapping("/userregister")
	public String userRegister(String password,String userphone,String type,String email,HttpServletRequest request){
		String nickName="无昵称";		
		int usertype=Integer.parseInt(type);
		List<User> userlist=userMapper.selectByExample(null);
		for(User u:userlist){
			if(u.getUserphone().equals(userphone)){
				request.setAttribute("msg", "该手机号已被注册！");
				return "user/register";
			}
		}
		User user=new User(nickName,password,userphone,email,usertype);		
		int rs=userMapper.insertSelective(user);
		/*System.out.println(rs);*/
		if(rs>0){
			request.setAttribute("msg", "注册成功！");			
			return "user/login";
		}
		else{
			request.setAttribute("msg", "注册失败！");	
			return "user/register";
		}
	}
	
	//修改用户信息
	@RequestMapping("/userupdate")
	public String userUpdate(String nickname,String password,String email,HttpServletRequest request){	
		User user=(User) request.getSession().getAttribute("user");				
		user.setUserpwd(password);	
		user.setNickname(nickname);				
		int rs=userMapper.updateByPrimaryKey(user);
	    if(rs>0){
	    	System.out.println("修改成功！");
	    	return "user/index";
	    }
	    System.out.println("修改失败！");
		return "user/index";
	}
	
	//显示用户信息+修改   (需登录 否则跳转到登录界面)
	@RequestMapping("/userInfo")
	public String userInfo(HttpServletRequest request,Model model){	
		User user=(User) request.getSession().getAttribute("user");
		if(user==null){
			return "user/login";
		}
		model.addAttribute("user",user);
		return "user/userinfo";
	}
	
    
	//后台用户管理界面	
	@RequestMapping("/showuser")
	public String showuser(Model model,HttpServletRequest request){				
			List<User> list=userMapper.selectByExample(null);
			request.getSession().setAttribute("list", list);
		    return "admin/Manageruser";
	}
	@RequestMapping("/adduser")
	public String addprice(Model model,User user){
		int a = userMapper.insert(user);
		return "forward:showuser.html";
	}
	
	@RequestMapping("/changeuser")
	public String changeprice(Model model,User user){
		int a = userMapper.updateByPrimaryKey(user);
		
		return "forward:showuser.html";
	}
	@RequestMapping("/removeuser")
	public String removeprice(Model model,int userid){
	
		int a = userMapper.deleteByPrimaryKey(userid);
		
		return "forward:showuser.html";
	}
    
		
		
}
