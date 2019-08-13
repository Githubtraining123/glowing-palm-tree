package Seleniumconcepts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		
        driver.get("https://www.naukri.com/");
		
		//String winID = driver.getWindowHandle();
		
		//System.out.println("windowhandle id of " + driver.getTitle()+ "is"+ winID);
		
		Set<String> winIDs = driver.getWindowHandles();
		
		for(String ID : winIDs)
			
		{    driver.switchTo().window(ID);
		
		     System.out.println(driver.getTitle()+ID );
		     
		     String title = driver.getTitle();
		     
		     if(title.equals("LnT"))
		     {  driver.close();
		     }
		}
		
		
		
		
		
		
		
		
		
	}

}
