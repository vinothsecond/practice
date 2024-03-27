package practice;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Itestresult {
	
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
	@AfterMethod
	public void teardown(ITestResult result){
		System.out.println("host - "+result.getHost());
		System.out.println("endmills - "+result.getEndMillis());
		System.out.println("instance - "+result.getInstance());
		System.out.println("instance name - "+result.getInstanceName());
		System.out.println("name - "+result.getName());
		System.out.println("startmills - "+result.getStartMillis());
		System.out.println("status - "+result.getStatus());
		System.out.println("testname - "+result.getTestName());
		System.out.println("success - "+result.isSuccess());
		System.out.println("method - "+result.getMethod());
		System.out.println("parameters - "+result.getParameters());
		System.out.println("testclass - "+result.getTestClass());
		System.out.println("CREATED"+result.CREATED);
		System.out.println("STARTED"+result.STARTED);
		System.out.println("SUCCESS"+result.SUCCESS);
		System.out.println("SKIP"+result.SKIP);
		System.out.println("---------------------------");
	}
	

}
