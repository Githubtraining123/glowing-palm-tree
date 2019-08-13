package TestNG;

import org.testng.annotations.Test;

@Test(groups = {"Allclasstests"})
public class GroupsDemo {

	@Test(groups = {"windows.Smoke"})
	public void Test1()
	{ System.out.println("This is test1");
	}
	
	@Test(groups = {"sanity","Regression"})
	public void Test2()
	{ System.out.println("This is test2");
	}
	
	@Test(groups = {"Regression"})
	public void Test3()
	{ System.out.println("This is test3");
	}
	
	@Test(groups = {"windows.sanity"})
	public void Test4()
	{ System.out.println("This is test4");
	}
	
	@Test(groups = {"Regression"})
	public void Test5()
	{ System.out.println("This is test5");
	}
	
	@Test
	public void Test6()
	{ System.out.println("This is test6");
	}
	
	
	
	
	
	
	
	

	}


