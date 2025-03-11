package com.testngapackege;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotaionsExample {

	@BeforeMethod
	void BeforeMethoded() {

		System.out.println("This is BeforeMethod");

	}

	@AfterMethod
	void AfterMethodex() {

		System.out.println("This is AfterMethodex");

	}

	@BeforeClass
	void BeforeClassex() {

		System.out.println("This is Before Class Method ");

	}

	@AfterClass
	void AfterClasty() {

		System.out.println("This is after Class Method");

	}

	@Test(priority = 0)
	void verifyTitle() {

		System.out.println("This is verifyTitle ");

	}

	@Test(priority = 2)
	void PaypemntDetails() {

		System.out.println("This is PaypemntDetails ");

	}

	@Test(priority = 1)
	void shipmenttDetails() {

		System.out.println("This is shipmenttDetails ");

	}

	@BeforeTest
	void beforeTestMethod() {

		System.out.println("This is beforeTestMethod ");

	}

	@AfterTest
	void AfterTestMethod() {

		System.out.println("This is AfterTestMethod ");

	}

	@BeforeSuite
	void beforeSuiteMethod() {

		System.out.println("This is beforeSuiteMethod ");

	}

	@AfterSuite
	void AfterSuiteMethod() {

		System.out.println("This is AfterSuiteMethod ");

	}
}
