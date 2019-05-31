package Testcases;

import org.testng.annotations.Test;

import pageobjects.DeleteAddEmployee;

public class Tc_4 extends Tc_1
{

	DeleteAddEmployee dae;
	@Test(priority=4)
	public void tc4() throws Exception
	{
		dae=new DeleteAddEmployee(driver);
		Thread.sleep(2000);
		dae.piimpage();
		
		dae.EmployeeList();
		dae.switchalert();
		dae.dropddd(null);
		Thread.sleep(2000);
		dae.searchname(serName);
		Thread.sleep(2000);
		dae.searchbutton();
		Thread.sleep(2000);
		dae.checkboxbutton();
		Thread.sleep(2000);
		dae.deletebutton();
		
	}

}
