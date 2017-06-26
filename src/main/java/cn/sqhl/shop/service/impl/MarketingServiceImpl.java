package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.AdvertiseMapper;
import cn.sqhl.shop.mapper.EventsGoodsMapper;
import cn.sqhl.shop.mapper.EventsMapper;
import cn.sqhl.shop.vo.Advertise;
import cn.sqhl.shop.vo.Events;
import cn.sqhl.shop.vo.EventsGoods;
import cn.sqhl.shop.service.MarketingService;

@Service("maketingService")
public class MarketingServiceImpl implements MarketingService{
	
	@Autowired
	AdvertiseMapper advertiseMapper;
	
	@Autowired
	EventsMapper eventsMapper;
	
	@Autowired
	EventsGoodsMapper eventsGoodsMapper;
	

	@Override
	public List<Advertise> queryAdvertList(PageCond page, Object obj) {
		return advertiseMapper.queryList(page,(Map<String, Object>)obj);
	}

	@Override
	public List<Events> queryEventList(PageCond page, Object obj) {
		return eventsMapper.queryList(page,(Map<String, Object>)obj);
	}
	
	public List<EventsGoods> queryEventDetailList(PageCond page, Object obj) {
		return eventsGoodsMapper.queryEventDetailList(page,(Map<String, Object>)obj);
	}

}
