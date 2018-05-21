package com.testng.sample.workflows;

import org.openqa.selenium.WebDriver;

import com.testng.sample.pages.LoginPage;

public class Login {
	
	private WebDriver driver;

	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Login(String usernm, String pwd) {
		LoginPage loginPage =new LoginPage(driver);
		loginPage.enterUserName(usernm);
		loginPage.enterPassword(pwd);
		loginPage.clickSubmit();
	}
	
	
}
