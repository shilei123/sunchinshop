package cn.sqhl.shop.filter.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.filter.service.SystemService;
import cn.sqhl.shop.mapper.categoryMapper;
import cn.sqhl.shop.vo.category;

@Service("systemService")
public class SystemServiceImpl implements SystemService{

	@Autowired
	private categoryMapper categorymapper;
	
	@Override
	public List<category> queryCategoryList(PageCond page, Object obj) {
		return categorymapper.queryList(page, (Map<String, Object>)obj);
	}

}
