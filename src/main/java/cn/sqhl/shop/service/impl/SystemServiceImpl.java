package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.CategoryPropertyValueMapper;
import cn.sqhl.shop.mapper.GoodsPropertyValueMapper;
import cn.sqhl.shop.mapper.BrandMapper;
import cn.sqhl.shop.mapper.CategoryMapper;
import cn.sqhl.shop.mapper.DictionaryMapper;
import cn.sqhl.shop.service.SystemService;
import cn.sqhl.shop.vo.CategoryPropertyValue;
import cn.sqhl.shop.vo.GoodsPropertyValue;
import cn.sqhl.shop.vo.Brand;
import cn.sqhl.shop.vo.Category;
import cn.sqhl.shop.vo.Dictionary;

@Service("systemService")
public class SystemServiceImpl implements SystemService{

	@Autowired
	private CategoryMapper categorymapper;
	
	@Autowired
	private DictionaryMapper dictionaryMapper;
	
	@Autowired
	private BrandMapper	brandMapper;
	
	@Autowired
	private GoodsPropertyValueMapper goodsPropertyValueMapper;
	
	@Autowired
	private CategoryPropertyValueMapper	categoryPropertyValueMapper;
	
	@Override
	public List<Category> queryCategoryList(PageCond page, Object obj) {
		return categorymapper.queryList(page, (Map<String, Object>)obj);
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

}
