package com.voyager.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.voyager.qa.base.TestBase;

public class ZooplaHomePage extends TestBase {
	
	@FindBy(xpath = "//input[@name='q']")
	WebElement search_location;

	
	@FindBy(xpath = "//button[@id='search-submit']")
	WebElement searchbtn;


//Initializing the page object
			public ZooplaHomePage() {
			PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)
				
		}
			
			
			public boolean searchlocation() {
				
				  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("London");
				  searchbtn.click();
				  return true;
				}
			
			
			 public  SearchPage VefifySearchPage() {
				  return new SearchPage();
			  }
			  
			
			
}