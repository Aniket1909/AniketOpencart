package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;


/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/

public class TC_003_LoginDDT extends BaseClass
{

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups= {"Dataprovider","Master"})
	public void verify_loginDDT(String email, String password, String exp)
	{
		logger.info("**** Starting TC_003_LoginDDT *****");
		
	/*try {
	
		//Home page
			Homepage hp=new Homepage(driver);
			hp.ClickMyAccount();
			hp.Clicklogin(); //Login link under MyAccount
				
			//Login page
			LoginPage lp=new LoginPage(driver);
			lp.inputEmail(email);
			lp.inputPassword(password);
			lp.login_button_click(); //Login button
				
			//My Account Page
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountPageExists();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");*/
	}
	
}