package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TC01 {
	
	@Test
	public void goToHomepage() throws MalformedURLException {
		
		DesiredCapabilities capable = new DesiredCapabilities();
		capable.setBrowserName("chrome");
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.6:4444"), capable);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Selenium Grid");
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());
		
		if(driver!=null) {
			driver.close();
		}
		
	}

}
