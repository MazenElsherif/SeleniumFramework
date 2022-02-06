package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productreview extends PageBase {

	public productreview(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "AddProductReview_Title")
	WebElement productreview;
	@FindBy(id = "AddProductReview_ReviewText")
	WebElement reviewtext;
	@FindBy(css = "button.button-1.write-product-review-button")
	WebElement reviewbtn;
	@FindBy(id = "addproductrating_5")
	WebElement rating;
	@FindBy(css = "div.result")
public	WebElement mess;
	public void review(String tilte ,String text)
	{
		sendkeys(productreview, tilte);
		sendkeys(reviewtext, text);
		clickbtn(rating);
		clickbtn(reviewbtn);
	}
}
