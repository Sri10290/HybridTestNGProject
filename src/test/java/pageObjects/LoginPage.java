package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="input-email")
	WebElement txtEmailAddress;
	
	@FindBy(id="input-password")
	WebElement txtLoginpwd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnLogin;
	
	public void enterEmail(String emailtext) {
		
		txtEmailAddress.sendKeys(emailtext);
	}
	
	public void enterPwd(String pwdlogin) {
		
		txtLoginpwd.sendKeys(pwdlogin);
	}
	
	public void clicksubmit() {
		
		btnLogin.click();
	}

}
