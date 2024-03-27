package retry2;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserstack {
	public static final String USERNAME = "vinothranjan_AGqwYg";
	public static final String AUTOMATE_KEY = "HCyfppPZqYV66SdPGZ94";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	
		public static void main(String[] args) throws InterruptedException, IOException {
			MutableCapabilities capabilities = new MutableCapabilities();
			capabilities.setCapability("browserName", "Safari");
			HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
			browserstackOptions.put("os", "OS X");
			browserstackOptions.put("osVersion", "Sonoma");
			browserstackOptions.put("browserVersion", "17.0");
			browserstackOptions.put("projectName", "Practice3");
			browserstackOptions.put("buildName", "Build-practice3");
			browserstackOptions.put("sessionName", "Sample-practice3");
			browserstackOptions.put("local", "false");
			browserstackOptions.put("debug", "true");
			browserstackOptions.put("networkLogs", "true");
			browserstackOptions.put("seleniumVersion", "4.15.0");
			capabilities.setCapability("bstack:options", browserstackOptions);
			
			WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), capabilities);
			driver.get("https://www.google.co.in/");
		WebElement input=	driver.findElement(By.name("q"));
		input.sendKeys("animation");
		input.submit();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:/vcentry/vcentry batch264/TestngPractice/screenshot/browserstack.png"));
		driver.quit();
		

	}

}
