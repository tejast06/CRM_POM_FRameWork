package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.baseclass.BaseClass;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.logIn(prop.getProperty("username"),prop.getProperty("password"));
		 
		 
	}
	
	@Test(priority=2)
	public void testClickOnContact() throws IOException {
		contactpage=homepage.clickOnContact();
	}
	
	@Test(priority=1)
	public void verifyUserNameTitle() {
		homepage.verifyUserName();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
