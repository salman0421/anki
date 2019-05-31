package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcases.Baseclass;

public class DeleteAddEmployee extends Baseclass
{
Actions act;
	
	@FindBy(xpath="//*[@id='pim']/a/span")
    WebElement piim;
	@FindBy(xpath="//span[contains(..,'Employee List')]")
	WebElement EmpSearch;
	@FindBy(name="loc_code")
	WebElement Select;
	@FindBy(name="loc_name")
	WebElement search;
	@FindBy(css="[value='Search']")
	WebElement button;
	@FindBy(name="allCheck")
	WebElement checkbox;
	@FindBy(css="[value='Delete']")
	WebElement delete;
    public DeleteAddEmployee(WebDriver driver2)
    {
    	
    PageFactory.initElements(driver2, this);	
    this.driver=driver2;
    }
    
    public void piimpage()
    {
    	movetomouseover(piim);
    }
    public void EmployeeList()
    {
    	movetomouseover(EmpSearch);
    	EmpSearch.click();
    }
    public void switchalert()
    {
    	Switchtoelement();
    }
    public void dropddd(String sa)
    {
    	dropdowncommands(Select, sa);
    	
    }
   public void searchname(String a)
   {
	   search.sendKeys(a);
   }
   public void searchbutton()
   {
	   button.click();
   }
   public void checkboxbutton()
   {
	   checkbox.click();
   }
   public void deletebutton()
   {
	   delete.click();
   }
}
