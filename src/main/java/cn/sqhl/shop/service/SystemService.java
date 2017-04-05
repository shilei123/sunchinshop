package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.CategoryPropertyValue;
import cn.sqhl.shop.vo.GoodsPropertyValue;
import cn.sqhl.shop.vo.Brand;
import cn.sqhl.shop.vo.CateGory;
import cn.sqhl.shop.vo.Dictionary;
import cn.sqhl.shop.vo.Faq;
import cn.sqhl.shop.vo.FaqType;


public interface SystemService {
	public List<CateGory> queryCategoryList(Object obj);
	
	public List<Dictionary> queryDictionaryList(PageCond page,Object obj);
	
	public List<Brand> queryBrandList(PageCond page,Object obj);
	
	public List<GoodsPropertyValue> queryGoodsPropertyList(Object obj);
	
	public List<CategoryPropertyValue> queryCategoryPropertyList(Object obj);
	
	public List<FaqType> queryFAQKindList(Object obj);
	
	public List<Faq> queryFAQList(PageCond page,Object obj);
}
