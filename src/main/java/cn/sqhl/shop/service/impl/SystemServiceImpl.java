package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.categoryMapper;
import cn.sqhl.shop.mapper.dictionaryMapper;
import cn.sqhl.shop.service.SystemService;
import cn.sqhl.shop.vo.category;
import cn.sqhl.shop.vo.dictionary;

@Service("systemService")
public class SystemServiceImpl implements SystemService{

	@Autowired
	private categoryMapper categorymapper;
	
	@Autowired
	private dictionaryMapper dictionaryMapper;
	
	@Override
	public List<category> queryCategoryList(PageCond page, Object obj) {
		return categorymapper.queryList(page, (Map<String, Object>)obj);
	}

	@Override
	public List<dictionary> queryDictionaryList(PageCond page, Object obj) {
		return dictionaryMapper.queryDictionary(page, (Map<String, Object>)obj);
	}

}
