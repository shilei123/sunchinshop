package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.CategoryPropertyValueMapper;
import cn.sqhl.shop.mapper.GoodsPropertyValueMapper;
import cn.sqhl.shop.mapper.brandMapper;
import cn.sqhl.shop.mapper.categoryMapper;
import cn.sqhl.shop.mapper.dictionaryMapper;
import cn.sqhl.shop.service.SystemService;
import cn.sqhl.shop.vo.CategoryPropertyValue;
import cn.sqhl.shop.vo.GoodsPropertyValue;
import cn.sqhl.shop.vo.brand;
import cn.sqhl.shop.vo.category;
import cn.sqhl.shop.vo.dictionary;

@Service("systemService")
public class SystemServiceImpl implements SystemService{

	@Autowired
	private categoryMapper categorymapper;
	
	@Autowired
	private dictionaryMapper dictionaryMapper;
	
	@Autowired
	private brandMapper	brandMapper;
	
	@Autowired
	private GoodsPropertyValueMapper goodsPropertyValueMapper;
	
	@Autowired
	private CategoryPropertyValueMapper	categoryPropertyValueMapper;
	
	@Override
	public List<category> queryCategoryList(PageCond page, Object obj) {
		return categorymapper.queryList(page, (Map<String, Object>)obj);
	}

	@Override
	public List<dictionary> queryDictionaryList(PageCond page, Object obj) {
		return dictionaryMapper.queryDictionary(page, (Map<String, Object>)obj);
	}

	@Override
	public List<brand> queryBrandList(PageCond page, Object obj) {
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
