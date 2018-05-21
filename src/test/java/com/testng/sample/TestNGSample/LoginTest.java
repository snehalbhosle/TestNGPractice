package com.testng.sample.TestNGSample;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testng.sample.base.TestBase;
import com.testng.sample.pages.LoginPage;
import com.testng.sample.workflows.Login;

public class LoginTest extends TestBase{

	Login login;
	private WebDriver driver;
	
public LoginTest() throws MalformedURLException {
	this.driver = getWebDriver();
	driver.get(websiteUrl);
	
}
@Test
public void LoginTest() {
	login = new Login(driver);
	login.Login("snehalwb", "vinayakb@2011");
}

}
