package pageobjects;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcases.Baseclass;

public class EditAddEmployee extends Baseclass
{
	Action act;
	
	@FindBy(name="EditMain")
	WebElement edit;
	
	@FindBy(name="txtEmpLastName")
	WebElement txtEmpName;
	
	@FindBy(xpath="//input[@id='txtEmpLastName']")
	WebElement txtempName1;
	
	@FindBy(name="txtEmpFirstName")
	WebElement txtEmpFName;
	
	@FindBy(xpath="//*[@id='txtEmpFirstName']")
	WebElement txtEmpFName1;
	
	@FindBy(xpath="//*[@id='cmbNation']")
	WebElement select;
	@FindBy(xpath="//*[@id='cmbMarital']")
	WebElement marage;
	@FindBy(xpath="(//input[@name='EditMain'])[1]")
	WebElement savee;
	@FindBy(xpath="//span[contains(..,'PIM')]")
	WebElement pimm;
	@FindBy(xpath="//span[contains(..,'Employee List')]")
	WebElement EmpSearch;
	
public EditAddEmployee(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void setEdit()
{
	edit.click();
}
public void hrmeditemployee()
{
	txtEmpName.clear();
	
}
public void hrmeditemp(String last)
{
txtempName1.sendKeys(last);
}
public void hrmeditFname()
{
	txtEmpFName.clear();
}
public void hrmeditFName1(String first)
{
	txtEmpFName1.sendKeys(first);
}
public void selectcommand(String sele)
{
	dropdowncommands(select,  sele);

}
public void dropdowncomm(String sel)
{
	dropdowncommands(marage, sel);
}
public void clicksavebutton()
{
	savee.click();
}
public void backHomePage()
{
Switchtodefaultelement();
}
public void pimpage()
{
	movetomouseover(pimm);
}
public void EmployeeList()
{
	movetomouseover(EmpSearch);
	EmpSearch.click();
}
}
