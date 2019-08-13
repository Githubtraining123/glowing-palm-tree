package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltesting {

		WebDriver driver;
		
		 @Parameters("browser")
		 @BeforeMethod
		  public void SetUp(String browser) 
		  {  
		  	if(browser.equalsIgnoreCase("chrome"))
			  
		      {    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
				
				   driver = new ChromeDriver();
			  }
		  
		  	else if(browser.equalsIgnoreCase("firefox"))
		  	{
		  	
		  	}
		  	 }
		 @Test
		 public void googletitle()
		 {
			 
			 driver.manage().deleteAllCookies();
				
				driver.get("https://www.google.com/");
				
			String b = driver.getTitle(); 
			System.out.println(b);
			
		 }
		 
	 

	 @AfterMethod
		  public void tearDown() throws InterruptedException 
		  
		  {
			  Thread.sleep(3000);
			  driver.close();
			  
		  }

}
