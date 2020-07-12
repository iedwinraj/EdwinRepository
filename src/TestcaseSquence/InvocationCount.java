package TestcaseSquence;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount =5)
	public void testcase1() {
		System.out.println("testcase");

	}
}
