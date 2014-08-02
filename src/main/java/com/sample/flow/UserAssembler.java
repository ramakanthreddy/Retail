package com.sample.flow;

public class UserAssembler {

	public static UserEntity fromUserVO(UserVO userVO) {

		UserEntity userEntity = new UserEntity();
		if (userVO != null) {
			userEntity.setUserName(userVO.getUsername());
			userEntity.setPassword(userVO.getPassword());

		}
		return userEntity;
	}

}
