package retry2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry2 implements IRetryAnalyzer {
	int Retrycount =0;
	int Maxretrycount=5;

	public boolean retry(ITestResult result) {
		if(result.isSuccess()){
			result.setStatus(ITestResult.SUCCESS);
		}else{
			if(Retrycount<Maxretrycount){
				System.out.println("Retrying -"+result.getName()+"for"+(Retrycount+1)+"time(S)");
			Retrycount++;
			result.setStatus(ITestResult.FAILURE); 
			return true;
			}else{
				result.setStatus(ITestResult.FAILURE);
			}
		}
		
		return false;
	}

	

}
