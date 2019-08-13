package Seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.phptravels.net/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String mon = "November 2019";
		String date = "21";
		
		
		driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")).click();
		
 WebElement month = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[2]"));
		
		while(true)
			
		{ 
			if(month.getText().equals(mon))
			 
				break;
			
			else
			{  
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[3]")).click();
			    Thread.sleep(1000);	
			
			}
		}
		
		driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr[4]/td[5]")).click();
		
		// For checkout
		
		String mon2 = "December 2019";
		String date2 = "5";
		
 WebElement month2 = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/thead/tr[1]/th[2]"));
		
		while(true)
			
		{ 
			if(month2.getText().equals(mon2))
			 
				break;
			
			else
			{  
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/thead/tr[1]/th[3]")).click();
			    Thread.sleep(1000);	
			
			}
		}
		
		//Checkout date selection
		
		
driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/tbody/tr[2]/td[contains(text(),'"+date2+"')]")).click();
		

			
		
		
		
		
		
	}
	
	
	
	
	

}
