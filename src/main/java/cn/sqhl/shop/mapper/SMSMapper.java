package cn.sqhl.shop.mapper;

import cn.sqhl.shop.po.SMS;

public interface SMSMapper {
    int deleteByPrimaryKey(String id);

    int insert(SMS record);

    int insertSelective(SMS record);

    SMS selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SMS record);

    int updateByPrimaryKey(SMS record);
}