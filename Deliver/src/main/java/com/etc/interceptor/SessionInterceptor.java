package com.etc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class SessionInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
		/*System.out.println("渲染后");*/
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		/*System.out.println("执行时");*/
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		/*HttpSession session=request.getSession();
		String path=request.getServletPath();
		
		if(session.getAttribute("admin")!=null||path.indexOf("login.html")!=-1){
			return true;			
		}
		else{
			request.setAttribute("msg", "请先登录");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return false;
		}*/
		return true;
	}

}
