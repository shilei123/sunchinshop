package cn.sqhl.shop.mapper;

import cn.sqhl.shop.vo.userCoupon;

public interface userCouponMapper {
    int deleteByPrimaryKey(String id);

    int insert(userCoupon record);

    int insertSelective(userCoupon record);

    userCoupon selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(userCoupon record);

    int updateByPrimaryKey(userCoupon record);
}