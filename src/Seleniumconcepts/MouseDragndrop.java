package Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragndrop {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
	    Actions act = new Actions(driver);
	    
	   // act.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
	    
	    /* how to do the webelement on element*/
	
	/****Keyborad***/
	    
	    act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyDown(Keys.CONTROL).build().perform(); /****Not refreshing****/
	    
	    
	
	
	
	
	
	
	
	}

}
