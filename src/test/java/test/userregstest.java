package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserLogin;
import pages.UserResgestration;

public class userregstest extends TestBase {
	HomePage homeobject;
	UserResgestration regobject;
	UserLogin log;
	@Test(priority = 1,alwaysRun = true)
	public void usercanregin() {
		homeobject=new HomePage(driver);
		homeobject.openreglink();
		regobject=new UserResgestration(driver);
		regobject.userreg("mazen", "hassan", "mazenhassan224ded746644@gmail.com", "123456789");
		Assert.assertTrue(regobject.message.getText().contains("Your registration completed"));
	}
	@Test(dependsOnMethods = "usercanregin")
	public void regesteredusercanlogout() {
		regobject.logout();
	}
	@Test(dependsOnMethods = "regesteredusercanlogout")
	public void regesteredusercanlogoin() {
		homeobject.openloglink();
		log = new UserLogin(driver);
		log.login("mazenhassan224ded746644@gmail.com", "123456789");
	}
}
