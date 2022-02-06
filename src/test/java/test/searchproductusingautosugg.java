package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Search;
import pages.productdetails;

public class searchproductusingautosugg extends TestBase {
	Search s;
	productdetails p;
	String productname="Apple MacBook Pro 13-inch";
	@Test
	public void usercanserachusingauto() {
		s=new Search(driver);
		p=new productdetails(driver);
		s.searchusingautosugg("MacB");
		s.opendetailspage();
		Assert.assertEquals(p.productmess.getText(),productname);
	}
}
