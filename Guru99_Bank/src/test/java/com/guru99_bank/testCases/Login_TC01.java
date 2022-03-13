package com.guru99_bank.testCases;

import java.io.IOException;



import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99_bank.configurations.Config;
import com.guru99_bank.pom.Loginpom;
import com.guru99_bank.utilities.TestDataClass;

public class Login_TC01 extends BeforeAndAfterClass {
		
	@Test
	public void TC01()throws EncryptedDocumentException, IOException {
		driver.get(Config.weburl);
		Loginpom pom = new Loginpom(driver);
		TestDataClass td = new TestDataClass();
		pom.userID(td.testdata(1, 1));
		pom.password(td.testdata(2, 1));
		pom.loginButton();
		String actual = driver.getTitle();
		String expexted="Guru99 Bank Manager HomePage";
		Assert.assertEquals(actual, expexted);	
	}
	
	@Test
	public void TC02()throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(Config.weburl);
		Loginpom pom = new Loginpom(driver);
		TestDataClass td = new TestDataClass();
		pom.userID(td.testdata(1, 2));
		pom.password(td.testdata(2, 2));
		pom.loginButton();
		Thread.sleep(2000);
	     Alert alt = driver.switchTo().alert();
		String actual = alt.getText();
		System.out.println(actual);
		alt.accept();
		String expexted="User or Password is not valid";
		Assert.assertEquals(actual, expexted);	
		
	}
	
	@Test
	public void TC03()throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(Config.weburl);
		Loginpom pom = new Loginpom(driver);
		TestDataClass td = new TestDataClass();
		pom.userID(td.testdata(1, 3));
		pom.password(td.testdata(2, 3));
		pom.loginButton();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		String actual = alt.getText();
		System.out.println(actual);
		alt.accept();
		String expexted="User or Password is not valid";
		Assert.assertEquals(actual, expexted);	
	}
	
	@Test
	public void TC04()throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(Config.weburl);
		Loginpom pom = new Loginpom(driver);
		TestDataClass td = new TestDataClass();
		//without userID and password
		pom.loginButton();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		String actual = alt.getText();
		System.out.println(actual);
		alt.accept();
		String expexted="User or Password is not valid";
		Assert.assertEquals(actual, expexted);	
	}
	
	@Test
	public void TC05()throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(Config.weburl);
		Loginpom pom = new Loginpom(driver);
		TestDataClass td = new TestDataClass();
		pom.userID(td.testdata(1, 3));
		pom.password(td.testdata(2, 3));
		Thread.sleep(2000);
		pom.resetButton();
		Thread.sleep(2000);	
	}

}
