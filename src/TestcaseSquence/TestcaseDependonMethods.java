package TestcaseSquence;

import org.testng.annotations.Test;

public class TestcaseDependonMethods {

	@Test()
	public void testcase1() {
		System.out.println("FirstTest");
		
	}

	@Test(dependsOnMethods ="testcase1")
	public void testcase2() {
		System.out.println("SecondTest");
	//	int i =9/0;

	}
	
	@Test(dependsOnMethods ="testcase2")
	public void testcase3() {
		System.out.println("SecondTest");

	}
	
}
