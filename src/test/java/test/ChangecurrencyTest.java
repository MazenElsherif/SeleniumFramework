package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Search;
import pages.productdetails;

public class ChangecurrencyTest extends TestBase {
	HomePage home;
	Search s;
	productdetails p;
	String productname="Apple MacBook Pro 13-inch";
	@Test(priority = 2)
	public void usercanserach() {
		try {
			s=new Search(driver);
			s.searchusingautosugg("MacB");
			p=new productdetails(driver);
			Assert.assertEquals(p.productmess.getText(),productname);
			Assert.assertTrue(p.messprice.getText().contains("€"));
			System.out.println(p.messprice.getText());
		}
		catch (Exception e) {
			System.out.println("error occourd"+e.getMessage());		}
	}
	@Test(priority = 1)
	public void changecurrency() {
		home=new HomePage(driver);
		home.changecurrency();

	}
}
