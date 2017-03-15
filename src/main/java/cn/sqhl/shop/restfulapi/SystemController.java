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
import cn.sqhl.shop.filter.service.SystemService;
import cn.sqhl.shop.utils.security.SecurityCore;
import cn.sqhl.shop.vo.category;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/system")
public class SystemController extends ContextInfo {

	private Logger logger = LogManager.getLogger(this.getClass());

	@Autowired
	SystemService systemService;
	/***
	 * 分类查询接口
	 * 
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/category/query")
	public JSONObject queryCateGory(HttpServletRequest request) {
		JSONObject jreturn = new JSONObject();
		Map basemap = new HashMap();
		Map requestmap=(HashMap)request.getAttribute("map");
		try {
			if(StringUtils.isNotEmpty(requestmap.get("data")+"")){
				JSONObject requestparam=JSON.parseObject(requestmap.get("data").toString());
				if(requestparam!=null && requestparam.size()>0){
					String level=requestparam.getString("level");
					String parent_id=requestparam.getString("parent_id");
					Integer pagesize=StringUtils.isNotEmpty(requestparam.getString("pagesize"))?(requestparam.getInteger("pagesize")):10;
					Integer nowpage=StringUtils.isNotEmpty(requestparam.getString("nowpage"))?(requestparam.getInteger("nowpage")):0;
				
					PageCond page=new PageCond(pagesize*nowpage, pagesize);
					Map<String, Object> queryparam=new HashMap<String, Object>();
					if(StringUtils.isNotEmpty(level)){
						queryparam.put("level", level);
					}if(StringUtils.isNotEmpty(parent_id)){
						queryparam.put("parent_id", parent_id);
					}
					
					List<category> categorylist=systemService.queryCategoryList(page, queryparam);
					if(categorylist!=null && categorylist.size()>0){
						data=JSON.toJSONString(categorylist);
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
