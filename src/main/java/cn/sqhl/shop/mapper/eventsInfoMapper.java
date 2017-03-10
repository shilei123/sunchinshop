package cn.sqhl.shop.mapper;

import cn.sqhl.shop.vo.eventsInfo;

public interface eventsInfoMapper {
    int deleteByPrimaryKey(String vId);

    int insert(eventsInfo record);

    int insertSelective(eventsInfo record);

    eventsInfo selectByPrimaryKey(String vId);

    int updateByPrimaryKeySelective(eventsInfo record);

    int updateByPrimaryKey(eventsInfo record);
}