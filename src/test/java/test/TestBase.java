package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import helper.help;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests {
	public static WebDriver driver;
	@BeforeSuite
	@Parameters({"browser"})
	public void startdriver(@Optional("chrome") String browername) {
		if (browername.equalsIgnoreCase("chrome")) {
			String chorme = System.getProperty("user.dir")+"//drivers//chromedriver1.exe";
			System.setProperty("webdriver.chrome.driver", chorme);
			driver=new ChromeDriver();	
		}
		else if (browername.equalsIgnoreCase("firefox")) {
			String firefox = System.getProperty("user.dir")+"//drivers//geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", firefox);
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/");
	}
	@AfterSuite
	public void stopdriver() {
		driver.quit();
	}
	@AfterMethod
	public void scr(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			System.out.println("failed");
			System.out.println("Thanks");
			help.scr(driver, result.getName());

		}
	}
}
