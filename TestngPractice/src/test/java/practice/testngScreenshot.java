package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngScreenshot {
	WebDriver wd;

	@Test(priority = 1)
	public void googlepage() {
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
	}

	@Test(priority = 2)
	public void bingpage() {
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		int i=1/0;
	}

	@Test(priority = 3)
	public void yahoopage() {
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://in.search.yahoo.com/?fr2=inr");
	}
@AfterMethod
	public void teardown(ITestResult testcase) throws IOException {
		if (testcase.isSuccess()) {
			screenshot(wd, testcase.getName() + "pass");

		} else {
			screenshot(wd, testcase.getName() + "fail");

		}
	}

	public void screenshot(WebDriver wd, String name) throws IOException {
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:/vcentry/vcentry batch264/TestngPractice/screenshot/"+name+".png"));
	}

}
