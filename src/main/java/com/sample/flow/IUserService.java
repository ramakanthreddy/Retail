package com.sample.flow;

import org.springframework.stereotype.Service;


public interface IUserService {
	
	boolean addUserIntoSystem(UserVO userVO) throws UserAlreadyExitsException;

}
