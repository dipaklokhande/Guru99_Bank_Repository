package com.guru99_bank.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpom {
	WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']") private WebElement UID;
	@FindBy(xpath="//input[@type='password']") private WebElement Pass;
	@FindBy(xpath="//input[@type='submit']") private WebElement ClickLogin;
	@FindBy(xpath="//input[@type='reset']") private WebElement reset;
	
	public Loginpom(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void userID(String username) {
		UID.sendKeys(username);
	}
	
	public void password(String passField) {
		Pass.sendKeys(passField);
	}
	
	public void loginButton() {
		ClickLogin.click();
	}
	
	public void resetButton() {
		ClickLogin.click();
	}

}
