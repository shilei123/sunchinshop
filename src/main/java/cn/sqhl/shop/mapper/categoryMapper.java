package cn.sqhl.shop.mapper;

import cn.sqhl.shop.vo.category;

public interface categoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(category record);

    int insertSelective(category record);

    category selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(category record);

    int updateByPrimaryKey(category record);
}