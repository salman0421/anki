package TestngPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class multiPerameters {
private static WebDriver driver;
@Test
@Parameters({"strURL","sUsername","sPassword"})
public void test(String strURL,String sUsername, String sPassword)
{
driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(strURL);
driver.findElement(By.name("txtUserName")).sendKeys(sUsername);
driver.findElement(By.name("txtPassword")).sendKeys(sPassword);
driver.findElement(By.name("Submit")).click();
driver.findElement(By.linkText("Logout")).click();
driver.close();
driver.quit();
}
}
