package cn.sqhl.shop.mapper;

import cn.sqhl.shop.po.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(String id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}