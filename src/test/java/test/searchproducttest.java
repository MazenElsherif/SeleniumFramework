package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Search;
import pages.productdetails;

public class searchproducttest extends TestBase{
	Search s;
	productdetails p;
	String productname="Apple MacBook Pro 13-inch";
	@Test
	public void usercanserach() {
		s=new Search(driver);
		p=new productdetails(driver);
		s.productsearch(productname);
		s.opendetailspage();
		Assert.assertTrue(p.productmess.getText().equalsIgnoreCase(productname));
	}
}
