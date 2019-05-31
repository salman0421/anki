package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class readconfig
{
Properties pro;
public readconfig()
{
FileInputStream file =null;
try {
	file=new FileInputStream("E:\\ankaiah\\Maven123\\src\\main\\resources\\Properties");
} catch (FileNotFoundException e) {

	e.printStackTrace();
}
	
	pro=new Properties();
	try {
		pro.load(file);
	} catch (IOException e) {
				e.printStackTrace();
				System.out.println("error"+e.getMessage());
	}
}


	public String getbaseurl()
	{
		String baseurl=pro.getProperty("url");
		return baseurl;
	}
	public String getusername()
	
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getpassword()
	{

	String password=pro.getProperty("password");
	return password;
    }
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
		
	}
	public String getiepath()
	{
		String iepath=pro.getProperty("iepath");
		return iepath;
		
	}
	public String getfirefoxpath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
		
	}
public String getLastName()
{
	String LastName=pro.getProperty("LastName");
	return LastName;
}
public String getFirstName()
{
	String FisrtName=pro.getProperty("FirstName");
	return FisrtName;
}
public String getphotofile()
{
	String photofile=pro.getProperty("photofile");
	return photofile;
}
@Test
public String getEditLastName()
{
	String Name=pro.getProperty("LName");
	return Name;
}
public String getEditFirstName()
{
	String fName=pro.getProperty("FName");
	return fName;
}
public String getselectelemet()
{
	String sell=pro.getProperty("select");
	return sell;
	
}
public String maritalStatus()
{
	String sel=pro.getProperty("marital");
	return sel;
	
}
public String SearchName()
{
	String serName=pro.getProperty("Search");
	return serName;
}
}

