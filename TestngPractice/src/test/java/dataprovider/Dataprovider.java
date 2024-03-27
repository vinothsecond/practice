package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider ="dataset")
	public void logintest(String username,String url,String password,String otp){
		System.out.println("enter username : "+username);
		System.out.println("enter url      : "+url);
		System.out.println("enter password : "+password);
		System.out.println("enter otp      : "+otp);
		System.out.println("-------click login--------");
	}
	@DataProvider(name="dataset")
	public static Object[][] input(){
		Object[][] data = new Object[3][4];
		data[0][0]="vinoth";
		data[0][1]="sampleurl-1";
		data[0][2]="password-1";
		data[0][3]="12345";
		
		data[1][0]="dinesh";
		data[1][1]="sampleurl-2";
		data[1][2]="password-2";
		data[1][3]="12345";
		
		data[2][0]="sai";
		data[2][1]="sampleurl-3";
		data[2][2]="password-3";
		data[2][3]="12345";
		
		return data;
		
	}

}
