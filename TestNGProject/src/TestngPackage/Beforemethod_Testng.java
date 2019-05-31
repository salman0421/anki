package TestngPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforemethod_Testng
{
@BeforeMethod 
public void setup()
{
	System.out.println("Before Method");
}
@AfterMethod
public void shutdown()
{
	System.out.println("After Method");
}
@Test
public void method1()
{
	System.out.println("method1");
}
@Test
public void method2()
{
	System.out.println("method2");
}

}
