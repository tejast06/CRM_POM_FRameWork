package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.baseclass.BaseClass;

public class CreateNewContact extends BaseClass {

	public CreateNewContact() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//div[@name='company']")
	WebElement companyName;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement email;
	
	@FindBy(xpath="//div[@name='category']")
	WebElement category;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement btn;
	
	
	
	public void enterNewData() {
		firstname.sendKeys("tejas");
		lastname.sendKeys("toley");
		companyName.sendKeys("ABC");
		email.sendKeys("tejas100@gmail.com");
		btn.click();
	}
	
	public void selectValueFromDropDown() {  
		category.click(); 
		Select action = new Select(category);
		action.selectByVisibleText("Customer");
		
	}

}
