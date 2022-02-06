package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.Search;
import pages.WishlistPage;
import pages.productdetails;

public class Addtowishlisttest extends TestBase {
	Search s;
	productdetails p;
	WishlistPage w;
	String productname="Apple MacBook Pro 13-inch";
	@Test(priority = 1)
	public void usercanserachusingauto() {
		s=new Search(driver);
		p=new productdetails(driver);
		s.searchusingautosugg("MacB");
		s.opendetailspage();
		Assert.assertEquals(p.productmess.getText(),productname);
	}
	@Test(priority = 2)
	public void usercanaddtowishlist() {
		p=new productdetails(driver);
		w=new WishlistPage(driver);
		p.addtowishlist();
		driver.navigate().to("https://demo.nopcommerce.com/wishlist");
		Assert.assertTrue(w.header.getText().contains("Wishlist"));
	}
	@Test(priority = 3)
	public void usercanremovefromwishlist() {
		w=new WishlistPage(driver);
		w.wishlist();
		Assert.assertTrue(w.mess.getText().contains("The wishlist is empty!"));

	}

}
