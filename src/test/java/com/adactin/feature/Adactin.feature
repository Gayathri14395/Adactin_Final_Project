Feature: Booking Hotel In The Adactin Application

@smokeTest
Scenario Outline: Login Functionality
Given user Launch The Application
When user Enter The "<Username>" In Username Textbox
And user Enter The "<Password>" In Password TextBox
Then user Click On The Login Button And It Navigates To The Search Hotel Page

Examples:
|Username|Password|
|ABC|123|
|XYZ|456|
|Gayathri143|abc123*|

@smokeTest
Scenario: Hotel Search Functionality
When user Select The Desired Location From The MultipleDropDown
And user Select The Desired Hotel Name From The MultipleDropDown
And user Select The Desired Type Of Room From The MultipleDropDown
And user Select The Desired Number Of Rooms From The MultipleDropDown
And user Clear The Given Date 
And user Enter The CheckIn Date
And user Clear The Given Out Date 
And user Enter The CheckOut Date
And user Select The Desired Number Of Adults Per Room From The MultipleDropDown
And user Select The Desired Number Of Children Per Room From The MultipleDropDown
Then user Click On The Serach Button And It Navigates To The Select Hotel Page

@sanityTest
Scenario: Select Hotel Functionality
When user Choose The Radio Button Of The Desired Hotel
Then user Click The Continue Button And It Navigates To The Book Hotel Page

@regressionTest
Scenario: Book Hotel Functionality
When user Enter The First Name
And user Enter The Last Name
And user Enter The Billing Address
And user Enter The Credit Card Number
And user Select The Card Type From The MultipleDropDown
And user Select The Expiry Month From The MultipleDropDown
And user Select The Expiry Year From The MultipleDropDown
And user Enter The Cvv Number
Then user Click The Book Now Button And It Navigate To Confirm Booking Page

@regressionTest
Scenario: Confirm Booking Functionality
When user Click The My Itinerary Button
And user Scroll Down To Search Hotel Button
And user Take ScreenShot
Then Click Logout



 
 
 