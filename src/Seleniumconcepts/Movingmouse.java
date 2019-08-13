package Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movingmouse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Smart Home")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
