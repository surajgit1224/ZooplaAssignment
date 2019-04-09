package com.voyager.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.voyager.qa.base.TestBase;

public class AgentPage extends TestBase{

	@FindBy(xpath = "//h1[@class='bottom-half']")
	WebElement Same_Mentioned_Agent_Name;
	


	// Initializing the page object
		public AgentPage() {
		PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)

		}
	
		
		public boolean VerifySameAgentName() {
/*			
			 String  Same_Agent_Name = driver.findElement(By.xpath("//h1[@class='bottom-half']")).getText();
		     System.out.println("Agent phone ---> "+ Same_Agent_Name);
		     return true;*/
		     
			//String  Same_Agent_Name = driver.findElement(By.xpath("//h1[@class='bottom-half']")).getText();
			
			
			WebElement Same_Mentioned_Agent_Name = driver.findElement(By.xpath("//h1[@class='bottom-half']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", Same_Mentioned_Agent_Name);
			System.out.println("Agent phone ---> "+ Same_Mentioned_Agent_Name.getText());
			return true;
			
		}
	
	
	
	
	
}
