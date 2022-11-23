package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JulyPatriotGoogleHomePage {
	
	// page object model-- separation of web elements 
	// from step definition
	
	//page factory or without page factory
	
	WebDriver driver;
	
	public JulyPatriotGoogleHomePage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement  searchBox =driver.findElement(By.name("q"));
	@FindBy (name="q")
	WebElement searchBox;
	
	//searchBox.sendKeys(string);
	
	public void  enterSearch(String string) {
		
		searchBox.sendKeys(string);
	}
	
	
	

}
