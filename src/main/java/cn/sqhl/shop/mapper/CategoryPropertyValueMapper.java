package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.vo.CategoryPropertyValue;

public interface CategoryPropertyValueMapper {
	List<CategoryPropertyValue> selectList(@Param("map") Map<String, Object> map);
}