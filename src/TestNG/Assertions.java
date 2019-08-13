package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Assertions {
	
	WebDriver driver;
	
	 @BeforeMethod
	  public void SetUp() 
		  
	  {    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.google.com/");
			
	  }

	 @Ignore
	 @Test
	 public void googletitle()
	 {
		String b = driver.getTitle(); 
		System.out.println(b);
		Assert.assertEquals(b, "Google"); //Can use AssertNotEquals as well
	 }
	 
	 @Test
 

	 
	 
	 
	 
	 
	 
	 
	 
	 @AfterMethod
	  public void tearDown() throws InterruptedException 
	  
	  {
		  Thread.sleep(3000);
		  driver.close();
		  
	  }

	
	
	
	
	
	
	
	

}
