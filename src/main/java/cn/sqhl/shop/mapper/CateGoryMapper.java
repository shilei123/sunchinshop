package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.sqhl.shop.vo.CateGory;

public interface CateGoryMapper {
	List<CateGory> selectList(@Param("map") Map<String, Object> map);
}