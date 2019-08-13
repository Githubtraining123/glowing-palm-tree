package Seleniumconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//int MCXcols = driver.findElements(By.xpath("//a[contains(text(),'MCX')]/parent::*/parent::*/td")).size();
	
	//System.out.println("col size is"+ MCXcols);
	
	//int totalrows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
	
	//System.out.println("size of all colms is "+ totalrows);
	
	List<WebElement> rownames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	
	/* Here i just want to print the company names, so td[1]*/
	
	//for(i=1; i<
		
		
		
		
		
		
		
		
	}

}
