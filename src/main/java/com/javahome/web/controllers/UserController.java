package com.javahome.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javahome.web.vo.UserVO;


import com.javahome.app.service.IUserService;
@Controller()
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="deleteUser",method=RequestMethod.GET)
	public String disableUser(@ModelAttribute("userid") int userId){
		
		boolean result = userService.disableUser(userId);
		if(result) return "sucess";else return "failure";
		
		
		
		
	}
	

	@RequestMapping(value="searchUserHome",method=RequestMethod.GET)
	public String getHomePage(Model model){
		model.addAttribute("searchUser", new UserVO());
		
		return "searchUserHome";
	}
		
	@RequestMapping(value="searchUserResult",method=RequestMethod.POST)
		public String getUserInformation(@ModelAttribute("searchUser") UserVO searchUserVO){
		System.out.println(searchUserVO.getUsersname());
			
			return "searchUserResult";	
		
	}
}
