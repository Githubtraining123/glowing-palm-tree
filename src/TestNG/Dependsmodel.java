package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


public class Dependsmodel {
	
 WebDriver driver;
  
 @Test
  public void f1() 
	  
	       {   driver.findElement(By.name("q")).sendKeys("India"); 
	           int a= 5/0;
	           
	       }  
		  
 @Test (dependsOnMethods = "f1")
   public void f2()
		  {    driver.findElement(By.cssSelector("[class='gNO89b'],[name='btnk'],[value='Google Search']")).click(); }
	  
 @Test
 public void f3()
 
 {  driver.navigate().back();
	  driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click(); }

  
 @BeforeMethod
  public void beforeMethod() {
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
	 driver = new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.google.co.uk/?gws_rd=ssl");
	
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
