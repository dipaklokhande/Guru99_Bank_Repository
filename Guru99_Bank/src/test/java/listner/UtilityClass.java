package listner;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.guru99_bank.configurations.Config;

public class UtilityClass {
WebDriver driver;
	
	public void takeScreenshot(String tcNum) throws IOException {
		BaseClass dri = new BaseClass();
		driver = dri.driverInit();
		//Source file
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();	
		String fileName = date.toString().replace(":", "_");
		
		//destination file
		File f = new File(Config.sspath+fileName+tcNum+".jpg");
		
		FileHandler.copy(source, f);
	}

	

}
