package cn.sqhl.shop.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/main")
public class IndexController {
	private Logger logger = LogManager.getLogger(this.getClass());
	
	
	@RequestMapping("index")
	public String IndexPage(HttpServletRequest request) {
		
		
		return "/jsp/index";
	}
	
	
	@RequestMapping("login")
	public String LoginPage(HttpServletRequest request) {
		
		
		
		
		return "/jsp/authority/signin";
	}

}
