package com.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Saiful Azam
 * @Email saif0909@yahoo.com
 */
public class GmailLoginModel extends ModelBase{
	
	@FindBy(how=How.XPATH, using=".//*[@id='gb']/div[1]/div[1]/div[1]/div[2]/a")
	WebElement clickGmail;
	
	@FindBy(how=How.ID, using="gmail-sign-in")
	WebElement clickSignIn;
	
	@FindBy(how=How.ID, using="Email")
	WebElement emailAddress;
	
	@FindBy(how=How.ID, using="Passwd")
	WebElement password;
	
	@FindBy(how=How.ID, using="signIn")
	WebElement clickSignInButton;
	
	@FindBy(how=How.ID, using="errormsg_0_Passwd")
	WebElement verifyErrorMgs;
	
	public GmailLoginModel(WebDriver driver){
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public WebElement clickGmail() {
		return clickGmail;
	}

	public WebElement clickSignIn() {
		return clickSignIn;
	}

	public WebElement emailAddress() {
		return emailAddress;
	}

	public WebElement password() {
		return password;
	}

	public WebElement clickSignInButton() {
		return clickSignInButton;
	}
	
	public WebElement verifyErrorMgs() {
		return verifyErrorMgs;
	}
	
	

}
