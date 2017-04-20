package cn.sqhl.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.sqhl.shop.service.UserService;


@Controller
@RequestMapping("/sys")
public class SysController {
	private Logger logger = LogManager.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	public String CheckLogin(HttpServletRequest request,
			@RequestParam(value="account",required=true) String account,
			@RequestParam(value="password",required=true) String password
			) {
		HttpSession session=request.getSession();
//		userService.queryUserByAccount(obj);
		
		return "/jsp/index";
	}

}
