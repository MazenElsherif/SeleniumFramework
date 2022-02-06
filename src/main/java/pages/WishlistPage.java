package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.jodah.failsafe.internal.util.Assert;

public class WishlistPage extends PageBase{

	public WishlistPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="updatecart")
	WebElement removebtn;
	@FindBy(id = "updatecart")
	WebElement updatewishlist;
	@FindBy(css="div.no-data")
	 public WebElement mess;
	@FindBy(css = "h1")
	public WebElement header;
	public void wishlist() {
		clickbtn(removebtn);
		clickbtn(updatewishlist);
			}
}
