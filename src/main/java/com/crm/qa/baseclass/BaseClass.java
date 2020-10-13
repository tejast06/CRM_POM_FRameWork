package com.crm.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.utility.TestUtil;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public BaseClass() throws IOException
	{
		prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\Tejas Toley\\eclipse-workspace\\OrangeHRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
        prop.load(ip);	
	}
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitWait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
