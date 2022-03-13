package com.guru99_bank.testCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.guru99_bank.configurations.Config;

public class BeforeAndAfterClass {

	public static WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", Config.chromepath);
		driver = new ChromeDriver();

	}

	@AfterClass
	public void exit() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\yogesh lokhande\\eclipse-workspace-newV\\Guru99_Bank\\Screenshots\\image.jpg");
		FileHandler.copy(src, dest);
		driver.quit();
	}

}
