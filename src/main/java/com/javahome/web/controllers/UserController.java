package com.javahome.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javahome.app.service.IUserService;
import com.javahome.web.vo.UserVO;
@Controller()
public class UserController {
	
	List<String> searchData = new ArrayList<String>();
	
	public UserController() {
		searchData.add("Munu");
		searchData.add("Sandeep");
		searchData.add("Donny");
		searchData.add("Bedyabas");
		searchData.add("Nirakar");
		searchData.add("Haritha");
		searchData.add("Javahome");
	}
	
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
	
	@RequestMapping(value="searchUser",method=RequestMethod.GET)
	public String searchUser(){
		return "searchUser";
		
	}
	
	@RequestMapping(value="searchResults",method=RequestMethod.GET)
	@ResponseBody
	public List<String> searchUserRequest(@RequestParam String searchString){
		List<String> results = new ArrayList<String>();
		for(String s : searchData){
			if(s.contains(searchString)){
				results.add(s);
			}
		}
		
		
		return results;
		
	}
	

}
