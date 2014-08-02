package com.sample.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserDao userDao;

	public boolean addUserIntoSystem(UserVO userVO)
			throws UserAlreadyExitsException {
		
		UserEntity userEntity = UserAssembler.fromUserVO(userVO);
		
		try {
			userDao.addObject(userEntity);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

}