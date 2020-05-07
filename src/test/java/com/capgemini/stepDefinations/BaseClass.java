package com.capgemini.stepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utitlities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public String url = readconfig.getApplicationUrl();
	public String mobileNumber = readconfig.MobileNumber();
	public String password = readconfig.Password();
	public String chromePath = readconfig.getChromeDriverPath();
	public String fireFoxPath = readconfig.getFireFoxDriverPath();
	public String key = readconfig.getKeyValue();
	public String searchData=readconfig.getSearchData();
	LoginStep lp=new LoginStep();
	public WebDriver driver;

	public void openBrowser(){
		System.setProperty(key, chromePath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
