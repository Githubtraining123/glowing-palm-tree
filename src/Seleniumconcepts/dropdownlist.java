package Seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlist {

	public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https:\\www.amazon.in");
		
		
	WebElement dropdownbox = driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(dropdownbox);
	
	//sel.selectByIndex(3);
	
	//sel.selectByValue("search-alias=baby");
	
	sel.selectByVisibleText("Clothing & Accessories"); //****how do we select an option like watches from this one****
	
	List<WebElement> option = sel.getOptions();
	
	for(WebElement ele : option)
		
	{ System.out.println(ele.getText());}
	
	//*****To get the default option selected
	
	WebElement firstopt = sel.getFirstSelectedOption();
	
	System.out.println(firstopt.getText());
	
	
	
	
	
	
	
		
		
		
	
	}

}
