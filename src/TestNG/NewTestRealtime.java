package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestRealtime {
	
	WebDriver driver;

	@BeforeSuite
      public void beforeSuite()
	{ System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe"); }
	
	@BeforeTest
	  public void BeforeTest()
	{   driver = new ChromeDriver(); }
	
	 @BeforeClass
	  public void beforeClass() 
	 { driver.get("https://www.google.co.uk/?gws_rd=ssl"); }
	  
	
	 @BeforeMethod
	  public void beforeMethod() throws Exception
	 { Thread.sleep(2000); }
	 
	 
	  @Test
     public void f1()
       {   driver.findElement(By.name("q")).sendKeys("India"); }  
	  
	  @Test
	  public void f2()
	  {    WebElement s= driver.findElement(By.cssSelector("[class='gNO89b'],[name='btnk'],[value='Google Search']")); 
	  		s.click();
	  		
	  }
      @Test
       public void f3()
       
       {  driver.navigate().back();
    	  driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click(); }
    
       
  @AfterMethod
  public void afterMethod() throws Exception 
  { Thread.sleep(2000); }
 
  @AfterClass
  public void afterClass() 
  {  System.out.println(driver.getTitle()); }
  
 @AfterTest
  public void afterTest()
  { driver.close(); }
  
 @AfterSuite
  public void afterSuite()
   { driver.manage().deleteAllCookies(); }
  }


