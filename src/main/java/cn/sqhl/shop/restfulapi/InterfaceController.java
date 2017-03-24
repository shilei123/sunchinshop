package cn.sqhl.shop.restfulapi;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sqhl.shop.utils.security.SecurityCore;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/interface")
public class InterfaceController extends ContextInfo {
	private Logger logger = LogManager.getLogger(this.getClass());

	@ResponseBody
	@RequestMapping("/main")
	public JSONObject queryCateGory(HttpServletRequest request,HttpServletResponse response) {
		JSONObject jreturn = null;
		Map basemap = new HashMap();
		try {
			Map requestmap = getRequestMap(request);
			if (SecurityCore.getSignVeryfy(requestmap)) {
				Object servicecode = requestmap.get("servicecode");
				if (servicecode != null) {
					String servcode=servicecode.toString();
					ResourceBundle Iproperties = ResourceBundle.getBundle("interface");
					String url=Iproperties.getString(servcode);
					if(!StringUtils.isEmpty(url)){
						request.setAttribute("map", SecurityCore.paraFilter(requestmap));//因为inputsream只能读取一次 因此将读取到的内容去除 sign sign_type sign_charset 等跟加密相关的内容。存于request等attribute内进行传递 
						request.getRequestDispatcher(url).include(request,response);//forward 传递request  include 传递 request 以及response
						//request.getRequestDispatcher("/system/category/query.do").forward(request,response);
					}
				} else {
					result = "1";// 失败
					message = "无请求内容。";// 错误原因
					data = null;// 错误 data无返回值
					jreturn = new JSONObject();
					basemap.put("ver", ver);
					basemap.put("result", result);
					basemap.put("message", message);
					basemap.put("data", data);

					Map signvalue = SecurityCore.buildRequestPara(basemap);

					jreturn.putAll(signvalue);
				}
			} else {
				result = "1";// 失败
				message = "无法通过验证,请重试。";// 错误原因
				data = null;// 错误 data无返回值
				jreturn = new JSONObject();
				basemap.put("ver", ver);
				basemap.put("result", result);
				basemap.put("message", message);
				basemap.put("data", data);

				Map signvalue = SecurityCore.buildRequestPara(basemap);

				jreturn.putAll(signvalue);
			}
		} catch (Exception e) {
			result = "1";// 失败
			message = "查询出错 ";// 错误原因
			data = null;// 错误 data无返回值
			logger.log(ERROR, "Exception:" + e.getCause().getClass() + ","
					+ e.getCause().getMessage() + " info:" + e.toString());
			jreturn = new JSONObject();
			basemap.put("ver", ver);
			basemap.put("result", result);
			basemap.put("message", message);
			basemap.put("data", data);

			Map signvalue = SecurityCore.buildRequestPara(basemap);

			jreturn.putAll(signvalue);
		}
		return jreturn;
		

	}
	
	
	@ResponseBody
	@RequestMapping("/result")
	public JSONObject returnResult(HttpServletRequest request,HttpServletResponse response) {
			JSONObject jreturn = new JSONObject();
			Map basemap = new HashMap();
		
			result = "1";// 失败
			message = "请求地址不存在。";// 错误原因
			data = null;// 错误 data无返回值
		

			basemap.put("ver", ver);
			basemap.put("result", result);
			basemap.put("message", message);
			basemap.put("data", data);

			Map signvalue = SecurityCore.buildRequestPara(basemap);

			jreturn.putAll(basemap);
			jreturn.putAll(signvalue);
			return jreturn;
		

	}
}
