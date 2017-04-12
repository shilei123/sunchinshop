package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.AddressMapper;
import cn.sqhl.shop.vo.Address;
import cn.sqhl.shop.service.AddressService;

@Service("addressService")
public class AddressServiceImpl implements AddressService{
	@Autowired
	private AddressMapper addressMapper;
	
	@Override
	public List<Address> queryAddressList(PageCond page,Object obj) {
		return addressMapper.queryAddressList(page,(Map<String, Object>)obj);
	}
	
	
}
