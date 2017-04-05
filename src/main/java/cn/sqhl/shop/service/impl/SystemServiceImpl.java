package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.CategoryPropertyValueMapper;
import cn.sqhl.shop.mapper.GoodsPropertyValueMapper;
import cn.sqhl.shop.mapper.BrandMapper;
import cn.sqhl.shop.mapper.CateGoryMapper;
import cn.sqhl.shop.mapper.DictionaryMapper;
import cn.sqhl.shop.mapper.FaqMapper;
import cn.sqhl.shop.mapper.FaqTypeMapper;
import cn.sqhl.shop.service.SystemService;
import cn.sqhl.shop.vo.CategoryPropertyValue;
import cn.sqhl.shop.vo.GoodsPropertyValue;
import cn.sqhl.shop.vo.Brand;
import cn.sqhl.shop.vo.CateGory;
import cn.sqhl.shop.vo.Dictionary;
import cn.sqhl.shop.vo.Faq;
import cn.sqhl.shop.vo.FaqType;

@Service("systemService")
public class SystemServiceImpl implements SystemService{

	@Autowired
	private CateGoryMapper cateGoryMapper;
	
	@Autowired
	private DictionaryMapper dictionaryMapper;
	
	@Autowired
	private BrandMapper	brandMapper;
	
	@Autowired
	private GoodsPropertyValueMapper goodsPropertyValueMapper;
	
	@Autowired
	private CategoryPropertyValueMapper	categoryPropertyValueMapper;
	
	@Autowired
	private FaqTypeMapper faqTypeMapper;
	
	@Autowired
	private FaqMapper faqMapper;
	
	@Override
	public List<CateGory> queryCategoryList(Object obj) {
		return cateGoryMapper.selectList((Map<String, Object>)obj);
	}

	@Override
	public List<Dictionary> queryDictionaryList(PageCond page, Object obj) {
		return dictionaryMapper.queryDictionary(page, (Map<String, Object>)obj);
	}

	@Override
	public List<Brand> queryBrandList(PageCond page, Object obj) {
		return brandMapper.queryList(page, (Map<String, Object>)obj);
	}

	@Override
	public List<GoodsPropertyValue> queryGoodsPropertyList(Object obj) {
		return goodsPropertyValueMapper.selectList((Map<String, Object>)obj);
	}

	@Override
	public List<CategoryPropertyValue> queryCategoryPropertyList(Object obj) {
		return  categoryPropertyValueMapper.selectList((Map<String, Object>)obj);
	}

	@Override
	public List<FaqType> queryFAQKindList(Object obj) {
		return faqTypeMapper.selectList((Map<String, Object>)obj);
	}

	@Override
	public List<Faq> queryFAQList(PageCond page, Object obj) {
		return faqMapper.queryList(page, (Map<String, Object>)obj);
	}

}
