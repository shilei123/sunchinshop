package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.Advertise;
import cn.sqhl.shop.vo.Events;
import cn.sqhl.shop.vo.EventsGoods;


public interface MarketingService {
	public List<Advertise> queryAdvertList(PageCond page,Object obj);
	
	public List<Events> queryEventList(PageCond page,Object obj);
	
	public List<EventsGoods> queryEventDetailList(PageCond page,Object obj);
}
