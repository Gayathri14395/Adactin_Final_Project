package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.runner.Test_Runner;
import com.adactin_finalproject.baseclass.BaseClass;
import com.adactin_finalproject.pom.BookHotelPage;
import com.adactin_finalproject.pom.ConfPage;
import com.adactin_finalproject.pom.HotelSearchPage;
import com.adactin_finalproject.pom.LoginPage;
import com.adactin_finalproject.pom.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass{
	
	public static WebDriver driver = Test_Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		toLaunchUrl(url);
	
	}
	
//	@When("^user Enter The <\"([^\"]*)\"> In Username Textbox$")
//	public void user_Enter_The_In_Username_Textbox(String Username) throws Throwable {
//		toEnterInput(pom.getInstanceLogin().getUsername(), Username);
//	    
//	}
//
//	@When("^user Enter The <\"([^\"]*)\"> In Password TextBox$")
//	public void user_Enter_The_In_Password_TextBox(String Password) throws Throwable {
//		toEnterInput(pom.getInstanceLogin().getPwd(), Password);
//	    
//	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Textbox$")
	public void user_Enter_The_In_Username_Textbox(String Username) throws Throwable {
		toEnterInput(pom.getInstanceLogin().getUsername(), Username);
	
	}

	@When("^user Enter The \"([^\"]*)\" In Password TextBox$")
	public void user_Enter_The_In_Password_TextBox(String Password) throws Throwable {
		toEnterInput(pom.getInstanceLogin().getPwd(), Password);
	}

//	@When("^user Enter The Username In Username Textbox$")
//	public void user_Enter_The_Username_In_Username_Textbox() throws Throwable {
//		String name = FileReaderManager.getInstance().getInstanceCR().getName();
//		toEnterInput(pom.getInstanceLogin().getUsername(),name);
//		
//			}
//
//	@When("^user Enter The Password In Password TextBox$")
//	public void user_Enter_The_Password_In_Password_TextBox() throws Throwable {
//		String password = FileReaderManager.getInstance().getInstanceCR().getPassword();
//		toEnterInput(pom.getInstanceLogin().getPwd(),password);
//	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		toClick(pom.getInstanceLogin().getLoginbtn());	
		}


@When("^user Select The Desired Location From The MultipleDropDown$")
public void user_Select_The_Desired_Location_From_The_MultipleDropDown() throws Throwable {
	toSelectByIndex(pom.getInstanceHSP().getLocation(),3);
}

@When("^user Select The Desired Hotel Name From The MultipleDropDown$")
public void user_Select_The_Desired_Hotel_Name_From_The_MultipleDropDown() throws Throwable {
	toSelectByValue(pom.getInstanceHSP().getHotel(),"Hotel Sunshine");
}

@When("^user Select The Desired Type Of Room From The MultipleDropDown$")
public void user_Select_The_Desired_Type_Of_Room_From_The_MultipleDropDown() throws Throwable {
	toSelectByIndex(pom.getInstanceHSP().getRoomtype(),2);
}

@When("^user Select The Desired Number Of Rooms From The MultipleDropDown$")
public void user_Select_The_Desired_Number_Of_Rooms_From_The_MultipleDropDown() throws Throwable {
	toSelectByValue(pom.getInstanceHSP().getNoOfrooms(),"3");
}

@When("^user Clear The Given Date$")
public void user_Clear_The_Given_Date() throws Throwable {
	toClear(pom.getInstanceHSP().getIndate());
}

@When("^user Enter The CheckIn Date$")
public void user_Enter_The_CheckIn_Date() throws Throwable {
	String checkInDate = FileReaderManager.getInstance().getInstanceCR().getCheckInDate();
	toEnterInput(pom.getInstanceHSP().getIndate(), checkInDate);
}

@When("^user Clear The Given Out Date$")
public void user_Clear_The_Given_Out_Date() throws Throwable {
	toClear(pom.getInstanceHSP().getOutdate());
}

@When("^user Enter The CheckOut Date$")
public void user_Enter_The_CheckOut_Date() throws Throwable {
	String checkOutDate = FileReaderManager.getInstance().getInstanceCR().getCheckOutDate();
	toEnterInput(pom.getInstanceHSP().getOutdate(),checkOutDate);
}

@When("^user Select The Desired Number Of Adults Per Room From The MultipleDropDown$")
public void user_Select_The_Desired_Number_Of_Adults_Per_Room_From_The_MultipleDropDown() throws Throwable {
	toSelectByVisibleText(pom.getInstanceHSP().getAdultroom(),"2 - Two");
}

@When("^user Select The Desired Number Of Children Per Room From The MultipleDropDown$")
public void user_Select_The_Desired_Number_Of_Children_Per_Room_From_The_MultipleDropDown() throws Throwable {
	toSelectByIndex(pom.getInstanceHSP().getChildren(),1);
}

@Then("^user Click On The Serach Button And It Navigates To The Select Hotel Page$")
public void user_Click_On_The_Serach_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
	toClick(pom.getInstanceHSP().getSearch());
}




@When("^user Choose The Radio Button Of The Desired Hotel$")
public void user_Select_The_Radio_Button_Of_The_Desired_Hotel() throws Throwable {
    toClick(pom.getInstanceSHP().getSelect());
}

@Then("^user Click The Continue Button And It Navigates To The Book Hotel Page$")
public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
   toClick(pom.getInstanceSHP().getContinuebtn());
}




@When("^user Enter The First Name$")
public void user_Enter_The_First_Name() throws Throwable {
	String firstname = FileReaderManager.getInstance().getInstanceCR().firstname();
    toEnterInput(pom.getInstanceBHP().getFname(),firstname);
}

@When("^user Enter The Last Name$")
public void user_Enter_The_Last_Name() throws Throwable {
	String lastname = FileReaderManager.getInstance().getInstanceCR().lastname();
   toEnterInput(pom.getInstanceBHP().getLname(), lastname);
}

@When("^user Enter The Billing Address$")
public void user_Enter_The_Billing_Address() throws Throwable {
	String address = FileReaderManager.getInstance().getInstanceCR().address();
    toEnterInput(pom.getInstanceBHP().getAdd(),address);
}

@When("^user Enter The Credit Card Number$")
public void user_Enter_The_Credit_Card_Number() throws Throwable {
	String cardno = FileReaderManager.getInstance().getInstanceCR().getcardNo();
    toEnterInput(pom.getInstanceBHP().getCardno(),cardno);
}

@When("^user Select The Card Type From The MultipleDropDown$")
public void user_Select_The_Card_Type_From_The_MultipleDropDown() throws Throwable {
    toSelectByIndex(pom.getInstanceBHP().getType(),2);
}

@When("^user Select The Expiry Month From The MultipleDropDown$")
public void user_Select_The_Expiry_Month_From_The_MultipleDropDown() throws Throwable {
   toSelectByValue(pom.getInstanceBHP().getMonth(),"3");
}

@When("^user Select The Expiry Year From The MultipleDropDown$")
public void user_Select_The_Expiry_Year_From_The_MultipleDropDown() throws Throwable {
  toSelectByIndex(pom.getInstanceBHP().getYear(), 12);
}

@When("^user Enter The Cvv Number$")
public void user_Enter_The_Cvv_Number() throws Throwable {
	String cvv = FileReaderManager.getInstance().getInstanceCR().getcvvno();
	toEnterInput(pom.getInstanceBHP().getCvv(),cvv);
   
}

@Then("^user Click The Book Now Button And It Navigate To Confirm Booking Page$")
public void user_Click_The_Book_Now_Button_And_It_Navigate_To_Confirm_Booking_Page() throws Throwable {
    toClick(pom.getInstanceBHP().getBookbtn());
}


@When("^user Click The My Itinerary Button$")
public void user_Click_The_My_Itinerary_Button() throws Throwable {
	toSleep();

    toClick(pom.getInstanceCP().getItinerary());
    
}

@When("^user Scroll Down To Search Hotel Button$")
public void user_Scroll_Down_To_Search_Hotel_Button() throws Throwable {
	
    //toScroll(cp.getLogoutBtn());
    toScroll(pom.getInstanceCP().getSearchHotelBtn());
    toSleep();
}


@When("^user Take ScreenShot$")
public void user_Take_ScreenShot() throws Throwable {
	
    toTakeScreenshot1(driver);
    
}

@Then("^Click Logout$")
public void click_Logout() throws Throwable {
	toSleep();
    toClick(pom.getInstanceCP().getLogout());
}


}
