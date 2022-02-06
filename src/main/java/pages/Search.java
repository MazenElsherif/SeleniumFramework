package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Search extends PageBase {

	public Search(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "small-searchterms")
	WebElement searchtxtbos;
	@FindBy(css = "button.button-1.search-box-button")
	WebElement searchbtn;
	@FindBy(id = "ui-id-1")
	List<WebElement>  list;
	@FindBy(css = "strong.current-item")
	WebElement producttitle;
	public void productsearch(String productname) {
		sendkeys(searchtxtbos, productname);
		clickbtn(searchbtn);
	}
	public void opendetailspage() {
		clickbtn(producttitle);
	}
	public void searchusingautosugg(String txt) {
		sendkeys(searchtxtbos, txt);
		list.get(0).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
