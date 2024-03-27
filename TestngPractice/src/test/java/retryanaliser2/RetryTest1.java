package retryanaliser2;

import org.testng.annotations.Test;

public class RetryTest1 {
@Test(invocationTimeOut=3000,retryAnalyzer=RetryTest2.class)
	public static void logintest() throws InterruptedException {
		System.out.println("open browser");
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click login");
		System.out.println("process complete");
		Thread.sleep(4000);

	}

}
