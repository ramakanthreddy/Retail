package com.javahome.app.service;

import java.util.List;

import com.javahome.web.vo.RoleVO;
import com.javahome.web.vo.UserVO;





public interface IUserService {
	
	boolean disableUser(int userId);
	
	List<RoleVO> findAllRoles();
	
	boolean addUser(UserVO userVO);
	

	
	

}
