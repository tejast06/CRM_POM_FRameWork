package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.baseclass.BaseClass;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.CreateNewContact;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class TestCreateNewContactPage extends BaseClass {
	
	
	
	public TestCreateNewContactPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	CreateNewContact newContact;
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.logIn(prop.getProperty("username"),prop.getProperty("password"));
		 homepage.clickOnContact();
		 contactpage=new ContactPage();
		 contactpage.clickOnNewBtn();
		 newContact = new CreateNewContact();
	}
	
	@Test(priority=1)
	public void enterNewData() throws InterruptedException {
		
		newContact.enterNewData();
		Thread.sleep(3000);
		newContact.selectValueFromDropDown();
	}
	
	
	

}
