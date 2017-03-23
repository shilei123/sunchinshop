package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.advertiseMapper;
import cn.sqhl.shop.mapper.eventsInfoMapper;
import cn.sqhl.shop.vo.advertise;
import cn.sqhl.shop.vo.eventsInfo;
import cn.sqhl.shop.service.MarketingService;

@Service("maketingService")
public class MarketingServiceImpl implements MarketingService{
	
	@Autowired
	advertiseMapper advertiseMapper;
	
	@Autowired
	eventsInfoMapper eventsInfoMapper;
	

	@Override
	public List<advertise> queryAdvertList(PageCond page, Object obj) {
		return advertiseMapper.queryList(page,(Map<String, Object>)obj);
	}

	@Override
	public List<eventsInfo> queryEventList(PageCond page, Object obj) {
		return eventsInfoMapper.queryList(page,(Map<String, Object>)obj);
	}

}
