package com.adactin_finalproject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfPage {
	
	public WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement itinerary;
	
	public WebElement getItinerary() {
		return itinerary;
	}
	
	@FindBy(id="search_hotel")
	private WebElement searchhotelbtn;

	public WebElement getSearchHotelBtn() {
		return searchhotelbtn;
	}

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	public ConfPage(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver,this);
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}
