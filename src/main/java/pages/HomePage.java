package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		 jse=(JavascriptExecutor) driver;
		 a=new Actions(driver);

	}
	@FindBy(linkText = "Register")
	WebElement regLink;
	@FindBy(linkText = "Log in") 
	WebElement loginlink;
	@FindBy(linkText = "Contact us")
	WebElement contactuslink;
	@FindBy(id = "customerCurrency")
	WebElement currencydl;
	@FindBy(linkText = "Computers")
	WebElement computermenu;
	@FindBy(linkText = "Notebooks")
	WebElement notebooksmenu;
	public void openreglink() {
		clickbtn(regLink);
	}
	public void openloglink() {
		clickbtn(loginlink);
	}
	public void opencontentuspage() {
		scrolltobutton();
		clickbtn(contactuslink);
	}
	public void changecurrency() {
		Select s=new Select(currencydl);
		s.selectByIndex(1);
	}
	public void selectnotebooks() {
		 a.moveToElement(computermenu).moveToElement(notebooksmenu).click().build().perform();
	}
}
