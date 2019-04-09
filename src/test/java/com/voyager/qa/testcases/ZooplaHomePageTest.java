package com.voyager.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.voyager.qa.base.TestBase;
import com.voyager.qa.pages.SearchPage;
import com.voyager.qa.pages.ZooplaHomePage;

public class ZooplaHomePageTest extends TestBase {

	
	ZooplaHomePage zooplaHomePage;
	SearchPage searchpage;
	
	
	public ZooplaHomePageTest(){
		super();
	}

	
	 @BeforeMethod
     public void setUp() throws InterruptedException {
			
			intialization(); // call initialization method
			zooplaHomePage = new ZooplaHomePage();// create object of an homepage class
		
 }

	 @Test(priority =1)
		public void searchlocationTest() {
		 
      Assert.assertTrue(zooplaHomePage.searchlocation());
		 
		
		}

	
	
}
