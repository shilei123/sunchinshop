package cn.sqhl.shop.filter.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.category;


public interface SystemService {
	public List<category> queryCategoryList(PageCond page,Object obj);
}
