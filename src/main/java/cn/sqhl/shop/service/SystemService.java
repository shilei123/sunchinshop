package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.AskQuestion;
import cn.sqhl.shop.vo.AskQuestionType;
import cn.sqhl.shop.vo.CategoryPropertyValue;
import cn.sqhl.shop.vo.GoodsPropertyValue;
import cn.sqhl.shop.vo.Brand;
import cn.sqhl.shop.vo.Category;
import cn.sqhl.shop.vo.Dictionary;


public interface SystemService {
	public List<Category> queryCategoryList(Object obj);
	
	public List<Dictionary> queryDictionaryList(PageCond page,Object obj);
	
	public List<Brand> queryBrandList(PageCond page,Object obj);
	
	public List<GoodsPropertyValue> queryGoodsPropertyList(Object obj);
	
	public List<CategoryPropertyValue> queryCategoryPropertyList(Object obj);
	
	public List<AskQuestionType> queryFAQKindList(Object obj);
	
	public List<AskQuestion> queryFAQList(PageCond page,Object obj);
}
