package Testcases;

import org.testng.Reporter;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import pageobjects.Login;

public class Tc_1 extends Baseclass
{
Login log;
	
	@BeforeSuite
	public void launch(){
		
		setUp("chrome");
		System.out.println("maximize the broswer");
		 
		}
	@Test(priority=1)
	public void Tc1() throws Exception{
    log=new Login(driver);
   Reporter.log("enter username");
   
   log.setusername(username);
   Thread.sleep(1000);
   Reporter.log("enter password");
	log.setpassword(password);
	   Thread.sleep(2000);
	Reporter.log("enter submit or clear");
	log.setlogin();
	   Thread.sleep(2000);
	 
   Reporter.log("verify homepage");
	
	verifyhomepage("OrangeHRM");
	

	}

	

}
