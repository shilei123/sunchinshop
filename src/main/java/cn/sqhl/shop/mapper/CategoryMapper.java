package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.vo.Category;

public interface CategoryMapper {
    List<Category> selectList(@Param("map") Map<String, Object> map);
}