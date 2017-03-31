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

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.service.PayService;
import cn.sqhl.shop.utils.security.SecurityCore;
import cn.sqhl.shop.vo.Purse;

@Controller
@RequestMapping("/pay")
public class PayController extends ContextInfo{

	private Logger logger = LogManager.getLogger(this.getClass());
	
	@Autowired
	PayService payService;
	
	@ResponseBody
	@RequestMapping("/exchangerecord")
	public JSONObject queryExchangerecord(HttpServletRequest request) {
		JSONObject jreturn = new JSONObject();
		Map basemap = new HashMap();
		Map requestmap=(HashMap)request.getAttribute("map");
		try {
			if(StringUtils.isNotEmpty(requestmap.get("data")+"")){
				JSONObject requestparam=JSON.parseObject(requestmap.get("data").toString());
				if(requestparam!=null && requestparam.size()>0){
					String Btime=requestparam.getString("Btime");
					String Etime=requestparam.getString("Etime");
					String Bamount=requestparam.getString("Bamount");
					String Eamount=requestparam.getString("Eamount");
					String userid=requestparam.getString("userid");
					String way=requestparam.getString("way");
					String type=requestparam.getString("type");
					String kind=requestparam.getString("kind");
					String status=requestparam.getString("status");
					
					Integer pagesize=StringUtils.isNotEmpty(requestparam.getString("pagesize"))?(requestparam.getInteger("pagesize")):10;
					Integer nowpage=StringUtils.isNotEmpty(requestparam.getString("nowpage"))?(requestparam.getInteger("nowpage")):0;
				
					PageCond page=new PageCond(pagesize*nowpage, pagesize);
					Map<String, Object> queryparam=new HashMap<String, Object>();
					if(StringUtils.isNotEmpty(Btime)){
						queryparam.put("Btime", Btime);
					}if(StringUtils.isNotEmpty(Etime)){
						queryparam.put("Etime", Etime);
					}if(StringUtils.isNotEmpty(Bamount)){
						queryparam.put("Bamount", Bamount);
					}
					if(StringUtils.isNotEmpty(Eamount)){
						queryparam.put("Eamount", Eamount);
					}
					if(StringUtils.isNotEmpty(userid)){
						queryparam.put("userid", userid);
					}
					if(StringUtils.isNotEmpty(way)){
						queryparam.put("way", way);
					}
					if(StringUtils.isNotEmpty(type)){
						queryparam.put("type", type);
					}
					if(StringUtils.isNotEmpty(kind)){
						queryparam.put("kind", kind);
					}
					if(StringUtils.isNotEmpty(status)){
						queryparam.put("status", status);
					}
					
					List<Purse> purselist=payService.queryPurseList(page, queryparam);
					if(purselist!=null && purselist.size()>0){
						data=JSON.toJSONString(purselist);
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
