package Testcases;

import org.testng.annotations.Test;

import pageobjects.Addemployee;

public class Tc_2 extends Tc_1
{
	
	Addemployee add;
	@Test(priority=2)
	public void Tc2() throws Exception{

	verifyhomepage("OrangeHRM");
add=new Addemployee(driver);

add.setpim();
add.setaddemp();
add.frame();
add.SetLName(LastName);
add.SetFName(FirstName);

add.setphotofile(photofile);
add.setSave();
	}

}

