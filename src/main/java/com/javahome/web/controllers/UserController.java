package com.javahome.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javahome.web.vo.UserVO;


import com.javahome.app.service.IUserService;
import com.javahome.web.vo.UserVO;
@Controller()
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="deleteUser",method=RequestMethod.GET)
	public String disableUser(@ModelAttribute("userid") int userId){
		
		boolean result = userService.disableUser(userId);
		if(result) return "sucess";else return "failure";	
	}
	
	@RequestMapping(value={"addUser"},method=RequestMethod.GET)
	public String getAddUserHomePage(Model model){
		
		UserVO userVO = new UserVO();
		model.addAttribute("collectionOfRoles", userService.findAllRoles());
		model.addAttribute("userCommand", userVO);
		
		return "user/addUser";
		
	}
	
	@RequestMapping(value={"addUser"},method=RequestMethod.POST)
	public String getUserDetails(@ModelAttribute("userCommand") UserVO userVO){
		userService.addUser(userVO);
		
		return "user/addUser";
		
	}
	

	@RequestMapping(value="searchUserHome",method=RequestMethod.GET)
	public String getHomePage(Model model){
		model.addAttribute("searchUser", new UserVO());
		
		return "searchUserHome";
	}
		
	@RequestMapping(value="searchUserResult",method=RequestMethod.POST)
		public String getUserInformation(@ModelAttribute("searchUser") UserVO searchUserVO){
		System.out.println(searchUserVO.getScreenName());
			
			return "searchUserResult";	
		
	}
}
