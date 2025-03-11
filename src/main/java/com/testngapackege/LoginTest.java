package com.testngapackege;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority=1, groups= {"smoke", "regression"}, invocationCount=2)
	void verifyHomePage() {

		System.out.println("this is verify home page");
	}
	@Test(priority=2, groups= {"smoke", "regression", "sanity"},enabled=false)
	void verifytitle() {

		System.out.println("this is verify title ");
	}
	@Test(priority=3, groups= {"regression"})
	void verifyshipmentDetails() {

		System.out.println("this is verify shipmentDetails ");
	}
	@Test(priority=4, groups= {"regression", "sanity"})
	void verifyPaymentDetails() {

		System.out.println("this is verify PaymentDetails ");
	}

}
