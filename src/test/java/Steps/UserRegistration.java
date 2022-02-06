package Steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserResgestration;
import test.TestBase;

public class UserRegistration extends TestBase {
	HomePage home;
	UserResgestration reg;
	@Given("the user in home page")
	public void the_user_in_home_page() {
	    home = new HomePage(driver);
	    home.openreglink();
	}
	@When("i click on registar link")
	public void i_click_on_registar_link() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("register"));
	}

	
	/*
	 * @When("i entered the user data") public void i_entered_the_user_data() {
	 * reg=new UserResgestration(driver); reg.userreg("mazen", "hassan",
	 * "mazen222@gmail.com", "1234567"); }
	 */
	 
	@When("i entered {string},{string},{string},{string}")
	 public void i_entered(String fname,String lname,String email ,String password) {
		 reg=new UserResgestration(driver);
		 reg.userreg(fname, lname, email, password); 
		 }
	@Then("The registration page displayed")
	public void the_registration_page_displayed() {
	   reg.logout();
	}
}
