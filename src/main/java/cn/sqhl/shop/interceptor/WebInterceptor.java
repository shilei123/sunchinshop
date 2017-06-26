package cn.sqhl.shop.interceptor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.sqhl.shop.bo.User;

public class WebInterceptor implements HandlerInterceptor {
	

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//TODO 排除需要进行身份验证的链接.到时候具体的可以修改
		ResourceBundle exclusionlinkslist = ResourceBundle.getBundle("exclusionlinks");
		Enumeration<String> linkcode=exclusionlinkslist.getKeys();
		List unchecklist=new ArrayList();
		while(linkcode.hasMoreElements()){
			 String key=linkcode.nextElement();
			 unchecklist.add(exclusionlinkslist.getString(key));
		}
		String path=request.getRequestURI();
		if(unchecklist.contains(path)){
			return true;
		}else{				
			HttpSession session =request.getSession();
			User user=(User)session.getAttribute("user");
			if(user!=null){				
				return true;
			}else{
				request.getRequestDispatcher("/main/login.action").forward(request, response);
			}
		}
        return false;
	}

}
