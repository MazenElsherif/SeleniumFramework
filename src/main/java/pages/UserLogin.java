package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLogin extends PageBase {

	public UserLogin(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "Email")
	WebElement emaliog;
	@FindBy(id = "Password")
	WebElement passwordlogin;
	@FindBy(css = "input.button-1.login-button")
	WebElement loginptn;
public void login(String emailll,String pass) {
	sendkeys(emaliog, emailll);
	sendkeys(passwordlogin, pass);
	clickbtn(emaliog);
}
}
