package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {


@Test (invocationCount = 100, invocationTimeOut = 2) //it will execute as many times as it can within 2 seconds

public void sum()
{
  int a =2;
  int b = 3;
  
  int sum= a+b;
  System.out.println("value of a+b is:" + sum);
  
  
}
  


}
