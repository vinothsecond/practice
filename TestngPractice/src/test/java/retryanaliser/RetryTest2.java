package retryanaliser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest2 implements IRetryAnalyzer {
	int Retrycount = 0;
	int MaxRetrycount = 5;

	public boolean retry(ITestResult result) {
		if (result.isSuccess()) {
			result.setStatus(ITestResult.SUCCESS);
		} else {
			if (Retrycount < MaxRetrycount) {
		     System.out.println("Re-running "+result.getName()+"for "+(Retrycount + 1)+" time(S)");
				Retrycount++;
				result.setStatus(ITestResult.FAILURE);
				return true;
			} else {
				result.setStatus(ITestResult.FAILURE);
			}
		}

		return false;
	}

}
