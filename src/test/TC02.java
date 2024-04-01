package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TC02 {
	
	@Test
	public void goToHomepage() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities capable = new DesiredCapabilities();
		capable.setBrowserName("firefox");
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.6:4444"), capable);
		driver.get("https://rahulshettyacademy.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		if(driver!=null) {
			driver.close();
		}
		
		
	}

}
