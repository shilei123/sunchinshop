package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.GoodsMapper;
import cn.sqhl.shop.vo.Goods;
import cn.sqhl.shop.vo.GoodsChildPrice;
import cn.sqhl.shop.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public List<Goods> queryGoods(PageCond page, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GoodsChildPrice> queryGoodsList(PageCond page, Object obj) {
		return goodsMapper.queryGoodsList(page,(Map<String, Object>)obj);
	}
	
	
}
