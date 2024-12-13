package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegisterPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

		
	@Test
	public void verify_Account_Registration() {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegisterPage register = new AccountRegisterPage(driver);
		register.setFirstName("John");
		register.setLastName("David");
		register.setEmail("David123@gmail.com");
		register.setPhoneNo("7839748837");
		register.setPassword("john123");
		register.setConfrmpwd("john123");
		
		register.clickAgree();
		register.clickContinue();
		
		String confrm = register.getConfirmationMsg();
		
		Assert.assertEquals(confrm, "Your Account Has Been Created!");
		
	}
}
