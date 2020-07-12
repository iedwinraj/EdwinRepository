package TestcaseSquence;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MyTestcase {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("b.suit");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("b.test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("b.class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("b.method");
	}

	@Test
	public void testcase1() {
		System.out.println("FirstTest");
	}

	@Test
	public void testcase2() {
		System.out.println("SecondTest");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("a.method");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("a.class");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("a.suit");

	}

}
