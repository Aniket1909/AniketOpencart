package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRegistrationPage extends Basepage {
	
	WebDriver driver;
	
	public NewRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txt_firstnameRegistration_loc;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_lastnameRegistration_loc;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_emailRegistration_loc;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txt_telRegistration_loc;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_passwordRegistration_loc;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_passwordconfirm_loc;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement btn_agreecheckbox_loc;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue_loc;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement txt_regcomplete_loc;
	
	
	
	public void setfirstname(String name)
	{
		txt_firstnameRegistration_loc.sendKeys(name);
	}
	
	
	public void setlastname(String lname)
	{
		txt_lastnameRegistration_loc.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		txt_emailRegistration_loc.sendKeys(email);
		
		
	}
	
	public void settel(String tel)
	{
		txt_telRegistration_loc.sendKeys(tel);
		
		
	}
	
	public void setpasswordcon(String pass)
	{
		txt_passwordconfirm_loc.sendKeys(pass);
	}
	
	public void setpassword(String pass)
	{
		txt_passwordRegistration_loc.sendKeys(pass);
	}
	
	public void clickAgree()
	{
		btn_agreecheckbox_loc.click();
	}
	
	public void clickContinue()
	{
		btn_continue_loc.click();
	}
	
	public String regicomfirmation()
	{
		String status= txt_regcomplete_loc.getText();
		return status;
	}
	
	

}
