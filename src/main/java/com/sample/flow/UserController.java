package com.sample.flow;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController{
	
	@RequestMapping(value="register",method=RequestMethod.GET)
	public String getHomePage(Model model){
		model.addAttribute("user", new UserVO());
		
		return "home";
		
	}
	
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String getUserInformation(@ModelAttribute("user") UserVO userVO){
		System.out.println(userVO.getUsername());
		System.out.println(userVO.getPassword());
		
		return "home";
		
	}
	
	
}