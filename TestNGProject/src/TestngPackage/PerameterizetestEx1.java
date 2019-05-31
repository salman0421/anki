package TestngPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PerameterizetestEx1
{
@Test
@Parameters("strUN")
public void PerameterizeTest(String strUN)
{
	System.out.println("Perameterized value is: "+strUN);
}
}
