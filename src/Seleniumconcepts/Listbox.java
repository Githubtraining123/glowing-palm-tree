package Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {

      System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
		
		
		WebElement listbox = driver.findElement(By.xpath("//select[@class='form-control pickListSelect pickData']"));
		
		Select sel = new Select(listbox);
		
		sel.selectByVisibleText("Alice");
		sel.selectByVisibleText("Isabella");
		sel.selectByVisibleText("Laura");		
		Thread.sleep(2000);
		sel.deselectByVisibleText("Alice");
		
		Thread.sleep(2000);
		
		sel.deselectAll();
		
		
		
		
		
	}

}
