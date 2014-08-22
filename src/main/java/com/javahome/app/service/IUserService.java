package com.javahome.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javahome.web.vo.RoleVO;
import com.javahome.web.vo.UserVO;




@Service
public interface IUserService {
	
	boolean disableUser(int userId);
	
	List<RoleVO> findAllRoles();
	
	boolean addUser(UserVO userVO);
	
	boolean searchUser(UserVO userVO);
	
	List<UserVO> findUsers();
	
	

}
