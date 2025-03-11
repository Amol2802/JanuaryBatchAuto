package com.testngapackege;

import org.testng.annotations.Test;

public class login2 {

	@Test(priority=1, groups= {"smoke", "regression"})
	void verifyHomePage() {

		System.out.println("this is verify home page login2");
	}
	@Test(priority=2, groups= {"smoke", "regression", })
	void verifytitle() {

		System.out.println("this is verify title login2");
	}
	@Test(priority=3, groups= {"regression","sanity"})
	void verifyshipmentDetails() {

		System.out.println("this is verify shipmentDetails login2");
	}
	@Test(priority=4, groups= { "sanity"})
	void verifyPaymentDetails() {

		System.out.println("this is verify PaymentDetails login2");
	}

	
}
