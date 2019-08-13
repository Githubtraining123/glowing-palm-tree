package Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSnXpath {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https:\\www.amazon.in");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("books");
		
		driver.findElement(By.cssSelector("[class='nav-input'],[value='Go'],[tabindex='10']")).click();
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[3]/div[1]/div[1]/a[2]")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Today's Deals')]").click();-----------------------Own Xpath
		
		
		
		
	}
	
}
		