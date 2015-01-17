package com.view;

import org.junit.Test;

import com.config.Config;

/**
 * @author Saiful Azam
 * @Email saif0909@yahoo.com
 */

public class Search extends Config {
	
	@Test
	public void testCase1(){
		google().search().typeText("Music");
		google().search().clickSearchButton();
	}
	
	@Test
	public void testCase2(){
		google().search().typeText("Best Music 2014");
		google().search().clickSearchButton();
	}
	
	@Test
	public void testCase3(){
		google().search().typeText("Selenium");
		google().search().clickSearchButton();
	}
	
	@Test
	public void testCase4(){
		google().search().typeText("Java");
		google().search().clickSearchButton();
	}

}
