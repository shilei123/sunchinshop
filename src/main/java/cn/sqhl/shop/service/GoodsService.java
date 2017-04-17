package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.to.Goods;
import cn.sqhl.shop.to.GoodsChildPrice;


public interface GoodsService {
	public List<Goods> queryGoods(PageCond page,Object obj);
	
	public List<GoodsChildPrice> queryGoodsList(PageCond page,Object obj);
}
