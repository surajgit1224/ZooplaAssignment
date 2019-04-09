package com.voyager.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.voyager.qa.base.TestBase;

public class SearchPage extends TestBase {

	@FindBy(xpath = " (//ul[@class=\"listing-results clearfix js-gtm-list\"]/li//a[@class=\"listing-results-price text-price\"])[5]")
	WebElement link_1;

	// Initializing the page object
	public SearchPage() {
	PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)

	}



	public boolean selectfifthtextprize() throws InterruptedException {

		WebElement link_1 = driver.findElement(By.xpath(
				" (//ul[@class=\"listing-results clearfix js-gtm-list\"]/li//a[@class=\"listing-results-price text-price\"])[5]\r\n"
						+ ""));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", link_1);
		return true;

	}

	public boolean printAllPrizeValue() {

		List<WebElement> list = driver.findElements(By.xpath(
				"(//ul[@class=\"listing-results clearfix js-gtm-list\"]/li//a[@class=\"listing-results-price text-price\"])"));

		System.out.println("Print the all prize links...." + list.size());

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getText());

		}
		return true;

	}

	public SelectFifthPrizeInfoPage VefifySelectedfifthPage() {
		return new SelectFifthPrizeInfoPage();
	}

}
