package com.controller;

import org.openqa.selenium.WebDriver;
import com.model.SearchModel;

/**
 * @author Saiful Azam
 * @Email saif0909@yahoo.com
 */
public class SearchController  extends BaseController{
	private SearchModel searchModel;
	
	public SearchController(WebDriver driver){
		super(driver);
		searchModel = new SearchModel(driver);
	}
	
	public void typeText(String typeText){
		waitTimes(1000);
		searchModel.typeText().sendKeys(typeText);
	}
	
	public void clickSearchButton(){
		searchModel.clickSearchButton().click();
		waitTimes(3000);
	}

}
