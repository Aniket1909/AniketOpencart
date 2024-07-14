package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.Homepage;
import pageObjects.NewRegistrationPage;
import testBase.BaseClass;

public class TC_01_AccountRegistration extends BaseClass {
		
		
		@Test(priority=1,groups= {"Sanity","Master"})
		public void test1() throws InterruptedException
		{
			logger.info("*****   TC_01_AccountRegistration Started     ******");
			Homepage hm= new Homepage(driver);
			Thread.sleep(3000);
			hm.ClickMyAccount();
			Thread.sleep(3000);
			hm.ClickRegister();
			
			logger.info("Clicked on registration link");
			
			NewRegistrationPage rg= new NewRegistrationPage(driver);
			
			rg.setfirstname(generatedstring());
			rg.setlastname(generatedstring());
			rg.setemail(generatedstring()+"@gmail.com");
			
			String password =genratedalphanumeric();
			rg.setpassword(password);
			
			
			rg.setpasswordcon(password);
			rg.settel(generatednumber());
			rg.clickAgree();
			logger.info("filled regi details");
			rg.clickContinue();
			
			logger.info("clicked on continue");
			//Assert.assertEquals(rg.regicomfirmation(), "Your Account Has Been Created!");
			if(rg.regicomfirmation().equals("Your Account Has Been Created!"))
			{
				logger.info("Test is passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Test is failed");
				Assert.assertTrue(false);
			}
		}
		
		
		
	
}
