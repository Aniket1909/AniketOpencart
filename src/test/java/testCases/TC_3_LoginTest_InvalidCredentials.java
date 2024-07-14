package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_3_LoginTest_InvalidCredentials extends BaseClass{
	@Test(groups= {"Regression","Master"})
	public void test2() throws InterruptedException
	{
		logger.info("Test 3 is Started");
		try
		{
			Homepage hm= new Homepage(driver);
			hm.ClickMyAccount();
			Thread.sleep(2000);
			hm.Clicklogin();
			
			logger.info("Clicked on login ");
			LoginPage lg= new LoginPage(driver);
			
			
			lg.inputEmail(p.getProperty("Email2"));
			lg.inputPassword(p.getProperty("Password2"));
			logger.info("Entered Email and Password");
			lg.login_button_click();
			logger.info("Clicked on login button ");
			
			lg.Check_credentialAlert();
			
			Thread.sleep(5000);
			 Assert.assertEquals(lg.Check_credentialAlert(), true);
			logger.info("Message is verified");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("Test 3 is Ended");
	}
}
