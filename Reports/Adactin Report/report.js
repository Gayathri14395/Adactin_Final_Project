$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel In The Adactin Application",
  "description": "",
  "id": "booking-hotel-in-the-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Functionality",
  "description": "",
  "id": "booking-hotel-in-the-adactin-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Textbox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password TextBox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "booking-hotel-in-the-adactin-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "booking-hotel-in-the-adactin-application;login-functionality;;1"
    },
    {
      "cells": [
        "ABC",
        "123"
      ],
      "line": 12,
      "id": "booking-hotel-in-the-adactin-application;login-functionality;;2"
    },
    {
      "cells": [
        "XYZ",
        "456"
      ],
      "line": 13,
      "id": "booking-hotel-in-the-adactin-application;login-functionality;;3"
    },
    {
      "cells": [
        "Gayathri143",
        "abc123*"
      ],
      "line": 14,
      "id": "booking-hotel-in-the-adactin-application;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "booking-hotel-in-the-adactin-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"ABC\" In Username Textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123\" In Password TextBox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 3700445583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ABC",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Textbox(String)"
});
formatter.result({
  "duration": 194680998,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_TextBox(String)"
});
formatter.result({
  "duration": 161174395,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 444481893,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Functionality",
  "description": "",
  "id": "booking-hotel-in-the-adactin-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"XYZ\" In Username Textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"456\" In Password TextBox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 280479394,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "XYZ",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Textbox(String)"
});
formatter.result({
  "duration": 76158869,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "456",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_TextBox(String)"
});
formatter.result({
  "duration": 69965286,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 351421729,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Functionality",
  "description": "",
  "id": "booking-hotel-in-the-adactin-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Gayathri143\" In Username Textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"abc123*\" In Password TextBox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 243731290,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gayathri143",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Textbox(String)"
});
formatter.result({
  "duration": 87489347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123*",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_TextBox(String)"
});
formatter.result({
  "duration": 78956594,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1949817892,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Hotel Search Functionality",
  "description": "",
  "id": "booking-hotel-in-the-adactin-application;hotel-search-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Select The Desired Location From The MultipleDropDown",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select The Desired Hotel Name From The MultipleDropDown",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Desired Type Of Room From The MultipleDropDown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Desired Number Of Rooms From The MultipleDropDown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Clear The Given Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter The CheckIn Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Clear The Given Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Enter The CheckOut Date",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Select The Desired Number Of Adults Per Room From The MultipleDropDown",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Select The Desired Number Of Children Per Room From The MultipleDropDown",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Click On The Serach Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Desired_Location_From_The_MultipleDropDown()"
});
formatter.result({
  "duration": 484065901,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Desired_Hotel_Name_From_The_MultipleDropDown()"
});
formatter.result({
  "duration": 120355941,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Desired_Type_Of_Room_From_The_MultipleDropDown()"
});
formatter.result({
  "duration": 135837231,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Desired_Number_Of_Rooms_From_The_MultipleDropDown()"
});
formatter.result({
  "duration": 106981052,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clear_The_Given_Date()"
});
formatter.result({
  "duration": 59329006,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_CheckIn_Date()"
});
formatter.result({
  "duration": 85659639,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clear_The_Given_Out_Date()"
});
formatter.result({
  "duration": 58272316,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_CheckOut_Date()"
});
formatter.result({
  "duration": 71067954,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Desired_Number_Of_Adults_Per_Room_From_The_MultipleDropDown()"
});
formatter.result({
  "duration": 106603369,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Desired_Number_Of_Children_Per_Room_From_The_MultipleDropDown()"
});
formatter.result({
  "duration": 131952438,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Serach_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 581025638,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "booking-hotel-in-the-adactin-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user Choose The Radio Button Of The Desired Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Click The Continue Button And It Navigates To The Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Radio_Button_Of_The_Desired_Hotel()"
});
formatter.result({
  "duration": 96405119,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page()"
});
formatter.result({
  "duration": 577891284,
  "status": "passed"
});
});