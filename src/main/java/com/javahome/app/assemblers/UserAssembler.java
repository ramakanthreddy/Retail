package com.javahome.app.assemblers;

import java.util.ArrayList;
import java.util.List;

import com.javahome.dao.entity.AddressEntity;
import com.javahome.dao.entity.UserEntity;
import com.javahome.web.vo.UserVO;

public class UserAssembler {
	
	public static UserEntity fromUserVO(UserVO userVO){
		UserEntity userEntity = new UserEntity();
		
		if(userVO != null){
			userEntity.setUserName(userVO.getScreenName());
			userEntity.setMobile(userVO.getMobile());
			userEntity.setEnableFlag("Y");
			userEntity.setPassword(userVO.getPassword());
			AddressEntity addressEntity = new AddressEntity();
			addressEntity.setCity(userVO.getCity());
			addressEntity.setState(userVO.getState());
			addressEntity.setStreet(userVO.getStreet());
			addressEntity.setUserEntity(userEntity);
			List<AddressEntity> addresses = new ArrayList<AddressEntity>();
			addresses.add(addressEntity);
			userEntity.setAddresses(addresses);
			
		}
		return userEntity;
	}

}
