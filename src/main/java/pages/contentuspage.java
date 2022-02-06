package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contentuspage extends PageBase {

	public contentuspage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "FullName")
	WebElement name;
	@FindBy(id = "Email")
	WebElement email;
	@FindBy(id = "Enquiry")
	WebElement enquiry;
	@FindBy(css = "button.button-1.contact-us-button")
	WebElement ptn;
	@FindBy(css = "div.result")
	public WebElement message;
	public void contentus(String namee,String emaill,String enguiryy) {
		sendkeys(name, namee);
		sendkeys(email, emaill);
		sendkeys(enquiry, enguiryy);
		clickbtn(ptn);
	}
}
