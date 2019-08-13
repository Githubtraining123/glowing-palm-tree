import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().deleteAllCookies();
		
		driver.get("https:\\www.amazon.in");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("nav-link-accountList")).click();
		
		//driver.findElement(By.name("field-keywords")).sendKeys("books");
		
		//driver.findElement(By.className("nav-input")).click();******* (have no of classes with this value)
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		
		//driver.findElement(By.partialLinkText("Air Tight")).click();
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		for (WebElement link : Links)
		{
			if(!link.getText().equals(""))
		
		{
		
		System.out.println(link.getText());
		}
		
		}
		System.out.println(Links.size());
	}
		
		
	
}
		
		
		
		
	
		
				
				
	

