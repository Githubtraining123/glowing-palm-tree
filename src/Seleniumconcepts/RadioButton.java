package Seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.id("vfb-7-1")).click(); 
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-7-2")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> rb = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement radio : rb)
			
		{   System.out.println(radio.getAttribute("value"));
		
		}
		
		/*isSelected**isDisplayed**isEnabled*/
		
		WebElement rb1 = driver.findElement(By.id("vfb-7-1")); 
		rb1.click();
		
		/*if(rb1.isSelected())
		{ System.out.println("option 1 is selected");
		
		}
		
		else { System.out.println("Not selected");
		}
		
		
		if(rb1.isDisplayed())
		{ System.out.println("option 1 is displayed");
		
		}
		else { System.out.println("not displayed");
		
		}
		*/
		
				
				
				
		
		
	}

}
