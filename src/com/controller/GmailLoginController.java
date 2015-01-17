package com.controller;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import com.model.GmailLoginModel;

/**
 * @author Saiful Azam
 * @Email saif0909@yahoo.com
 */
public class GmailLoginController extends BaseController {
	private GmailLoginModel gmailLoginModel;
	
	public GmailLoginController(WebDriver driver) {
		super(driver);
		gmailLoginModel = new GmailLoginModel(driver);
	}
	
	public void clickGmail(){
		waitTimes(3000);
		gmailLoginModel.clickGmail().click();
	}
	
	public void clickSignIn(){
		waitTimes(3000);
		gmailLoginModel.clickSignIn().click();
	}
	
	public void emailAddress(String enterEmailAddress){
		waitTimes(1000);
		gmailLoginModel.emailAddress().sendKeys(enterEmailAddress);
	}
	
	public void password(String enterPassword){
		waitTimes(1000);
		gmailLoginModel.password().sendKeys(enterPassword);
	}
	
	public void clickSignInButton(){
		waitTimes(3000);
		gmailLoginModel.clickSignInButton().click();
	}
	
	public boolean verifyLoginError(String expectingError){
		waitTimes(3000);
		String error = gmailLoginModel.verifyErrorMgs().getText();
		assertEquals(expectingError, error);
		return false;
	}

}
