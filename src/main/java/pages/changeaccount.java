package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class changeaccount extends PageBase {

	public changeaccount(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Change password")
	WebElement changepassword;
	@FindBy(id = "OldPassword")
	WebElement old;
	@FindBy(id = "NewPassword")
	WebElement newp;
	@FindBy(id = "ConfirmNewPassword")
	WebElement con;
	@FindBy(css= "button.button-1.change-password-button")
	 WebElement btn;
	public void changepass() {
		clickbtn(changepassword);
	}
	public void changepassword(String oldpass,String newpass) {
		sendkeys(old, oldpass);
		sendkeys(newp, newpass);
		sendkeys(con, newpass);
		clickbtn(btn);
		
	}
}
