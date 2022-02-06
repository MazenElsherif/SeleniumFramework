package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserResgestration extends PageBase {

	public UserResgestration(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "gender-male")
	WebElement gender;
	@FindBy(id = "FirstName")
	WebElement fname;
	@FindBy(id = "LastName")
	WebElement lname;
	@FindBy(id = "Email")
	WebElement email;
	@FindBy(id = "Password")
	WebElement password;
	@FindBy(id = "ConfirmPassword")
	WebElement confirmpassword;
	@FindBy(id = "register-button")
	WebElement regbtn;
	@FindBy(css = "div.result")
	 public WebElement message;
	@FindBy(linkText  = "Log out")
 public	WebElement logoutbtn;
	@FindBy(linkText = "My account")
	 public WebElement myacclink;
	public void userreg(String firstname,String lastname,String emaill,String pass) {
		clickbtn(gender);
		sendkeys(fname, firstname);
		sendkeys(lname, lastname);
		sendkeys(email, emaill);
		sendkeys(password, pass);
		sendkeys(confirmpassword, pass);
		clickbtn(regbtn);
	}
	public void logout() {
		clickbtn(logoutbtn);

	}
	public void openmyacclink() {
		clickbtn(myacclink);}
}
