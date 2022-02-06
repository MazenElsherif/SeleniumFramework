package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserLogin;
import pages.UserResgestration;

public class userregwithDDtandDataprovider extends TestBase {
	HomePage homeobject;
	UserResgestration regobject;
	UserLogin log;
	@DataProvider(name="testData")
	public  static Object[][] userdata(){
		return new Object[][] {
			{"mazen","hassan","mazenhaasan22774@gmail.com","123456"},
			{"mohab","hassan","mohab77@gmail.com","123456"}};
	} 
	@Test(priority = 1,alwaysRun = true,dataProvider = "testData")
	public void usercanregin(String fname,String lname,String email,String password) {
		homeobject=new HomePage(driver);
		homeobject.openreglink();
		regobject=new UserResgestration(driver);
		regobject.userreg(fname,lname,email,password);
		Assert.assertTrue(regobject.message.getText().contains("Your registration completed"));
		regobject.logout();
		homeobject.openloglink();
		log = new UserLogin(driver);
		log.login(email, password);
		regobject.logout();

	}

}
