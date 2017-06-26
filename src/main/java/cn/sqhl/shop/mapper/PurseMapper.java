package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.core.PaginationInterceptor;
import cn.sqhl.shop.po.Purse;

public interface PurseMapper {
    int deleteByPrimaryKey(String id);

    int insert(Purse record);

    int insertSelective(Purse record);

    Purse selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Purse record);

    int updateByPrimaryKey(Purse record);
    
    List<cn.sqhl.shop.vo.Purse> queryList(@Param(PaginationInterceptor.PAGE_PARAM_KEY) PageCond page,@Param("map") Map<String, Object> map);

}