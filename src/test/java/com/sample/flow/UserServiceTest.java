package com.sample.flow;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:app-test.xml"})
public class UserServiceTest {
	@Autowired
	private IUserService userService;
	
	@Test
	public void testAddUserSucess(){
		
	boolean result = false;
	
	UserVO userVO = new UserVO();
	userVO.setUsername("test");
	userVO.setPassword("test");
	try {
		result = userService.addUserIntoSystem(userVO);
	} catch (UserAlreadyExitsException e) {
		// TODO Auto-generated catch block
	Assert.assertTrue(result);
	}
	Assert.assertTrue(result);
		
	}

}
