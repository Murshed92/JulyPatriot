package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JulyPatirotGoogleSearch {
	
	WebDriver driver;

	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize();
		 

	}

	@When("I enter the search {string}")
	public void i_enter_the_search(String string) {
		
		WebElement searchBox;
		searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(string);

	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
		WebElement searchButton;
		searchButton = driver.findElement(By.name("btnk"));
		searchButton.click();
		

	}

	@Then("I receive ralated search results")
	public void i_receive_ralated_search_results() {
		
		WebElement resultstats;
		resultstats = driver.findElement(By.id("result-stats"));
		
		String results = resultstats.getText();
		
		System.out.println("===========================");
		System.out.println(results);
		System.out.println("===========================");
		

	}

}
