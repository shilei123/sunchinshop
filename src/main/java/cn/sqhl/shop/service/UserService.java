package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.UserCoupon;


public interface UserService {
	public List<UserCoupon> queryUserCouponList(PageCond page,Object obj);
}
