package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.advertise;
import cn.sqhl.shop.vo.eventsInfo;


public interface MarketingService {
	public List<advertise> queryAdvertList(PageCond page,Object obj);
	
	public List<eventsInfo> queryEventList(PageCond page,Object obj);
}
