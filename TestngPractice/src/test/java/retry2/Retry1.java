package retry2;

import org.testng.annotations.Test;

public class Retry1 {
	@Test(invocationTimeOut=3000,retryAnalyzer=Retry2.class)
	public static void logintest() throws InterruptedException{
		System.out.println("enterusername");
		System.out.println("enterpassword");
		System.out.println("enterotp");
		System.out.println("click login");
		System.out.println("process complete");
		Thread.sleep(4000);
	}

}
