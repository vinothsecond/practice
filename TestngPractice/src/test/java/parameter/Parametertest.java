package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	@Parameters({"username","url","password","VerificationCode"})
	@Test
	public void logintest(String username,String url,String password,String VerificationCode){
		System.out.println("enter username         : "+ username);
		System.out.println("enter url              : "+ url);
		System.out.println("enter password         : "+ password);
		System.out.println("enter VerificationCode : "+ VerificationCode);
	}

}
