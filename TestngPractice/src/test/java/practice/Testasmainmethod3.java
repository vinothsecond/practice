package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testasmainmethod3 {
	@Test(priority=-1)
	public void Gatherdetails(){
		System.out.println("gather the details required");
	}
	@Test(priority=0)
	public void Gotobank(){
		//System.out.println("Go to bank");
		Reporter.log("Go to bank");
	}
	@Test(priority=1)
	public void loginDB(){		
		//System.out.println("login to database");
		Reporter.log("login to database");
	}
	@Test(priority=2)
	public void loginBankAccount(){
		//System.out.println("login to bank account");
		Reporter.log("login to bank account");
	}
	@Test(priority=3)
	public void a_EnterUsername(){
		//System.out.println("enter the username");
		Reporter.log("enter the username");
	}
	@Test(priority=3)
	public void b_Enterdateofbirth(){
		//System.out.println("enter the data of birth");
		Reporter.log("enter the data of birth");
	}
	@Test(priority=4,invocationCount=5)
	public void EnterPassword(){
	//	System.out.println("enter the password");
		Reporter.log("enter the password");
	}
	@Test(priority=5)
	public void ClickLogin(){
		//System.out.println("click login button");
		Reporter.log("click login button");
	}
	

}
