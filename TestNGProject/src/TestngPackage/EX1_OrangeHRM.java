package TestngPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EX1_OrangeHRM 
{
WebDriver driver;
WebDriverWait wait;
@BeforeClass
public void config()
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
	driver=new ChromeDriver();
	wait=new WebDriverWait(driver, 30);
	driver.manage().window().maximize();
}

@AfterClass
public void Shutdown()
{
	driver.close();
	driver.quit();
}
	
@Test

public void VerifyOrangeHrm()

{
driver.get("http://apps.qaplanet.in/hrm/login.php");
wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));

//verify homehage
assertEquals(driver.getTitle(),"OrangeHRM - New Level of HR Management");
Reporter.log("Homepage is Displayed");

//create username,password
WebElement sUN=driver.findElement(By.name("txtUserName"));
WebElement sPW=driver.findElement(By.name("txtPassword"));

//verify Un,Pw
assertTrue(sUN.isDisplayed()&&sPW.isDisplayed());
Reporter.log("UN,PW are Exists");

//type username,password
String username="qaplanet1";
sUN.sendKeys(username);
String password="lab1";
sPW.sendKeys(password);

//click on login
driver.findElement(By.name("Submit")).click();
//verify homepage is displayed
wait.until(ExpectedConditions.titleIs("OrangeHRM"));
//verify homepage
assertEquals(driver.getTitle(),"OrangeHRM");
Reporter.log("Orange hrm Page is Displayed");

//Get Welcome text
String Weltext=driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
//VERIFY WELCOME TEST
assertEquals(Weltext,"Welcome "+username);
//Reporter.log("Welcome "+username+" displayed");;
Reporter.log("Welcome "+username+" displayed");
//click on logout
driver.findElement(By.linkText("Logout")).click();


wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
//verify homepage
assertEquals(driver.getTitle(),"OrangeHRM - New Level of HR Management");
Reporter.log("Homepage is Displayed");
	
	
	
}
	

}
