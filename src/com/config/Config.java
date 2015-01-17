package com.config;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.controller.AppController;

/**
 * @author Saiful Azam
 * @Email saif0909@yahoo.com
 */
public class Config {
	protected WebDriver driver;
	private AppController google;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com");
	}

	@After
	public void pageClose() {
		driver.quit();
	}
	
	public AppController google(){
		if (google == null) {
			google = new AppController(driver);
		}
		return google;
	}

}
