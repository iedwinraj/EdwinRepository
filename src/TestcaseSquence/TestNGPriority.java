package TestcaseSquence;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPriority {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("b.method");
	}

	@Test(priority = 2)
	public void testcase1() {
		System.out.println("FirstTest");
	}

	@Test(priority = 3)
	public void testcase2() {
		System.out.println("SecondTest");

	}
	
	@Test(priority = 1)
	public void testcase3() {
		System.out.println("SecondTest");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("a.method");

	}

	

}
