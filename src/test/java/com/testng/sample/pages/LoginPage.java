package com.testng.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
@FindBy (xpath="//a[text()='SIGN-ON']")
private WebElement lnk_signOn;

@FindBy(name="userName")
private WebElement txt_username;

@FindBy(name="password")
private WebElement txt_password;

@FindBy(name="login")
private WebElement btn_login;

public void clickSubmit() {
	btn_login.click();
}

public void enterUserName(String usernm) {
	txt_username.sendKeys(usernm);
}
public void enterPassword(String password) {
	txt_username.sendKeys(password);
}

}
