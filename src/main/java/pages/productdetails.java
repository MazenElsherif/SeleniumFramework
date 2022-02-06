package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productdetails extends PageBase{

	public productdetails(WebDriver driver) {
		super(driver);
	}
	@FindBy(css  = "strong.current-item")
	public WebElement productmess;
	@FindBy(css = "button.button-2.email-a-friend-button")
	WebElement emailfriendptn;
	@FindBy(css="span.price-value-4")
	public WebElement messprice;
	@FindBy(xpath  = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[2]")
	WebElement addtoreview;
	@FindBy(id = "add-to-wishlist-button-4")
	WebElement wishlistbtn;
	
	public void friend() {
		clickbtn(emailfriendptn);
	}
	public void addtoreview() {
		clickbtn(addtoreview);
	}
	public void addtowishlist() {
		clickbtn(wishlistbtn);
	}
	
}
