package com.adactin_finalproject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pwd;

	@FindBy(id="login")
	private WebElement loginbtn;
	
	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public LoginPage(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}
	
	

}
