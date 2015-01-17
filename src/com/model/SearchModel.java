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
public class SearchModel extends ModelBase {
	
	@FindBy(how=How.ID, using="gbqfq")
	WebElement typeText;
	
	@FindBy(how=How.ID, using="gbqfb")
	WebElement clickSearchButton;
	
	public SearchModel(WebDriver driver){
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public WebElement typeText() {
		return typeText;
	}

	public WebElement clickSearchButton() {
		return clickSearchButton;
	}

}
