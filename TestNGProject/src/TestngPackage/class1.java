package TestngPackage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class1 
{
@BeforeClass 

public void method1()

{
	System.out.println("method1");
}
@AfterClass
public void method2()
{
System.out.println("method2");	
}

@Test
public void method3()
{
	System.out.println("method3");
	Reporter.log("testng frame work");
	
}
@Test
public void method4()
{
	System.out.println("method4");
}
}
