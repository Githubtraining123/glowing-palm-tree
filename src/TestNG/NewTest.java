package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	
  @Test(priority=2)
  public void f() throws Exception 
  {
	driver.findElement(By.id("vfb-7-1")).click(); 
		
			Thread.sleep(2000);
			
			driver.findElement(By.id("vfb-7-2")).click();
			Thread.sleep(2000);
			
			List<WebElement> rb = driver.findElements(By.xpath("//input[@type='radio']"));
			
			for(WebElement radio : rb)
				
			{   System.out.println(radio.getAttribute("value"));
			
			}
	  
	   }
  @Test(priority=1)
  public void checkbox()
  {
	  driver.findElement(By.id("vfb-6-0")).click();
		
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-2")).click();
		
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement cbox : cb)
			
		{ System.out.println(cbox.getAttribute("id"));
		}
	
	}
  
  @BeforeMethod
  public void beforeMethod() 
	  
  {    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException 
  
  {
	  Thread.sleep(3000);
	  driver.close();
	  
  }

}
