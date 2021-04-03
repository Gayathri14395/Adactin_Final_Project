package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable
	{
	
	File f= new File("C:\\Users\\welcome\\eclipse-workspace\\Adactin_Final_Project\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
	
	FileInputStream fis = new FileInputStream(f);
	
	 p = new Properties();
	 
	 p.load(fis);
	}
	 
	 
	 public String getBrowser()
	 {
		 String browser = p.getProperty("browser");
		 return browser;
		 
	 }
	 
	 public String getUrl()
	 {
		 
		 String url = p.getProperty("url");
		 return url;
	 }
	 
	 public String getName()
	 {
		 String un = p.getProperty("db_username");
		return un;
		 
	 }
	 
	 public String getPassword()
	 {
		 String pwd = p.getProperty("db_password");
		return pwd;
		 
	 }


	public String getCheckInDate() {
		String indate = p.getProperty("checkin_date");
		return indate;
	}


	public String getCheckOutDate() {
		String outdate = p.getProperty("checkout_date");
		return outdate;
	}


	public String firstname() {
		String fname = p.getProperty("firstname");
		return fname;
	}
	
	public String lastname() {
		String lname = p.getProperty("lastname");
		return lname;
	}


	public String address() {
		String address = p.getProperty("address");
		return address;
	}


	public String getcardNo() {
		String cno = p.getProperty("cardnumber");
		return cno;
	}


	public String getcvvno() {
		String cvv = p.getProperty("cvvno");
		return cvv;
	}
}
	 
//	 

	
