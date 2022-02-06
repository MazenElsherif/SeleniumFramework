package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver driver;
	public JavascriptExecutor jse;
	public Select s;
	public Actions a;
	public PageBase(WebDriver driver) {
PageFactory.initElements(driver, this);
	}
	protected static void clickbtn(WebElement click) {
	click.click();	
	}
	protected static void sendkeys(WebElement txt,String value) {
		txt.sendKeys(value);
	}
	public void scrolltobutton() {
		jse.executeScript("scrollBy(0,2500)");
		
	}
}
