package cn.sqhl.shop.mapper;

import cn.sqhl.shop.po.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(String code);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}