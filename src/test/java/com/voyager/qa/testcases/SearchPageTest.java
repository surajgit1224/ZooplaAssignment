package com.voyager.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.voyager.qa.base.TestBase;
import com.voyager.qa.pages.SearchPage;
import com.voyager.qa.pages.SelectFifthPrizeInfoPage;
import com.voyager.qa.pages.ZooplaHomePage;

public class SearchPageTest extends TestBase{
	
	
	ZooplaHomePage zooplaHomePage;
	SearchPage searchpage;
	SelectFifthPrizeInfoPage selectfifthprize;
	
	public SearchPageTest(){
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
		public void PrintPrizeValues() throws InterruptedException {
		 
		 zooplaHomePage.searchlocation();
		 Thread.sleep(2000);
		 Assert.assertTrue( searchpage.printAllPrizeValue());
		}
	 

	 @Test(priority =2)
		public void selectprizeorder() throws InterruptedException {
		 
		 zooplaHomePage.searchlocation();
		 Thread.sleep(2000);
		 Assert.assertTrue (searchpage.selectfifthtextprize());
  
	 }

  
	
	
	 

}
