package Testcases;

import org.testng.annotations.Test;

import pageobjects.EditAddEmployee;

public class Tc_3 extends Tc_2
{
	EditAddEmployee EAdd;
	@Test(priority=3)
	public void Tc3()throws Exception
	{
  EAdd=new EditAddEmployee(driver);
 EAdd.setEdit();
 Thread.sleep(2000);
 EAdd.hrmeditemployee();
  EAdd.hrmeditemp(LName);
 EAdd.hrmeditFname();
 EAdd.hrmeditFName1(fName);
 EAdd.selectcommand(sell);
 EAdd.dropdowncomm(sel);
 EAdd.clicksavebutton();
 EAdd.backHomePage();
 EAdd.pimpage();
 EAdd.EmployeeList();
}
}