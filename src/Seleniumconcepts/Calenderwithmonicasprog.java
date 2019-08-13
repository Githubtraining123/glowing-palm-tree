package Seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderwithmonicasprog {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String mon = "November 2019";
		//String date = "21";
		
		driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")).click();

		WebElement month = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[2]")); // July 2019
		
		while(true)
		{
			if(month.getText().equals(mon))
				break;
			else {
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[3]")).click();
				Thread.sleep(1000);
			}
			
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr[4]/td[5]")).click();
		
		//CHECK OUT
		
		String mon2 = "December 2019";
		String date2 = "5";
		
		//Current Month selection
		WebElement month2 = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/thead/tr[1]/th[2]")); //November 2019
		
		while(true)
		{
			if(month2.getText().equals(mon2))
				break;
			else {
				//Month forward button
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/thead/tr[1]/th[3]")).click();
				Thread.sleep(1000);
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
