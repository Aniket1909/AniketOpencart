package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage{
	
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement lnkLogin;
	
	public void ClickMyAccount()
	
	{
		lnkMyaccount.click();
		
		//lnkMyaccount.submit();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("argumnets[0].click();", lnkMyaccount);
		
	}
	
	public void ClickRegister()
	
	{
	
		lnkRegister.click();
	
	}

	public void Clicklogin()

	{
	
		lnkLogin.click();
	
	}

}
