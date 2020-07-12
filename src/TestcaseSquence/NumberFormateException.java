package TestcaseSquence;

import org.testng.annotations.Test;


public class NumberFormateException {
  @Test(expectedExceptions= NumberFormatException.class)
  public void TEST() {
	  String a ="100Edwin";
	  Integer.parseInt(a);
	  System.out.println(a);
  }
  

}
