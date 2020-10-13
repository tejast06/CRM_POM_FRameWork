package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.baseclass.BaseClass;

public class ContactPage extends BaseClass {

	public ContactPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='New']")
	WebElement newBtn;
	
//	
	
	public CreateNewContact clickOnNewBtn() throws IOException {
		newBtn.click();
		return new CreateNewContact();
	}
	

}
