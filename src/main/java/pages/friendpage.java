package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class friendpage extends PageBase {

	public friendpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "FriendEmail") 
	WebElement emailfriend;
	@FindBy(id = "YourEmailAddress")
	WebElement youremail;
	@FindBy(id = "PersonalMessage")
	WebElement personalmessage;
	@FindBy(css = "button.button-1.send-email-a-friend-button")
	WebElement btnsend;
	@FindBy(css = "div.result")
	 public WebElement assertionmessage;
	public void sendemailtofriend(String friend,String message) {
		sendkeys(emailfriend, friend);
		sendkeys(personalmessage, message);
		clickbtn(btnsend);
	}
}
