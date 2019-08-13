package Seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browserlaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:\\www.amazon.in");
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().maximize()
		//driver.navigate().to("https:\\www.ebay.com");
		//driver.navigate().back();
		// driver.navigate().forward();
		// driver.navigate().refresh();
		driver.manage().window().maximize();
		//driver.close();
		//driver.quit();
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getTitle());
		
		
		
		
		

	}

}
