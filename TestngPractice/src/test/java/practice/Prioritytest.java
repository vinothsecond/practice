package practice;

import org.testng.annotations.Test;

public class Prioritytest {
	@Test(priority=-1)
	public void Gatherdetails(){
		System.out.println("gather the details required");
	}
	@Test(priority=0)
	public void Gotobank(){
		System.out.println("Go to bank");
	}
	@Test(priority=1)
	public void loginDB(){
		int i=1/0;
		System.out.println("login to database");
	}
	@Test(priority=2,dependsOnMethods="loginDB")
	public void loginBankAccount(){
		System.out.println("login to bank account");
	}
	@Test(priority=3,dependsOnMethods="loginBankAccount")
	public void a_EnterUsername(){
		System.out.println("enter the username");
	}
	@Test(priority=3,dependsOnMethods="a_EnterUsername")
	public void b_Enterdateofbirth(){
		System.out.println("enter the data of birth");
	}
	@Test(priority=4,dependsOnMethods="b_Enterdateofbirth")
	public void EnterPassword(){
		System.out.println("enter the password");
	}
	@Test(priority=5,dependsOnMethods="EnterPassword")
	public void ClickLogin(){
		System.out.println("click login button");
	}
	

}
