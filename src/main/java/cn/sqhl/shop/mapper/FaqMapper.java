package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.core.PaginationInterceptor;
import cn.sqhl.shop.po.Faq;

public interface FaqMapper {
    int deleteByPrimaryKey(String id);

    int insert(Faq record);

    int insertSelective(Faq record);

    Faq selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Faq record);

    int updateByPrimaryKeyWithBLOBs(Faq record);

    int updateByPrimaryKey(Faq record);
    
    List<cn.sqhl.shop.vo.Faq> queryList(@Param(PaginationInterceptor.PAGE_PARAM_KEY) PageCond page,@Param("map") Map<String, Object> map);

}