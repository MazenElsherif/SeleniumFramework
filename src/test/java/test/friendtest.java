package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Search;
import pages.UserResgestration;
import pages.friendpage;
import pages.productdetails;

public class friendtest extends TestBase {
	HomePage homeobject;
	UserResgestration regobject;
	friendpage friend;
	Search s;
	productdetails p;
	String productname="Apple MacBook Pro 13-inch";
	String friendemail="mazen@gmail.com";
	String messagef="this is good product";
	@Test(priority = 1)
	public void usercanregin() {
		homeobject=new HomePage(driver);
		homeobject.openreglink();
		regobject=new UserResgestration(driver);
		regobject.userreg("mazen", "hassan","mazen222222274@gmail.com", "123456789");
		Assert.assertTrue(regobject.message.getText().contains("Your registration completed"));
	}
	@Test(priority = 2)
	public void usercanserach() {
		try {
			s=new Search(driver);
			p=new productdetails(driver);
			s.searchusingautosugg("MacB");
			s.opendetailspage();
			Assert.assertEquals(p.productmess.getText(),productname);}
		catch (Exception e) {
			System.out.println("error occourd"+e.getMessage());		}
	}
	@Test(priority = 3)
	public void sendemail() {
		p.friend();
		friend=new friendpage(driver);
		friend.sendemailtofriend(friendemail, messagef);
		Assert.assertTrue(friend.assertionmessage.getText().contains("Your message has been sent"));
	}
	@Test(priority = 4)
	public void regesteredusercanlogout() {
		regobject.logout();
	}
}
