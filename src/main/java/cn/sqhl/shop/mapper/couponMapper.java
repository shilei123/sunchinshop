package cn.sqhl.shop.mapper;

import cn.sqhl.shop.vo.coupon;

public interface couponMapper {
    int deleteByPrimaryKey(String id);

    int insert(coupon record);

    int insertSelective(coupon record);

    coupon selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(coupon record);

    int updateByPrimaryKey(coupon record);
}