package Seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.id("vfb-6-0")).click();
		
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-2")).click();
		
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement cbox : cb)
			
		{ System.out.println(cbox.getAttribute("id"));
		}
		

	}

}
