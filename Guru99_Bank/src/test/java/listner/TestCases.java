package listner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99_bank.configurations.Config;

public class TestCases {
String tcID;
	
	BaseClass base= new BaseClass();
	WebDriver driver ;
	
	@BeforeMethod()
	public void login() {
		 driver = base.driverInit();
		
	}
	
	@Test
	public void TC01() {
		tcID="TC_201";
		Reporter.log("TC01 is executed", true);
		Assert.fail();
	}
	
	@Test
	public void TC02() {
		tcID="TC_202";
		Reporter.log("TC01 is executed", true);
		Assert.fail();
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws IOException {	
		int sts = result.getStatus();
		if(ITestResult.FAILURE == result.getStatus()) {
			
			UtilityClass util = new UtilityClass();
			util.takeScreenshot(tcID);
			Reporter.log("Screenshot captured", true);
			
		}
		
		Reporter.log("Application logout", true);
		
		
	}

}
