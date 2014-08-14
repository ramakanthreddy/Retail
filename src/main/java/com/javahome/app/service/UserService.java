package com.javahome.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javahome.dao.UserDao;
@Service
public class UserService implements IUserService {
	@Autowired()
	private UserDao userDao;
	@Transactional
	public boolean disableUser(int userId) {
		userDao.disableUser(userId);
		return true;
	}

}
