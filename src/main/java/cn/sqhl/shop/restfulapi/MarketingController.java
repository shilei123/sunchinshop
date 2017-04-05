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
import cn.sqhl.shop.vo.Advertise;
import cn.sqhl.shop.vo.Events;
import cn.sqhl.shop.vo.EventsGoods;
import cn.sqhl.shop.service.MarketingService;
import cn.sqhl.shop.utils.security.SecurityCore;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


@Controller
@RequestMapping("/Marketing")
public class MarketingController extends ContextInfo{
	private Logger logger = LogManager.getLogger(this.getClass());
	
	@Autowired
	private MarketingService marketingService;
	
	@ResponseBody
	@RequestMapping("/advert/query")
	public JSONObject queryAdvert(HttpServletRequest request) {
		JSONObject jreturn = new JSONObject();
		Map basemap = new HashMap();
		Map requestmap=(HashMap)request.getAttribute("map");
		try {
			if(StringUtils.isNotEmpty(requestmap.get("data")+"")){
				JSONObject requestparam=JSON.parseObject(requestmap.get("data").toString());
				if(requestparam!=null && requestparam.size()>0){

					String kind=requestparam.getString("kind");
					String location=requestparam.getString("location");
					String type=requestparam.getString("type");
					String start_time=requestparam.getString("start_time");
					String end_time=requestparam.getString("end_time");
					String isuse=requestparam.getString("isuse");
					Integer pagesize=StringUtils.isNotEmpty(requestparam.getString("pagesize"))?(requestparam.getInteger("pagesize")):10;
					Integer nowpage=StringUtils.isNotEmpty(requestparam.getString("nowpage"))?(requestparam.getInteger("nowpage")):0;
				
					PageCond page=new PageCond(pagesize*nowpage, pagesize);
					Map<String, Object> queryparam=new HashMap<String, Object>();
					
					if(StringUtils.isNotEmpty(kind)){
						queryparam.put("kind", kind);
					}if(StringUtils.isNotEmpty(location)){
						queryparam.put("location", location);
					}if(StringUtils.isNotEmpty(type)){
						queryparam.put("type", type);
					}
					if(StringUtils.isNotEmpty(start_time)){
						queryparam.put("start_time", start_time);
					}
					if(StringUtils.isNotEmpty(end_time)){
						queryparam.put("end_time", end_time);
					}
					if(StringUtils.isNotEmpty(isuse)){
						queryparam.put("isuse", isuse);
					}
					
					List<Advertise> useradvertlist=marketingService.queryAdvertList(page, queryparam);
					if(useradvertlist!=null && useradvertlist.size()>0){
						data=JSON.toJSONString(useradvertlist);
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
	
	@ResponseBody
	@RequestMapping("/event/query")
	public JSONObject queryEvent(HttpServletRequest request) {
		JSONObject jreturn = new JSONObject();
		Map basemap = new HashMap();
		Map requestmap=(HashMap)request.getAttribute("map");
		try {
			if(StringUtils.isNotEmpty(requestmap.get("data")+"")){
				JSONObject requestparam=JSON.parseObject(requestmap.get("data").toString());
				if(requestparam!=null && requestparam.size()>0){
					
					String event_name=requestparam.getString("event_name");
					String event_id=requestparam.getString("event_id");
					String start_time=requestparam.getString("start_time");
					String end_time=requestparam.getString("end_time");
					String isuse=requestparam.getString("isuse");
					Integer pagesize=StringUtils.isNotEmpty(requestparam.getString("pagesize"))?(requestparam.getInteger("pagesize")):10;
					Integer nowpage=StringUtils.isNotEmpty(requestparam.getString("nowpage"))?(requestparam.getInteger("nowpage")):0;
				
					PageCond page=new PageCond(pagesize*nowpage, pagesize);
					Map<String, Object> queryparam=new HashMap<String, Object>();
					if(StringUtils.isNotEmpty(event_name)){
						queryparam.put("event_name", event_name);
					}if(StringUtils.isNotEmpty(event_id)){
						queryparam.put("event_id", event_id);
					}if(StringUtils.isNotEmpty(start_time)){
						queryparam.put("start_time", start_time);
					}if(StringUtils.isNotEmpty(end_time)){
						queryparam.put("end_time", end_time);
					}if(StringUtils.isNotEmpty(isuse)){
						queryparam.put("isuse", isuse);
					}
					
					List<Events> usereventlist=marketingService.queryEventList(page, queryparam);
					if(usereventlist!=null && usereventlist.size()>0){
						data=JSON.toJSONString(usereventlist);
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
	
	@ResponseBody
	@RequestMapping("/event/querydetail")
	public JSONObject queryEventDetail(HttpServletRequest request) {
		//TODO 待补全
		JSONObject jreturn = new JSONObject();
		Map basemap = new HashMap();
		Map requestmap=(HashMap)request.getAttribute("map");
		try {
			if(StringUtils.isNotEmpty(requestmap.get("data")+"")){
				JSONObject requestparam=JSON.parseObject(requestmap.get("data").toString());
				if(requestparam!=null && requestparam.size()>0){
					
					String event_name=requestparam.getString("event_name");
					String event_id=requestparam.getString("event_id");
					String start_time=requestparam.getString("start_time");
					String end_time=requestparam.getString("end_time");
					Integer pagesize=StringUtils.isNotEmpty(requestparam.getString("pagesize"))?(requestparam.getInteger("pagesize")):10;
					Integer nowpage=StringUtils.isNotEmpty(requestparam.getString("nowpage"))?(requestparam.getInteger("nowpage")):0;
				
					PageCond page=new PageCond(pagesize*nowpage, pagesize);
					Map<String, Object> queryparam=new HashMap<String, Object>();
					if(StringUtils.isNotEmpty(event_name)){
						queryparam.put("event_name", event_name);
					}if(StringUtils.isNotEmpty(event_id)){
						queryparam.put("event_id", event_id);
					}if(StringUtils.isNotEmpty(start_time)){
						queryparam.put("start_time", start_time);
					}if(StringUtils.isNotEmpty(end_time)){
						queryparam.put("end_time", end_time);
					}
					
					List<EventsGoods> usereventdetaillist=marketingService.queryEventDetailList(page, queryparam);
					if(usereventdetaillist!=null && usereventdetaillist.size()>0){
						data=JSON.toJSONString(usereventdetaillist);
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
