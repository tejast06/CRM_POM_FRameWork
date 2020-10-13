package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.baseclass.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Tejas Toley']")
	WebElement userName;
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contact;
	
	public ContactPage clickOnContact() throws IOException {
		contact.click();
		return new ContactPage();
	}
	
	public void verifyUserName() {
	   boolean verify=userName.isDisplayed();
	   System.out.println(verify);
	}

}
