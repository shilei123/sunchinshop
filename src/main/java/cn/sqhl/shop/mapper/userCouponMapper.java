package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.po.userCoupon;
import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.core.PaginationInterceptor;

public interface userCouponMapper {
    int deleteByPrimaryKey(String id);

    int insert(userCoupon record);

    int insertSelective(userCoupon record);

    userCoupon selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(userCoupon record);

    int updateByPrimaryKey(userCoupon record);
    
    List<cn.sqhl.shop.vo.userCoupon> queryUserCouponList(@Param(PaginationInterceptor.PAGE_PARAM_KEY) PageCond page,@Param("map") Map<String, Object> map);

}