package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.to.Purse;


public interface PayService {
	public List<Purse> queryPurseList(PageCond page,Object obj);
}
