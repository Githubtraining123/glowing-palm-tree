package Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			
	        driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.247826311.1444124840.1563397298-725315200.1563397298");
		
		    driver.switchTo().frame("login_page");
		    
		    driver.findElement(By.name("fldLoginUserId")).sendKeys("hari");
		
		
	}

}
