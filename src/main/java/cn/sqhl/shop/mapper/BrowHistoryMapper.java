package cn.sqhl.shop.mapper;

import cn.sqhl.shop.po.BrowHistory;

public interface BrowHistoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(BrowHistory record);

    int insertSelective(BrowHistory record);

    BrowHistory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BrowHistory record);

    int updateByPrimaryKey(BrowHistory record);
}