package com.view;

import org.junit.Test;

import com.config.Config;

/**
 * @author Saiful Azam
 * @Email saif0909@yahoo.com
 */
public class Login extends Config {
	
	@Test
	public void negativeLoginTest(){
		google().gmailLogin().clickGmail();
		google().gmailLogin().clickSignIn();
		google().gmailLogin().emailAddress("test@gmail.com");
		google().gmailLogin().password("782716nskl");
		google().gmailLogin().clickSignInButton();
		google().gmailLogin().verifyLoginError("The email or password you entered is incorrect. ?");
	}
	
	@Test
	public void positivTest(){
		google().gmailLogin().clickGmail();
		google().gmailLogin().clickSignIn();
		google().gmailLogin().emailAddress("Enter your email");
		google().gmailLogin().password("Enter your Password");
		google().gmailLogin().clickSignInButton();
		
	}

}
