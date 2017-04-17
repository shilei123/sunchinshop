package cn.sqhl.shop.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import cn.sqhl.shop.bo.User;

public class Checkfilter extends OncePerRequestFilter {

	protected ServletContext scontext;
	
	protected List urllist=null;
	
	protected void initFilterBean() throws ServletException {
		super.initFilterBean();
		ResourceBundle interfacelist = ResourceBundle.getBundle("interface");
		Enumeration<String> code=interfacelist.getKeys();
		urllist=new ArrayList();
		while(code.hasMoreElements()){
			 String key=code.nextElement();
			 urllist.add(interfacelist.getString(key));
		}
	};
	
	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		String path=request.getRequestURI();
		if(urllist.contains(path)){//是否接口请求
			String source=request.getHeader("Referer");
			if(source!=null && !StringUtils.isEmpty(source)){
				if(source.matches("/interface/main.do")){//判断是否从main进来的
					chain.doFilter(request, response);
				}else{
					response.sendRedirect("/interface/result.do");//返回没有权限
				}
			}else{
				response.sendRedirect("/interface/result.do");//返回没有权限
			}
		}else{//其他请求直接通过
			HttpSession session =request.getSession();
			User user=(User)session.getAttribute("user");
			if(user!=null){				
				chain.doFilter(request, response);
			}else{
				response.sendRedirect("/jsp/login.jsp");//返回注册页面
			}
		}
	}

}
