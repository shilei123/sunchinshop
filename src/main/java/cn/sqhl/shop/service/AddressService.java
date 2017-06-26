package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.to.Address;


public interface AddressService {
	public List<Address> queryAddressList(PageCond page,Object obj);
}
