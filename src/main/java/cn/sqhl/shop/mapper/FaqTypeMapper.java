package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.sqhl.shop.po.FaqType;

public interface FaqTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(FaqType record);

    int insertSelective(FaqType record);

    FaqType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FaqType record);

    int updateByPrimaryKey(FaqType record);
    
    List<cn.sqhl.shop.to.FaqType> selectList(@Param("map") Map<String, Object> map);

}