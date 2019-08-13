package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignoretest {
	
	@Test
	public void f1()
	{
	System.out.println("This is test1");
	}
	
	@Ignore
	@Test
	public void f2()
	{
	System.out.println("This is test2");
	}
	
	
	@Test
	public void f3()
	{
	System.out.println("This is test3");
	}
	
	@Test
	public void f4()
	{
	System.out.println("This is test4");
	}
	
	@Test
	public void f5()
	{
	System.out.println("This is test5");
	}


}
