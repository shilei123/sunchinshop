package cn.sqhl.shop.restfulapi;

import java.util.ArrayList;
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
import cn.sqhl.shop.service.SystemService;
import cn.sqhl.shop.utils.security.SecurityCore;
import cn.sqhl.shop.vo.CategoryPropertyValue;
import cn.sqhl.shop.vo.GoodsPropertyValue;
import cn.sqhl.shop.vo.Brand;
import cn.sqhl.shop.vo.Category;
import cn.sqhl.shop.vo.Dictionary;

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
					
					List<Category> categorylist=systemService.queryCategoryList(page, queryparam);
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
	
	@ResponseBody
	@RequestMapping("/dictionary/query")
	public JSONObject queryDictionary(HttpServletRequest request) {
		JSONObject jreturn = new JSONObject();
		Map basemap = new HashMap();
		Map requestmap=(HashMap)request.getAttribute("map");
		try {
			if(StringUtils.isNotEmpty(requestmap.get("data")+"")){
				JSONObject requestparam=JSON.parseObject(requestmap.get("data").toString());
				if(requestparam!=null && requestparam.size()>0){
					String type=requestparam.getString("type");
					String pcode=requestparam.getString("pcode");
					Integer pagesize=StringUtils.isNotEmpty(requestparam.getString("pagesize"))?(requestparam.getInteger("pagesize")):10;
					Integer nowpage=StringUtils.isNotEmpty(requestparam.getString("nowpage"))?(requestparam.getInteger("nowpage")):0;
				
					PageCond page=new PageCond(pagesize*nowpage, pagesize);
					Map<String, Object> queryparam=new HashMap<String, Object>();
					if(StringUtils.isNotEmpty(type)){
						queryparam.put("type", type);
					}if(StringUtils.isNotEmpty(pcode)){
						queryparam.put("pcode", pcode);
					}
					
					List<Dictionary> dictionarylist=systemService.queryDictionaryList(page, queryparam);
					if(dictionarylist!=null && dictionarylist.size()>0){
						data=JSON.toJSONString(dictionarylist);
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
	@RequestMapping("/brand/query")
	public JSONObject queryBrand(HttpServletRequest request) {
		JSONObject jreturn = new JSONObject();
		Map basemap = new HashMap();
		Map requestmap=(HashMap)request.getAttribute("map");
		try {
			if(StringUtils.isNotEmpty(requestmap.get("data")+"")){
				JSONObject requestparam=JSON.parseObject(requestmap.get("data").toString());
				if(requestparam!=null && requestparam.size()>0){
					String brand_id=requestparam.getString("brand_id");
					String brand_name=requestparam.getString("brand_name");
					String cate_id=requestparam.getString("cate_id");
					Integer pagesize=StringUtils.isNotEmpty(requestparam.getString("pagesize"))?(requestparam.getInteger("pagesize")):10;
					Integer nowpage=StringUtils.isNotEmpty(requestparam.getString("nowpage"))?(requestparam.getInteger("nowpage")):0;
				
					PageCond page=new PageCond(pagesize*nowpage, pagesize);
					Map<String, Object> queryparam=new HashMap<String, Object>();
					if(StringUtils.isNotEmpty(brand_id)){
						queryparam.put("brand_id", brand_id);
					}if(StringUtils.isNotEmpty(brand_name)){
						queryparam.put("brand_name", brand_name);
					}if(StringUtils.isNotEmpty(cate_id)){
						queryparam.put("cate_id", cate_id);
					}
					
					List<Brand> brandlist=systemService.queryBrandList(page, queryparam);
					if(brandlist!=null && brandlist.size()>0){
						data=JSON.toJSONString(brandlist);
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
	@RequestMapping("/ga/query")
	public JSONObject queryGoodsProperty(HttpServletRequest request) {
		JSONObject jreturn = new JSONObject();
		Map basemap = new HashMap();
		Map requestmap=(HashMap)request.getAttribute("map");
		try {
			if(StringUtils.isNotEmpty(requestmap.get("data")+"")){
				JSONObject requestparam=JSON.parseObject(requestmap.get("data").toString());
				if(requestparam!=null && requestparam.size()>0){
					String goods_id=requestparam.getString("goods_id");
					
					Map<String, Object> queryparam=new HashMap<String, Object>();
					if(StringUtils.isNotEmpty(goods_id)){
						queryparam.put("goods_id", goods_id);
					}
					
					List<GoodsPropertyValue> goods_property_value=systemService.queryGoodsPropertyList(queryparam);
					List listproperty=new ArrayList();
					if(goods_property_value!=null && goods_property_value.size()>0){
						Map<String,Object> resultmap=new HashMap<String, Object>();
						String property_id="";
						List<Map<String, Object>> arraylist=new ArrayList<Map<String,Object>>();
						for(int i = 0;i<goods_property_value.size();i++){
							GoodsPropertyValue cpv=goods_property_value.get(i);
							
							if(i+1==goods_property_value.size()){
								Map map=new HashMap();
								map.put("id", cpv.getId());
								map.put("propertyvalue_id", cpv.getPropertyvalue_id());
								map.put("propertyvalue_code", cpv.getPropertyvalue_code());
								map.put("propertyvalue", cpv.getPropertyvalue());
								arraylist.add(map);
								resultmap.put("propertyvalue", arraylist);
								listproperty.add(resultmap);
								arraylist=new ArrayList<Map<String,Object>>();
								resultmap=new HashMap<String, Object>();
							}else{
								if(property_id.equals("")){
									property_id=cpv.getProperty_id();
									//Map propertymap=new HashMap();
									resultmap.put("goods_id", cpv.getGoods_id());
									resultmap.put("type", cpv.getType());//spu sku 
									resultmap.put("property_id", cpv.getProperty_id());
									resultmap.put("property_code", cpv.getProperty_code());
									resultmap.put("property", cpv.getProperty());
									
									Map map=new HashMap();
									map.put("id", cpv.getId());
									map.put("propertyvalue_id", cpv.getPropertyvalue_id());
									map.put("propertyvalue_code", cpv.getPropertyvalue_code());
									map.put("propertyvalue", cpv.getPropertyvalue());
									arraylist.add(map);
									//resultmap.put("property", propertymap);
								}else{
									if(property_id.equals(cpv.getProperty_id())){
										Map map=new HashMap();
										map.put("id", cpv.getId());
										map.put("propertyvalue_id", cpv.getPropertyvalue_id());
										map.put("propertyvalue_code", cpv.getPropertyvalue_code());
										map.put("propertyvalue", cpv.getPropertyvalue());
										arraylist.add(map);
										
									}else{
										resultmap.put("propertyvalue", arraylist);
										listproperty.add(resultmap);
										arraylist=new ArrayList<Map<String,Object>>();
										resultmap=new HashMap<String, Object>();
										resultmap.put("goods_id", cpv.getGoods_id());
										resultmap.put("type", cpv.getType());//spu sku 
										resultmap.put("property_id", cpv.getProperty_id());
										resultmap.put("property_code", cpv.getProperty_code());
										resultmap.put("property", cpv.getProperty());
										property_id=cpv.getProperty_id();
										
										Map map=new HashMap();
										map.put("id", cpv.getId());
										map.put("propertyvalue_id", cpv.getPropertyvalue_id());
										map.put("propertyvalue_code", cpv.getPropertyvalue_code());
										map.put("propertyvalue", cpv.getPropertyvalue());
										arraylist.add(map);
									}
								}
								
							}
							
						}
						
						
						data=JSON.toJSONString(listproperty);
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
	@RequestMapping("/ca/query")
	public JSONObject queryCategoryProperty(HttpServletRequest request) {
		JSONObject jreturn = new JSONObject();
		Map basemap = new HashMap();
		Map requestmap=(HashMap)request.getAttribute("map");
		try {
			if(StringUtils.isNotEmpty(requestmap.get("data")+"")){
				JSONObject requestparam=JSON.parseObject(requestmap.get("data").toString());
				if(requestparam!=null && requestparam.size()>0){
					String category_id=requestparam.getString("category_id");
				
					Map<String, Object> queryparam=new HashMap<String, Object>();
					if(StringUtils.isNotEmpty(category_id)){
						queryparam.put("category_id", category_id);
					}
					
					List<CategoryPropertyValue> category_property_value=systemService.queryCategoryPropertyList(queryparam);
					List listproperty=new ArrayList();
					if(category_property_value!=null && category_property_value.size()>0){
						Map<String,Object> resultmap=new HashMap<String, Object>();
						String property_id="";
						List<Map<String, Object>> arraylist=new ArrayList<Map<String,Object>>();
						for(int i = 0;i<category_property_value.size();i++){
							CategoryPropertyValue cpv=category_property_value.get(i);
							
							if(i+1==category_property_value.size()){
								Map map=new HashMap();
								map.put("id", cpv.getId());
								map.put("propertyvalue_id", cpv.getPropertyvalue_id());
								map.put("propertyvalue_code", cpv.getPropertyvalue_code());
								map.put("propertyvalue", cpv.getPropertyvalue());
								arraylist.add(map);
								resultmap.put("propertyvalue", arraylist);
								listproperty.add(resultmap);
								arraylist=new ArrayList<Map<String,Object>>();
								resultmap=new HashMap<String, Object>();
							}else{
								if(property_id.equals("")){
									property_id=cpv.getProperty_id();
									//Map propertymap=new HashMap();
									resultmap.put("category_id", cpv.getCategory_id());
									resultmap.put("property_id", cpv.getProperty_id());
									resultmap.put("property_code", cpv.getProperty_code());
									resultmap.put("property", cpv.getProperty());
									
									Map map=new HashMap();
									map.put("id", cpv.getId());
									map.put("propertyvalue_id", cpv.getPropertyvalue_id());
									map.put("propertyvalue_code", cpv.getPropertyvalue_code());
									map.put("propertyvalue", cpv.getPropertyvalue());
									arraylist.add(map);
									//resultmap.put("property", propertymap);
								}else{
									if(property_id.equals(cpv.getProperty_id())){
										Map map=new HashMap();
										map.put("id", cpv.getId());
										map.put("propertyvalue_id", cpv.getPropertyvalue_id());
										map.put("propertyvalue_code", cpv.getPropertyvalue_code());
										map.put("propertyvalue", cpv.getPropertyvalue());
										arraylist.add(map);
										
									}else{
										resultmap.put("propertyvalue", arraylist);
										listproperty.add(resultmap);
										arraylist=new ArrayList<Map<String,Object>>();
										resultmap=new HashMap<String, Object>();
										resultmap.put("category_id", cpv.getCategory_id());
										resultmap.put("property_id", cpv.getProperty_id());
										resultmap.put("property_code", cpv.getProperty_code());
										resultmap.put("property", cpv.getProperty());
										property_id=cpv.getProperty_id();
										
										Map map=new HashMap();
										map.put("id", cpv.getId());
										map.put("propertyvalue_id", cpv.getPropertyvalue_id());
										map.put("propertyvalue_code", cpv.getPropertyvalue_code());
										map.put("propertyvalue", cpv.getPropertyvalue());
										arraylist.add(map);
									}
								}
								
							}
							
						}
						
						
						data=JSON.toJSONString(listproperty);
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
