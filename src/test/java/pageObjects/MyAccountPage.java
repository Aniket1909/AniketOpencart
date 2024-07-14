package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Basepage{
	WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Orders']")
	WebElement lnk_myorders_loc;
	
	
	
	public String check_Myorders_text()
	{
		return lnk_myorders_loc.getText();
		
	}
	
}
