package com.app.TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsernameFeature {
	
	@Test
	public void UsernameTest()
	{
		Usernamecode obj = new Usernamecode();
		
		String username = "adminuser";
		String username1 = "admin/user"; // a username should not have /
		String username2 = "admin#user"; // a username should not have #
		String username3 = "admin123";
		
		Assert.assertTrue(obj.isvalidUsername(username));
		Assert.assertFalse(obj.isvalidUsername(username1),"This is not valid user");
		Assert.assertFalse(obj.isvalidUsername(username2),"This is not valid user");
		Assert.assertTrue(obj.isvalidUsername(username3));
		
		
	}


}
