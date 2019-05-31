package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.readconfig;



public class Baseclass
{
	
	readconfig rc=new readconfig();
	public String baseurl = rc.getbaseurl();
	public String username= rc.getusername();
	public String password=rc.getpassword();
	public String LastName=rc.getLastName();
	public String FirstName=rc.getFirstName();
	public String photofile=rc.getphotofile();
	public String LName=rc.getEditLastName();
	public String fName=rc.getEditFirstName();
	public String sell=rc.getselectelemet();
	public String sel=rc.maritalStatus();
	public String serName=rc.SearchName();
	 public WebDriver driver;
	 WebDriverWait wait;
    Actions act;
   
	public void setUp(String br) 
	{
		
		if (br.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", rc.getchromepath());
			driver = new ChromeDriver();
			

		} else if (br.equals("ie")) {

			System.setProperty("webdriver.ie.driver", rc.getiepath());
			driver = new InternetExplorerDriver();
			
		
		} else {
			System.out.println("driver not available");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseurl);
	
	}
  
public void close()
{
	driver.quit();
}
public void verifyhomepage(String title)
{
	if(driver.getTitle().equals(title))
	{
		System.out.println("homepage"+title);
	}

}
public void movetomouseover(WebElement element)
{
	Actions act=new Actions(driver);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	act.moveToElement(element).build().perform();
	
}
public void lickonmouseover(WebElement element)
{
	act.moveToElement(element).click().perform();
}
public void Switchtoelement()
{
	driver.switchTo().frame("rightMenu");
}
public void Switchtodefaultelement()
{
	driver.switchTo().defaultContent();
}
public void dropdowncommands(WebElement aaaa,String str)
{
	Select ss=new Select(aaaa);
	//ss.selectByVisibleText(str);
	ss.selectByIndex(3);
}
	
}

