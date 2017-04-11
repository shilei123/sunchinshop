package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.CartMapper;
import cn.sqhl.shop.mapper.GoodsChildPriceMapper;
import cn.sqhl.shop.mapper.GoodsMapper;
import cn.sqhl.shop.mapper.SearcHistoryMapper;
import cn.sqhl.shop.mapper.UserCouponMapper;
import cn.sqhl.shop.service.UserService;
import cn.sqhl.shop.vo.BrowHistory;
import cn.sqhl.shop.vo.Cart;
import cn.sqhl.shop.vo.Collected;
import cn.sqhl.shop.vo.Goods;
import cn.sqhl.shop.vo.SearcHistory;
import cn.sqhl.shop.vo.UserCoupon;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserCouponMapper userCouponMapper;
	
	@Autowired
	private GoodsChildPriceMapper goodsChildPriceMapper;
	
	@Autowired
	private CartMapper cartMapper; 
	
	@Autowired
	private SearcHistoryMapper searcHistoryMapper;
	
	@Override
	public List<UserCoupon> queryUserCouponList(PageCond page, Object obj) {
		return userCouponMapper.queryUserCouponList(page, (Map<String,Object>)obj);
	}

	@Override
	public List<BrowHistory> queryBrowHistoryList(PageCond page, Object obj) {
		return goodsChildPriceMapper.queryBrowHistoryList(page, (Map<String,Object>)obj);
	}

	@Override
	public List<Collected> queryCollectedList(PageCond page, Object obj) {
		return goodsChildPriceMapper.queryCollectedList(page, (Map<String,Object>)obj);
	}

	@Override
	public List<Cart> queryCartList(PageCond page, Object obj) {
		return cartMapper.queryCartList(page, (Map<String,Object>)obj);
	}

	@Override
	public List<SearcHistory> querySearchHistoryList(PageCond page, Object obj) {
		return searcHistoryMapper.querySearchHistoryList(page, (Map<String,Object>)obj);
	}

}
