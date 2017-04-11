package cn.sqhl.shop.mapper;

import cn.sqhl.shop.po.Collected;

public interface CollectedMapper {
    int deleteByPrimaryKey(String id);

    int insert(Collected record);

    int insertSelective(Collected record);

    Collected selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Collected record);

    int updateByPrimaryKey(Collected record);
}