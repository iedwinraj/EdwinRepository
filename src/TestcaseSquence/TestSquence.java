package TestcaseSquence;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSquence {
 
	@BeforeTest
	public void beforeTest() {
		System.out.println("b.test");
	}
	
	@Test(groups="login")
	public void testcase1() {
		System.out.println("FirstTest");
	}
	
	@Test(groups="login")
	public void testcase2() {
		System.out.println("FirstTest");
	}
	@Test(groups="login")
	public void testcase3() {
		System.out.println("FirstTest");
	}
	@Test(groups ="Registration")
	public void testcase4() {
		System.out.println("FirstTest");
	}
	@Test(groups ="Registration")
	public void testcase5() {
		System.out.println("FirstTest");
	}
	@Test(groups ="Payment")
	public void testcase6() {
		System.out.println("FirstTest");
	}

	@Test(groups ="Payment")
	public void testcase7() {
		System.out.println("FirstTest");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("b.method");
	}

	
}
