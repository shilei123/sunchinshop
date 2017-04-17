package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.to.Area;
import cn.sqhl.shop.to.Brand;
import cn.sqhl.shop.to.CateGory;
import cn.sqhl.shop.to.CategoryPropertyValue;
import cn.sqhl.shop.to.Dictionary;
import cn.sqhl.shop.to.Faq;
import cn.sqhl.shop.to.FaqType;
import cn.sqhl.shop.to.GoodsPropertyValue;
import cn.sqhl.shop.to.SMS;


public interface SystemService {
	public List<CateGory> queryCategoryList(Object obj);
	
	public List<Dictionary> queryDictionaryList(PageCond page,Object obj);
	
	public List<Brand> queryBrandList(PageCond page,Object obj);
	
	public List<GoodsPropertyValue> queryGoodsPropertyList(Object obj);
	
	public List<CategoryPropertyValue> queryCategoryPropertyList(Object obj);
	
	public List<FaqType> queryFAQKindList(Object obj);
	
	public List<Faq> queryFAQList(PageCond page,Object obj);
	
	public List<Area> queryAreaList(PageCond page,Object obj);
	
	public int insertSMS(cn.sqhl.shop.po.SMS obj);
}
