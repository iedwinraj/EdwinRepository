package TestcaseSquence;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SkipTestcase {
  
  @BeforeMethod
  public void beforeMethod() {
  }
  
  @Test
  public void login() {
  System.out.println("Login");
  int i = 9/0;
  }
  
  @Test(dependsOnMethods ="login")
  public void Home() {
  System.out.println("Home page");
  }
  
  @Test
  public void Logout() {
  System.out.println("Home page");
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}
