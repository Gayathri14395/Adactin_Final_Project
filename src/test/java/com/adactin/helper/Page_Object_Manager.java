package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin_finalproject.pom.BookHotelPage;
import com.adactin_finalproject.pom.ConfPage;
import com.adactin_finalproject.pom.HotelSearchPage;
import com.adactin_finalproject.pom.LoginPage;
import com.adactin_finalproject.pom.SelectHotelPage;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private LoginPage login ;
private HotelSearchPage hsp ;
	private SelectHotelPage shp ;
	private BookHotelPage bhp ;
	private ConfPage cp ;

	public Page_Object_Manager(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

	public LoginPage getInstanceLogin() {
login = new LoginPage(driver);
return login;
	}
	
	public HotelSearchPage getInstanceHSP() {
hsp=new HotelSearchPage(driver);
return hsp;
	}
	
	public SelectHotelPage getInstanceSHP() {
		shp=new SelectHotelPage(driver);
		return shp;
			}
	public BookHotelPage getInstanceBHP() {
		bhp=new BookHotelPage(driver);
		return bhp;
			}
	
	public ConfPage getInstanceCP() {
		cp=new ConfPage(driver);
		return cp;
			}
}
