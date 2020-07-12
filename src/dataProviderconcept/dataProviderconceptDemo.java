package dataProviderconcept;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class dataProviderconceptDemo {
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Edwin\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://htssindia.in/Registration.aspx");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	
	@DataProvider
	public void getData() {
		
	}

	@Test
	public void RegistrationPageTest(String UserName,String Password,String RePassword) {
		
		driver.findElement(By.id("ctl00_HTSSContent_txtUserName")).clear();
		driver.findElement(By.id("ctl00_HTSSContent_txtUserName")).sendKeys("UserName");
		
		driver.findElement(By.id("ctl00_HTSSContent_txtPwd")).clear();
		driver.findElement(By.id("ctl00_HTSSContent_txtPwd")).sendKeys("Password");

		driver.findElement(By.id("ctl00_HTSSContent_txtRePwd")).clear();
		driver.findElement(By.id("ctl00_HTSSContent_txtRePwd")).sendKeys("RePassword");

		
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
