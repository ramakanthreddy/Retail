package com.javahome.app.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javahome.app.assemblers.RoleAssembler;
import com.javahome.app.assemblers.UserAssembler;
import com.javahome.dao.AddressDao;
import com.javahome.dao.RoleDao;
import com.javahome.dao.UserDao;
import com.javahome.dao.entity.AddressEntity;
import com.javahome.dao.entity.RoleEntity;
import com.javahome.dao.entity.UserEntity;
import com.javahome.web.vo.RoleVO;
import com.javahome.web.vo.UserVO;
@Service
public class UserService implements IUserService {
	@Autowired()
	private UserDao userDao;
	@Autowired()
	private RoleDao roleDao;
	@Autowired
	private AddressDao addressDao;
	@Transactional
	public boolean disableUser(int userId) {
		userDao.disableUser(userId);
		return true;
	}
	@Override
	@Transactional
	public List<RoleVO> findAllRoles() {
		List<RoleEntity> roleEntities = roleDao.findAllObjects();
		List<RoleVO> roleVOObjects = new ArrayList<RoleVO>();
		for(RoleEntity roleEntity : roleEntities){
			roleVOObjects.add(RoleAssembler.toRoleVO(roleEntity));
		}
		return roleVOObjects;
	}
	@Override
	@Transactional
	public boolean addUser(UserVO userVO) {
		RoleEntity roleEntity = roleDao.findById(userVO.getRoleId());
		UserEntity userEntity = UserAssembler.fromUserVO(userVO);
		Collection<AddressEntity> addressEntities = userEntity.getAddresses();
		userEntity.setAddresses(new ArrayList<AddressEntity>());
		userEntity.setRoleEntity(roleEntity);
		userDao.addEntity(userEntity);
		for(AddressEntity addressEntity : addressEntities){
			addressEntity.setUserEntity(userEntity);
			userEntity.getAddresses().add(addressEntity);		
			addressDao.addEntity(addressEntity);
		}
		return true;
	}
	@Override
	@Transactional
	public List<UserVO> findUsers()
	{
		List<UserEntity> userEntities = userDao.findAllObjects();
		List<UserVO> userVOObjects = new ArrayList<UserVO>();
		for(UserEntity userEntity : userEntities)
		{
			userVOObjects.add(UserAssembler.fromUserEntity(userEntity));
		}
		return userVOObjects;
	}

}