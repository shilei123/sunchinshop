package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.AdvertiseMapper;
import cn.sqhl.shop.mapper.EventsInfoMapper;
import cn.sqhl.shop.vo.Advertise;
import cn.sqhl.shop.vo.EventsInfo;
import cn.sqhl.shop.service.MarketingService;

@Service("maketingService")
public class MarketingServiceImpl implements MarketingService{
	
	@Autowired
	AdvertiseMapper advertiseMapper;
	
	@Autowired
	EventsInfoMapper eventsInfoMapper;
	

	@Override
	public List<Advertise> queryAdvertList(PageCond page, Object obj) {
		return advertiseMapper.queryList(page,(Map<String, Object>)obj);
	}

	@Override
	public List<EventsInfo> queryEventList(PageCond page, Object obj) {
		return eventsInfoMapper.queryList(page,(Map<String, Object>)obj);
	}
	
	public List<Object> queryEventDetailList(PageCond page, Object obj) {
		return eventsInfoMapper.queryEventDetailList(page,(Map<String, Object>)obj);
	}

}
