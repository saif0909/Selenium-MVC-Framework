package com.controller;

import org.openqa.selenium.WebDriver;

/**
 * @author Saiful Azam
 * @Email saif0909@yahoo.com
 */
public class BaseController {
protected WebDriver driver;
	
	public BaseController(WebDriver driver){
		this.driver = driver;
	}
	
	public void waitTimes(long enterTime){
		try {
			Thread.sleep(enterTime);
		} catch (InterruptedException e) {
		}
	}


}
