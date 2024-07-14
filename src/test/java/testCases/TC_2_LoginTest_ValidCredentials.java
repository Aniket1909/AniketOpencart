package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_2_LoginTest_ValidCredentials extends BaseClass{
	
	
	
	@Test(groups= {"Regression","Master",})
	public void test2() throws InterruptedException
	{
		logger.info("Test 2 is Started");
		try
		{
			Homepage hm= new Homepage(driver);
			hm.ClickMyAccount();
			Thread.sleep(2000);
			hm.Clicklogin();
			
			logger.info("Clicked on login ");
			LoginPage lg= new LoginPage(driver);
			
			
			lg.inputEmail(p.getProperty("Email"));
			lg.inputPassword(p.getProperty("Password"));
			logger.info("Entered Email and Password");
			lg.login_button_click();
			logger.info("Clicked on login button ");
			
			MyAccountPage ap= new MyAccountPage(driver);
			
			Thread.sleep(5000);
			 Assert.assertEquals(ap.check_Myorders_text(),"My Orders");
			/*if(ap.check_Myorders_text().equals("My Orders"))
			{
				logger.info("Test is passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Test is failed");
				Assert.assertTrue(false);
			}*/
			logger.info("Message is verified");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("Test 2 is Ended");
	}
}
