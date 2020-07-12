package TestcaseSquence;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class GoogleTitleTest {

	WebDriver driver;

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Edwin\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.wait(2000);

	}

	@Test
	public void googleTileTest() {
		//System.out.println("Google Test");
		String title = driver.getTitle();
		System.out.println(title);
		//if(title.equals("Google"));
		
		Assert.assertEquals(title, "Google"," Matched");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
