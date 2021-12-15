package com.freshflows.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtmail;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpswd;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement txsubmit;
	
	public void setUserName(String uname)
	{
		txtmail.sendKeys(uname);
	}

	public void setPassword(String pswd)
	{
		txtpswd.sendKeys(pswd);
	}
	
	public void setSubmit()
	{
		txsubmit.click();
	}
}
