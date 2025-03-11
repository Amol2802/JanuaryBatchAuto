package com.testngapackege;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTestCaseExample {

	@Test(priority=0)
	void login() {
		
		System.out.println("This is login test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=1,dependsOnMethods= {"login"})
	void verifyTitle() {
		
		System.out.println("This is verify Title test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods= {"login","verifyTitle"})
	void verifyHomePage() {
		
		System.out.println("This is verify Home Page test");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3,dependsOnMethods= {"login","verifyHomePage"})
	void verifyaddToCart() {
		
		System.out.println("This is verify dd To Cart test");
		Assert.assertTrue(true);
	}
}
