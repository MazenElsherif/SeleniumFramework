package helper;



import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class help {
	//method to take screenshot when testcase failed
	public  static void scr(WebDriver driver,String scshotname)  {
		Path dest=Paths.get("./screenshors",scshotname+".png");
		try {
			Files.createDirectories(dest.getParent());
			FileOutputStream fos=new FileOutputStream(dest.toString());
			fos.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			fos.close();
		} catch (IOException e) {
			System.out.println("Exception while taking screenshot")		;}

	}}
