package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.po.AskQuestionType;

public interface AskQuestionTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(AskQuestionType record);

    int insertSelective(AskQuestionType record);

    AskQuestionType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AskQuestionType record);

    int updateByPrimaryKey(AskQuestionType record);
    
    List<cn.sqhl.shop.vo.AskQuestionType> selectList(@Param("map") Map<String, Object> map);
}