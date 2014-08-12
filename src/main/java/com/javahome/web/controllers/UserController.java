package com.javahome.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javahome.web.vo.UserVO;

@Controller
public class UserController {

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
