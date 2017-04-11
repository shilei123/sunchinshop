package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.po.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(String id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
    
    public List<cn.sqhl.shop.vo.Cart> queryCartList(PageCond page,  Map<String,Object> obj);
	
}