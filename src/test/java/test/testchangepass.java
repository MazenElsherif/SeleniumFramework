package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserLogin;
import pages.UserResgestration;
import pages.changeaccount;

public class testchangepass extends TestBase {
changeaccount ch;
HomePage homeobject;
UserResgestration regobject;
UserLogin log;
String email="mazend44h4gejkk42fggdf14974224@gmail.com";
@Test(priority = 1)
public void usercanregin() {
	homeobject=new HomePage(driver);
	homeobject.openreglink();
	regobject=new UserResgestration(driver);
	regobject.userreg("mazen", "hassan", email, "123456789");
	Assert.assertTrue(regobject.message.getText().contains("Your registration completed"));
}
@Test(priority = 2)
public void change() {
	regobject.openmyacclink();
	ch=new changeaccount(driver);
	ch.changepass();
	ch.changepassword("123456789", "1234567891");

}
@Test(dependsOnMethods = "change")
public void regesteredusercanlogout() {
	regobject.logout();
}
@Test(dependsOnMethods = "regesteredusercanlogout")
public void regesteredusercanlogoin() {
	homeobject.openloglink();
	log = new UserLogin(driver);
	log.login(email, "1234567891");
}

}
