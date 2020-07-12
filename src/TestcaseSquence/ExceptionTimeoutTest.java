package TestcaseSquence;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
  @Test(invocationCount=5,expectedExceptions=NumberFormatException.class)
  public void Testcase() {
	  int i = 1;
	  while(i==5) {
		  System.out.println(i);
		 // i++;
	  }
  }
}
