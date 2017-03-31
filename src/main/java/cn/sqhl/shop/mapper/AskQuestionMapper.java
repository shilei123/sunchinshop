package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.core.PaginationInterceptor;
import cn.sqhl.shop.po.AskQuestion;

public interface AskQuestionMapper {
    int deleteByPrimaryKey(String id);

    int insert(AskQuestion record);

    int insertSelective(AskQuestion record);

    AskQuestion selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AskQuestion record);

    int updateByPrimaryKeyWithBLOBs(AskQuestion record);

    int updateByPrimaryKey(AskQuestion record);
    
    List<cn.sqhl.shop.vo.AskQuestion> queryList(@Param(PaginationInterceptor.PAGE_PARAM_KEY) PageCond page,@Param("map") Map<String, Object> map);
}