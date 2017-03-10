package cn.sqhl.shop.mapper;

import cn.sqhl.shop.vo.property;

public interface propertyMapper {
    int deleteByPrimaryKey(String id);

    int insert(property record);

    int insertSelective(property record);

    property selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(property record);

    int updateByPrimaryKey(property record);
}