package TestngPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ex2_OrangeHrm
{
WebDriver driver;
WebDriverWait wait;
private String username;
@BeforeClass
public void Setup()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver.exe");
	driver=new ChromeDriver();
	wait=new WebDriverWait(driver,30);
	driver.manage().window().maximize();
}
@AfterClass
public void shutdown()
{
	driver.close();
	driver.quit();
}
@Test
public void OrangeHrmEx2()
{
	driver.get("http://apps.qaplanet.in/hrm/login.php");
	wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
	{
		Reporter.log("HomePage Is Displayed");
	}
	
	WebElement Un=driver.findElement(By.name("txtUserName"));
	Un.sendKeys("qaplanet1");
	WebElement Pwd=driver.findElement(By.name("txtPassword"));
	Pwd.sendKeys("lab1");
	if (Un.isDisplayed()&&Pwd.isDisplayed())
	{
	Reporter.log("Username & password is displayed");	
	}
  driver.findElement(By.name("Submit")).click();
	
	wait.until(ExpectedConditions.titleIs("OrangeHRM"));
	if(driver.getTitle().equals("OrangeHRM"))
	{
		Reporter.log("OrangeHrm Page Is Displayed");
	}
	String weltext=driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText();
	if (weltext.equals("Welcome"+username))
	{
		Reporter.log("Welcome"+username+"displayed");
	}

	driver.findElement(By.linkText("Logout")).click();
	
	wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
	if (driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
	{
	Reporter.log("signoff successful & homepage displayed");	
	}

}
}
