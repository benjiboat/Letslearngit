package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.NTExplorePage;
import pages.NTHompePage2;
import pages.NTMyAccount;
import utility.Base;

public class VerifyExploretCity extends Base{
	NTHompePage2 nt;
	NTMyAccount myAccountObj;
	public WebDriver driver;
		
		@BeforeMethod
		public void setup() {
			nt=new NTHompePage2();
			driver=initialize();
		}
		@Test
		
		public void selectCity () throws InterruptedException  {
			
			myAccountObj=nt.login("stc123", "12345");
			NTExplorePage ntExploreObj = myAccountObj.ExploreClick();
			Thread.sleep(3000);
			ntExploreObj.selectOne("Return");
			ntExploreObj.submitClick();
			ntExploreObj.selectDropDownValue("Delhi");
			ntExploreObj.listClick();
			Thread.sleep(3000);
			String actualValue = ntExploreObj.getTextDelhi();
			String expectedValue = "Delhi";
		//Assert.assertEquals(actualValue, expectedValue);
			if(actualValue.equalsIgnoreCase("Delhi ")) {
				  
				
			  }
			
		}
			
	
		
}



