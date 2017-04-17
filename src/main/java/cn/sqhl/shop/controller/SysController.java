package cn.sqhl.shop.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/sys")
public class SysController {
	private Logger logger = LogManager.getLogger(this.getClass());
	
	@ResponseBody
	@RequestMapping("/login")
	public String CheckLogin(HttpServletRequest request) {
		return "/jsp/index";
	}

}
