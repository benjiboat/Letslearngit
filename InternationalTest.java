package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.NTHompePage2;

import pages.NTinternationalTourPage;
import utility.Base;

public class InternationalTest extends Base {
	public WebDriver driver; // when the test case fail the listener can take this driver.
	NTHompePage2 nt;
	NTinternationalTourPage internationaltourObj;
		
		@BeforeMethod
		public void setup() {
			driver=initialize();
			nt=new NTHompePage2(driver); //calling the constructor
		}

		
	@Test
	public void verifyParis() throws InterruptedException {
		
		internationaltourObj = nt.internationalTourSelect();
		internationaltourObj.selectParis();
		Assert.assertFalse(true);
		Thread.sleep(3000);
		String actualValue = internationaltourObj.getTextOfParis();
		String expectedValue = "Paris is the capital and most populous city of France, with an area of 105 square kilometres (41 square miles) and a population of 2,206,488.Since the 17th century, Paris has been one of Europe's major centres of finance, commerce, fashion, science, music and painting.";
		Assert.assertEquals(actualValue, expectedValue);
		
	}
	
		
}
