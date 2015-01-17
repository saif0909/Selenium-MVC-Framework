package com.controller;

import org.openqa.selenium.WebDriver;

/**
 * @author Saiful Azam
 * @Email saif0909@yahoo.com
 */
public class AppController {
	private WebDriver driver;
	private GmailLoginController gmailLogin;
	private SearchController search;
	
	public AppController(WebDriver driver){
		this.driver = driver;
	}
	
	public GmailLoginController gmailLogin(){
		if (gmailLogin == null) {
			gmailLogin = new GmailLoginController(driver);
		}
		return gmailLogin;
	}
	
	public SearchController search(){
		if (search == null) {
			search = new SearchController(driver);
		}
		return search;
	} 

}
