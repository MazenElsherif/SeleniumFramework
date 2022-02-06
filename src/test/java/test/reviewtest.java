package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Search;
import pages.UserResgestration;
import pages.productdetails;
import pages.productreview;

public class reviewtest extends TestBase {
	HomePage homeobject;
	Search s;
	productreview review;
	productdetails p;
	UserResgestration regobject;
	String productname="Apple MacBook Pro 13-inch";

	@Test(priority = 1)
	public void usercanregin() {
		homeobject=new HomePage(driver);
		homeobject.openreglink();
		regobject=new UserResgestration(driver);
		regobject.userreg("mazen", "hassan", "mazenhassan2224ded7466444@gmail.com", "123456789");
		Assert.assertTrue(regobject.message.getText().contains("Your registration completed"));
	}
	@Test(priority = 2)
	public void usercanserachusingauto() {
		s=new Search(driver);
		p=new productdetails(driver);
		s.searchusingautosugg("MacB");
		s.opendetailspage();
		Assert.assertEquals(p.productmess.getText(),productname);
	}
	@Test(priority = 3)
	public void review() {
		review=new productreview(driver);
		p=new productdetails(driver);
		p.addtoreview();
		review.review("mac review"," good");
		//Assert.assertTrue(review.mess.getText().contains("Product review is successfully added. "));
	}
}
