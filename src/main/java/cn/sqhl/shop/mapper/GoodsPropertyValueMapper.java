package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.to.GoodsPropertyValue;

public interface GoodsPropertyValueMapper {
	List<GoodsPropertyValue> selectList(@Param("map") Map<String, Object> map);
}