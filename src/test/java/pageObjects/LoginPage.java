package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super (driver);
	}
	
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_emaillogin_loc;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_passwordlogin_loc;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btn_loginbutton_loc;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement txt_wrongEmailPass_loc;
	
	
	public void inputEmail(String email)
	{
		txt_emaillogin_loc.sendKeys(email);
	}
	
	public void inputPassword(String pass)
	{
		txt_passwordlogin_loc.sendKeys(pass);
	}
	
	public void login_button_click()
	{
		btn_loginbutton_loc.click();
	}
	
	public boolean Check_credentialAlert ()
	{
		return txt_wrongEmailPass_loc.isDisplayed();
	}
}
