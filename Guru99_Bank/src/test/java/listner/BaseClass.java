package listner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.guru99_bank.configurations.Config;

public class BaseClass {
	
	public WebDriver driverInit() {
		System.setProperty("webdriver.chrome.driver", Config.chromepath);
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		return driver;
	}
	

}
