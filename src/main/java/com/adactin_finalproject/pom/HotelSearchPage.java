package com.adactin_finalproject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchPage {
	
	public WebDriver driver;
	
	@FindBy(id= "location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement noOfrooms;
	
	@FindBy(id="datepick_in")
	private WebElement indate;
	
	@FindBy(id="datepick_out")		
	private WebElement outdate;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	public WebElement getAdultroom() {
		return adultroom;
	}

	@FindBy(id="child_room")
	private WebElement children;
	
	@FindBy(id="Submit")
	private WebElement search;

	

	public HotelSearchPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoOfrooms() {
		return noOfrooms;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	


}
