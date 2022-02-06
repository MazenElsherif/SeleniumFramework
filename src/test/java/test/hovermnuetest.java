package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class hovermnuetest extends TestBase {
HomePage home;
@Test
public void selectnotebooks() {
	home =new HomePage(driver);
	home.selectnotebooks();
	Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
}
}
