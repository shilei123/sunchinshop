package cn.sqhl.shop.mapper;

import cn.sqhl.shop.vo.advertise;

public interface advertiseMapper {
    int deleteByPrimaryKey(String vId);

    int insert(advertise record);

    int insertSelective(advertise record);

    advertise selectByPrimaryKey(String vId);

    int updateByPrimaryKeySelective(advertise record);

    int updateByPrimaryKey(advertise record);
}