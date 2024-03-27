package practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationtest {
	@BeforeTest
	public void putonthesystem(){	
		System.err.println("********putonthesystem********");
	}
	@AfterTest
	public void ShutDownSystem(){
		System.err.println("********ShutDownSystem*******");
	}
	@BeforeMethod
	public void enablenetconnection(){	
		System.out.println("------------enablenetconnection-------------");
	}
	@AfterMethod
	public void disablenetconnection(){
		System.out.println("-----------disablenetconnection---------");
	}
	@BeforeMethod
	public void openbrowser(){	
		System.out.println("------------openbrowser-------------");
	}
	@AfterMethod
	public void closebrowser(){
		System.out.println("-----------closebrowser---------");
	}

	@Test(priority=1)
	public void loginDB(){	
		System.out.println("login to database");
	}
	@Test(priority=2)
	public void loginBankAccount(){
		System.out.println("login to bank account");
	}
	@Test(priority=3)
	public void a_EnterUsername(){
		System.out.println("enter the username");
	}
	
	@Test(priority=4)
	public void EnterPassword(){
		System.out.println("enter the password");
	}
	@Test(priority=5)
	public void ClickLogin(){
		System.out.println("click login button");
	}
}
