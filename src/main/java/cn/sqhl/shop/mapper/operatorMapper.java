package cn.sqhl.shop.mapper;

import cn.sqhl.shop.vo.Operator;


public interface operatorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Operator record);

    int insertSelective(Operator record);

    Operator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Operator record);

    int updateByPrimaryKey(Operator record);
}