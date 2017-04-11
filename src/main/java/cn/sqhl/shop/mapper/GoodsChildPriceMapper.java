package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.BrowHistory;
import cn.sqhl.shop.vo.Collected;

public interface GoodsChildPriceMapper {
	public List<BrowHistory> queryBrowHistoryList(PageCond page, Map<String,Object> obj);
	
	public List<Collected> queryCollectedList(PageCond page, Map<String,Object> obj);
}