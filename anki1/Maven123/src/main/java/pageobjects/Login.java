package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcases.Baseclass;

public class Login extends Baseclass
{
WebDriver driver;


	@FindBy(name="txtUserName")
	WebElement txtusername;
	@FindBy(name="txtPassword")
	WebElement txtPassword;
	@FindBy(name="Submit")
	WebElement Submit;
	@FindBy(linkText="Logout")
	WebElement Logout;
	 public Login(WebDriver driver)
	 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
	 }

	
	

	public void setusername(String user)
	{
		txtusername.sendKeys(user);
	}
	public void setpassword(String spass)
	{
		txtPassword.sendKeys(spass);
	}
	public void setlogin()
	{
		Submit.click();
	}
	public void setLogout()
	{
		Logout.click();
	}
	public void verifyhomepage(String title)
	{
		if(driver.getTitle().equals(title))
		{
			System.out.println("homepage"+title);
		}
		else
		{
			System.out.println("homepage"+title);
			return;
		}
		
	}
	
	
}
