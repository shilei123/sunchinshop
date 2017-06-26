package cn.sqhl.shop.mapper;

import cn.sqhl.shop.po.Wallet;

public interface WalletMapper {
    int deleteByPrimaryKey(String id);

    int insert(Wallet record);

    int insertSelective(Wallet record);

    Wallet selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Wallet record);

    int updateByPrimaryKey(Wallet record);
}