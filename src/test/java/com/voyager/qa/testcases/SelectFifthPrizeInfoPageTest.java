package com.voyager.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.voyager.qa.base.TestBase;
import com.voyager.qa.pages.SearchPage;
import com.voyager.qa.pages.SelectFifthPrizeInfoPage;
import com.voyager.qa.pages.ZooplaHomePage;

public class SelectFifthPrizeInfoPageTest extends TestBase{
	
	
	ZooplaHomePage zooplaHomePage;
	SearchPage searchpage;
	SelectFifthPrizeInfoPage selectfifthprize;
	
	public SelectFifthPrizeInfoPageTest(){
		super();
	}
	

	 @BeforeMethod
    public void setUp() throws InterruptedException {
			
			intialization(); // call initialization method
			zooplaHomePage = new ZooplaHomePage();// create object of an homepage class
			searchpage = new SearchPage();
			selectfifthprize = new SelectFifthPrizeInfoPage();
		
}
	
	 @Test(priority =1)
		public void Agent_Info() throws InterruptedException {
		 
		 zooplaHomePage.searchlocation();
		 Thread.sleep(2000);
		 searchpage.selectfifthtextprize();
		 Thread.sleep(2000);
		 
		 
	
		 Assert.assertTrue(selectfifthprize.Verify_Agent_logo());
		 Assert.assertTrue(selectfifthprize.Verify_Agent_Name());
		 Assert.assertTrue( selectfifthprize.Verify_Agent_Phone());
		}
	 

}
