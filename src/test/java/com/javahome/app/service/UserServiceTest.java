package com.javahome.app.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javahome.web.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:app-test.xml"})
public class UserServiceTest {
	@Autowired
	private IUserService userService;
	
	@Test
	public void testAddUserSucess(){

   UserVO userVO = new UserVO();
   userVO.setEmail("javahome@javahome.com");
   userVO.setMobile("8884035968");
   userVO.setPassword("josya");
   userVO.setRoleId(10);
   userVO.setScreenName("ADMIN USER");
   userVO.setStreet("Munekollala");
   userVO.setCity("Bangalore");
   userVO.setState("Karnataka");
   boolean result = userService.addUser(userVO);
   Assert.assertTrue(result);
		
		
	}

}
