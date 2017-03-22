package cn.sqhl.shop.restfulapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.service.UserService;
import cn.sqhl.shop.utils.security.SecurityCore;
import cn.sqhl.shop.vo.userCoupon;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


@Controller
@RequestMapping("/user")
public class UserController extends ContextInfo{
	private Logger logger = LogManager.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/userCoupon/query")
	public JSONObject queryDictionary(HttpServletRequest request) {
		JSONObject jreturn = new JSONObject();
		Map basemap = new HashMap();
		Map requestmap=(HashMap)request.getAttribute("map");
		try {
			if(StringUtils.isNotEmpty(requestmap.get("data")+"")){
				JSONObject requestparam=JSON.parseObject(requestmap.get("data").toString());
				if(requestparam!=null && requestparam.size()>0){
					String user_id=requestparam.getString("user_id");
					String user_name=requestparam.getString("user_name");
					String coupon_status=requestparam.getString("coupon_status");
					Integer pagesize=StringUtils.isNotEmpty(requestparam.getString("pagesize"))?(requestparam.getInteger("pagesize")):10;
					Integer nowpage=StringUtils.isNotEmpty(requestparam.getString("nowpage"))?(requestparam.getInteger("nowpage")):0;
				
					PageCond page=new PageCond(pagesize*nowpage, pagesize);
					Map<String, Object> queryparam=new HashMap<String, Object>();
					if(StringUtils.isNotEmpty(user_id)){
						queryparam.put("user_id", user_id);
					}if(StringUtils.isNotEmpty(user_name)){
						queryparam.put("user_name", user_name);
					}if(StringUtils.isNotEmpty(coupon_status)){
						queryparam.put("coupon_status", coupon_status);
					}
					
					List<userCoupon> usercouponlist=userService.queryUserCouponList(page, queryparam);
					if(usercouponlist!=null && usercouponlist.size()>0){
						data=JSON.toJSONString(usercouponlist);
						message="查询成功";//
					}else{
						data=null;
						message="无对应数据";//
					}
					result="0";//成功
				}
			}
		} catch (Exception e) {
			result = "1";// 失败
			message = "查询出错 ";// 错误原因
			data = null;// 错误 data无返回值
			logger.log(ERROR, "Exception:" + e.getCause().getClass() + ","
					+ e.getCause().getMessage() + " info:" + e.toString());
		}

		basemap.put("ver", ver);
		basemap.put("result", result);
		basemap.put("message", message);
		basemap.put("data", data);

		Map signvalue = SecurityCore.buildRequestPara(basemap);

		jreturn.putAll(signvalue);
		
		logger.log(INFO,"request Encrypt info :  "+jreturn.toString());
		return jreturn;
	}
}