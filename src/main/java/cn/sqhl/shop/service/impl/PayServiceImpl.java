package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.PurseMapper;
import cn.sqhl.shop.service.PayService;
import cn.sqhl.shop.to.Purse;

@Service("payService")
public class PayServiceImpl implements PayService{

	@Autowired
	private PurseMapper purseMapper;
	
	@Override
	public List<Purse> queryPurseList(PageCond page, Object obj) {
		return purseMapper.queryList(page, (Map<String, Object>)obj);
	}

}
