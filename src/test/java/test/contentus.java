package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.contentuspage;

public class contentus extends TestBase {
	HomePage home;
	contentuspage con;
	String name="mazen";
	String email="test@test.com";
	String mess="hello";
	@Test
	public void con() {
	home=new HomePage(driver)	;
	con=new contentuspage(driver);
	home.opencontentuspage();
	con.contentus(name, email, mess);
	Assert.assertTrue(con.message.getText().contains("Your enquiry has been successfully sent to the store owner."
));
	}
}
