package com.voyager.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.voyager.qa.base.TestBase;
import com.voyager.qa.pages.AgentPage;
import com.voyager.qa.pages.SearchPage;
import com.voyager.qa.pages.SelectFifthPrizeInfoPage;
import com.voyager.qa.pages.ZooplaHomePage;

public class AgentPageTest extends TestBase {
	
	ZooplaHomePage zooplaHomePage;
	SearchPage searchpage;
	SelectFifthPrizeInfoPage selectfifthprize;
	AgentPage agentpage;
	
	public AgentPageTest(){
		super();
	}

	
	 @BeforeMethod
	    public void setUp() throws InterruptedException {
				
				intialization(); // call initialization method
				zooplaHomePage = new ZooplaHomePage();// create object of an homepage class
				searchpage = new SearchPage();
				selectfifthprize = new SelectFifthPrizeInfoPage();
				agentpage = new AgentPage();
        }
	 
	 
	 @Test(priority =1)
		public void Agent_Same_Name_Info() throws InterruptedException {
		 
		 zooplaHomePage.searchlocation();
		 Thread.sleep(3000);
		 searchpage.selectfifthtextprize();
		 Thread.sleep(4000);
		 selectfifthprize.ClickOnAgentLogo();
		 Thread.sleep(3000);
	
		
		 Assert.assertTrue(agentpage.VerifySameAgentName());
		 } 
			 
		
	 
}