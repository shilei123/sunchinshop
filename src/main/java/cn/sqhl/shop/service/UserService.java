package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.to.BrowHistory;
import cn.sqhl.shop.to.Cart;
import cn.sqhl.shop.to.Collected;
import cn.sqhl.shop.to.SearcHistory;
import cn.sqhl.shop.to.UserCoupon;


public interface UserService {
	public List<UserCoupon> queryUserCouponList(PageCond page,Object obj);
	
	public List<BrowHistory> queryBrowHistoryList(PageCond page,Object obj);
	
	public List<Collected> queryCollectedList(PageCond page,Object obj);
	
	public List<Cart> queryCartList(PageCond page,Object obj);
	
	public List<SearcHistory> querySearchHistoryList(PageCond page,Object obj);
}
