package com.voyager.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.voyager.qa.base.TestBase;

public class SelectFifthPrizeInfoPage extends TestBase {
	
	@FindBy(xpath = "//div[@class='ui-agent__logo']//img[@class='js-lazy-loaded']")
	WebElement Agent_logo;
	
	@FindBy(xpath = "//div[@class='dp-sidebar-wrapper__contact']//h4[@class='ui-agent__name'][contains(text(),'')]")
	WebElement Agent_Name;
	
	@FindBy(xpath = "//div[@class='dp-grid-wrapper']//p[@class='ui-agent__tel ui-agent__text']//a[1]")
	WebElement Agent_Phone;
	

	
	// Initializing the page object
		public SelectFifthPrizeInfoPage() {
		PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)

		}

		
		 
 public boolean  Verify_Agent_logo() {
		        
         String  Agent_logo = driver.findElement(By.xpath("//div[@class='ui-agent__logo']//img[@class='js-lazy-loaded']")).getText();
         System.out.println("Agent logo ---> "+ Agent_logo);
		return true;
	
	
			 }

  public boolean  Verify_Agent_Name() {
		        
	     String  Agent_Name = driver.findElement(By.xpath("//div[@class='dp-sidebar-wrapper__contact']//h4[@class='ui-agent__name'][contains(text(),'')]")).getText();
         System.out.println("Agent Name ---> "+ Agent_Name);
		 return true;
			 }
		 
	 public boolean  Verify_Agent_Phone() {
		        
	     String  Agent_Phone = driver.findElement(By.xpath("//div[@class='dp-grid-wrapper']//p[@class='ui-agent__tel ui-agent__text']//a[1]")).getText();
	     System.out.println("Agent phone ---> "+ Agent_Phone);
	     return true;
			 }
		
	
	 public void ClickOnAgentLogo() {
		 Agent_logo.click();
	 }
	
	public AgentPage VefifyAgentName() {
			return new AgentPage();
		}

		
}
