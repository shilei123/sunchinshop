package cn.sqhl.shop.mapper;

import cn.sqhl.shop.po.advertise;

public interface advertiseMapper {
    int deleteByPrimaryKey(String id);

    int insert(advertise record);

    int insertSelective(advertise record);

    advertise selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(advertise record);

    int updateByPrimaryKey(advertise record);
}