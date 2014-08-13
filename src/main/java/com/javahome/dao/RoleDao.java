package com.javahome.dao;

import org.springframework.stereotype.Repository;

import com.javahome.dao.entity.RoleEntity;
@Repository
public class RoleDao extends BaseDao<RoleEntity> {

	@Override
	protected Class<RoleEntity> getPersistentClass() {
		// TODO Auto-generated method stub
		return RoleEntity.class;
	}

}
