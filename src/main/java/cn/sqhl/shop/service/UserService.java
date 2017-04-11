package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.BrowHistory;
import cn.sqhl.shop.vo.Cart;
import cn.sqhl.shop.vo.Collected;
import cn.sqhl.shop.vo.SearcHistory;
import cn.sqhl.shop.vo.UserCoupon;


public interface UserService {
	public List<UserCoupon> queryUserCouponList(PageCond page,Object obj);
	
	public List<BrowHistory> queryBrowHistoryList(PageCond page,Object obj);
	
	public List<Collected> queryCollectedList(PageCond page,Object obj);
	
	public List<Cart> queryCartList(PageCond page,Object obj);
	
	public List<SearcHistory> querySearchHistoryList(PageCond page,Object obj);
}
