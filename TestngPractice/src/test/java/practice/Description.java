package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Description {
	
	@Test(priority=1,description="login to the database-unionbank")
	public void loginDB(){	
		System.out.println("login to database");
		
	}
	@Test(priority=2,description="login to bank account-3527542775000")
	public void loginBankAccount(){
		System.out.println("login to bank account");
		
	}
	@Test(priority=3,description="enter the username-vinothranjan")
	public void a_EnterUsername(){
		System.out.println("enter the username");
		
	}
	@Test(priority=3,description="enter the data of birth-03-02-1993")
	public void b_Enterdateofbirth(){
		System.out.println("enter the data of birth");
		
	}
	@Test(priority=4,description="enter the password-coolvino")
	public void EnterPassword(){
		System.out.println("enter the password");
		
	}
	@Test(priority=5,description="click login button to enter")
	public void ClickLogin(){
		System.out.println("click login button");
		
	}
	

}
