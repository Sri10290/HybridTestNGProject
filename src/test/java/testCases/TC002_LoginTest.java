package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test
	public void verify_LoginTest() {
		
		//Homepage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Loginpage
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail(p.getProperty("email"));
		lp.enterPwd(p.getProperty("password"));
		lp.clicksubmit();
		
		//MyAccountpage
		MyAccountPage macc = new MyAccountPage(driver);
		boolean target = macc.isMyAccountPageExists();
		
		Assert.assertEquals(target, true);
	}

}
