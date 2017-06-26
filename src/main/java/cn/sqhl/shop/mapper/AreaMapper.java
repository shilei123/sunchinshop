package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.core.PaginationInterceptor;
import cn.sqhl.shop.po.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(String code);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
    
    List<cn.sqhl.shop.vo.Area> queryList(@Param(PaginationInterceptor.PAGE_PARAM_KEY) PageCond page,@Param("map") Map<String, Object> map);
}