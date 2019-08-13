package Testngforlisteners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testngforlisteners.ListenersBasic.class)

public class Listenerwithtc {
	
	@Test
	public void f1()
	{ System.out.println("This is test1"); }
	
	@Test
	public void f2()
	{ System.out.println("This is test2"); }
	
	@Test
	public void f3()
	{ System.out.println("This is test3"); }
	
	@Test
	public void f4()
	{ System.out.println("This is test4"); }
	

}
