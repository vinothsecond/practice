package practice;

import org.testng.annotations.Test;

public class Prioritytest2 {
	
	@Test(priority=1)
	public void loginDB(){
		//int i=1/0;
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
