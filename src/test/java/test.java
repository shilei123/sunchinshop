import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.sqhl.shop.utils.security.SecurityCore;


public class test {
	public static void main(String[] args) {
		
		Map basemap=new HashMap();
		
		Map param=new HashMap();
//		param.put("level", "");
//		param.put("parent_id", "");
//		param.put("pagesize", "10");
//		param.put("nowpage", "0");
//		basemap.put("servicecode", "3620170315045");//商品分类查询
		
//		param.put("type", "ATTACH_TYPE");
//		param.put("pcode", "");
//		param.put("pagesize", "");
//		param.put("nowpage", "");
//		basemap.put("servicecode", "3620170315045");//字典查询
		
//		param.put("user_id", "");
//		param.put("user_name", "13213213");
//		param.put("coupon_status", "");
//		param.put("pagesize", "10");
//		param.put("nowpage", "0");
//		basemap.put("servicecode", "3620170315035");//会员优惠券查询
		
//		param.put("kind", "0");
//		param.put("location", "0");
//		param.put("type", "50");
//		param.put("start_time", "2017-3-2 00:00:01");
//		param.put("end_time", "2017-7-28 23:59:59");
//		param.put("pagesize", "10");
//		param.put("nowpage", "0");
//		basemap.put("servicecode", "3620170315003");//广告查询
		
		param.put("event_name", "优惠活动");
		param.put("event_id", "2");
		param.put("start_time", "2017-3-1 00:00:01");
		param.put("end_time", "2017-3-10 23:59:59");
		param.put("pagesize", "10");
		param.put("nowpage", "0");
		basemap.put("servicecode", "3620170315004");//活动查询
		
		
		
		basemap.put("data", JSON.toJSONString(param));
		
		Map signvalue=SecurityCore.buildRequestPara(basemap);
		JSONObject jo=new JSONObject();
		jo.putAll(signvalue);
		System.out.println(jo.toJSONString());
		
//		String info="[{\"cateName\":\"惠普\",\"cateOrder\":\"1\",\"id\":\"200490ee-6908-4438-bb11-f1e654e759c1\",\"levels\":\"2\",\"memo\":\"惠普描述\",\"parentId\":\"c6d227c0-c3c9-45c1-a84d-73d5c06fe446\",\"updateTime\":1489050359000},{\"cateName\":\"外星人\",\"cateOrder\":\"2\",\"id\":\"6739ec9e-46f9-40e4-adfb-92a6166622ca\",\"levels\":\"2\",\"memo\":\"外星人描述\",\"parentId\":\"c6d227c0-c3c9-45c1-a84d-73d5c06fe446\",\"updateTime\":1489050440000},{\"cateCode\":\"代码1\",\"cateName\":\"所有类别\",\"cateOrder\":\"1\",\"id\":\"id1\",\"levels\":\"0\",\"memo\":\"所有类别\"},{\"cateName\":\"电脑\",\"cateOrder\":\"3\",\"createTime\":1489041677000,\"id\":\"c6d227c0-c3c9-45c1-a84d-73d5c06fe446\",\"levels\":\"1\",\"memo\":\"电脑描述\",\"parentId\":\"id1\"},{\"cateCode\":\"代码2\",\"cateName\":\"电器\",\"cateOrder\":\"1\",\"id\":\"id2\",\"levels\":\"1\",\"memo\":\"电器描述\",\"parentId\":\"id1\"},{\"cateCode\":\"代码3\",\"cateName\":\"食物\",\"cateOrder\":\"2\",\"id\":\"id3\",\"levels\":\"1\",\"memo\":\"食物描述\",\"parentId\":\"id1\"},{\"cateCode\":\"类代码\",\"cateName\":\"冰箱\",\"cateOrder\":\"1\",\"id\":\"id4\",\"levels\":\"2\",\"memo\":\"冰箱描述\",\"parentId\":\"id2\"},{\"cateCode\":\"类代码\",\"cateName\":\"电视机\",\"cateOrder\":\"2\",\"id\":\"id5\",\"levels\":\"2\",\"memo\":\"电视机描述\",\"parentId\":\"id2\"},{\"cateCode\":\"类代码\",\"cateName\":\"洗衣机\",\"cateOrder\":\"3\",\"id\":\"id6\",\"levels\":\"2\",\"memo\":\"洗衣机描述\",\"parentId\":\"id2\"},{\"cateCode\":\"类代码\",\"cateName\":\"饺子\",\"cateOrder\":\"1\",\"id\":\"id7\",\"levels\":\"2\",\"memo\":\"饺子描述\",\"parentId\":\"id3\"}]";
//		
//		Object obj=JSON.parse(info);
//		
//		System.out.println(((JSONArray)obj).get(0));
	}
}
