package TestNG;

import org.testng.annotations.Test;

public class Exceptionhandling {
	
	
	@Test(expectedExceptions = Exception.class) // Arithmetic exception here 
	//If we don't know which exception we are dealing with, we can directly say Exception superclass.
	// it covers everything
	
	public void f()
	
	{ int i = 5/0;
		System.out.println("Value of i is:"+ i);
		
	}
	
	
	
	
	

}
