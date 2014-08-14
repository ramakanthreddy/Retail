package com.javahome.dao;

import org.springframework.stereotype.Repository;

import com.javahome.dao.entity.UserEntity;
@Repository()
public class UserDao extends BaseDao<UserEntity>{

	@Override
	protected Class<UserEntity> getPersistentClass() {
		// TODO Auto-generated method stub
		return UserEntity.class;
	}
	
	public void disableUser(int userid){
		UserEntity userEntity = findById(userid);
		userEntity.setEnableFlag("N");
		updateEntity(userEntity);
	}
	
	
	

}
