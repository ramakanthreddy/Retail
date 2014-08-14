package com.javahome.dao;

import org.springframework.stereotype.Repository;

import com.javahome.dao.entity.AddressEntity;
@Repository
public class AddressDao extends BaseDao<AddressEntity> {

	@Override
	protected Class<AddressEntity> getPersistentClass() {
		// TODO Auto-generated method stub
		return AddressEntity.class;
	}

}
