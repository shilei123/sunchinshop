package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.userCouponMapper;
import cn.sqhl.shop.service.UserService;
import cn.sqhl.shop.vo.userCoupon;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private userCouponMapper userCouponMapper;
	
	@Override
	public List<userCoupon> queryUserCouponList(PageCond page, Object obj) {
		// TODO Auto-generated method stub
		return userCouponMapper.queryUserCouponList(page, (Map<String,Object>)obj);
	}

}
