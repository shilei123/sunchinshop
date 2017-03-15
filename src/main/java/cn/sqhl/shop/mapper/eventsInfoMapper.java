package cn.sqhl.shop.mapper;

import cn.sqhl.shop.po.eventsInfo;

public interface eventsInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(eventsInfo record);

    int insertSelective(eventsInfo record);

    eventsInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(eventsInfo record);

    int updateByPrimaryKey(eventsInfo record);
}