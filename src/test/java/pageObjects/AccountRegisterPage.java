package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterPage extends BasePage {
	
	public AccountRegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="input-firstname")
	WebElement txtFirstName;
	
	@FindBy(id="input-lastname")
	WebElement txtLastName;
	
	@FindBy(id="input-email")
	WebElement txtEmail;    
	
	@FindBy(id="input-telephone")
	WebElement txtPhone;
	
	@FindBy(id="input-password")
	WebElement txtPassword;
	
	@FindBy(id="input-confirm")
	WebElement txtConfirmPwd;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement btnPrivacy;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		
		txtEmail.sendKeys(email);
	}
	
	public void setPhoneNo(String phoneno) {
		
		txtPhone.sendKeys(phoneno);
	}
	
	public void setPassword(String password) {
		
		txtPassword.sendKeys(password);
	}
	
	public void setConfrmpwd(String confpwd) {
		
		txtConfirmPwd.sendKeys(confpwd);
	}
	
	public void clickAgree() {
		
		btnPrivacy.click();
	}
	
	public void clickContinue() {
		
		btnContinue.click();
	}
	
	public String getConfirmationMsg() {
		
		try {
			return (msgConfirmation.getText());
		}
		catch(Exception e) {
			return (e.getMessage());
		}
	}

}
