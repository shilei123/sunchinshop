package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.core.PaginationInterceptor;
import cn.sqhl.shop.po.SearcHistory;

public interface SearcHistoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(SearcHistory record);

    int insertSelective(SearcHistory record);

    SearcHistory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SearcHistory record);

    int updateByPrimaryKey(SearcHistory record);

	public List<cn.sqhl.shop.vo.SearcHistory> querySearchHistoryList(@Param(PaginationInterceptor.PAGE_PARAM_KEY) PageCond page, Map<String,Object> obj);
}