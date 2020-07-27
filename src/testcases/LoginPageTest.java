package testcases;

import library.Browser;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class LoginPageTest extends Browser{
	@Test
	//login page validation
	public void logintest(){
		HomePage loginpage=PageFactory.initElements(driver, HomePage.class);
		loginpage.clickonlogin();
		loginpage.sendusername("vinubhasuri@gmail.com");
		loginpage.sendpassword("trial1234");
		loginpage.submitlogin();
		String actualUrl="http://automationpractice.com/index.php?controller=my-account";
		String expectedUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("login page validated successfully");
		
	}

}
