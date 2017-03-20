package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.category;
import cn.sqhl.shop.vo.dictionary;


public interface SystemService {
	public List<category> queryCategoryList(PageCond page,Object obj);
	
	public List<dictionary> queryDictionaryList(PageCond page,Object obj);
}
