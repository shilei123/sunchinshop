package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.Advertise;
import cn.sqhl.shop.vo.EventsInfo;


public interface MarketingService {
	public List<Advertise> queryAdvertList(PageCond page,Object obj);
	
	public List<EventsInfo> queryEventList(PageCond page,Object obj);
	
	public List<Object> queryEventDetailList(PageCond page,Object obj);
}
