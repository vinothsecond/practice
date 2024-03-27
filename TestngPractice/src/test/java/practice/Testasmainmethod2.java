package practice;

import org.testng.annotations.Test;

public class Testasmainmethod2 {
	@Test(timeOut=5000)
	public void Gatherdetails() throws InterruptedException{
		Thread.sleep(4000);	
		System.out.println("gather the details required");
	}
}
