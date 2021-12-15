package com.freshflows.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.freshflows.pageObjects.LoginPage;

public class TC_01 extends BaseClass {

	@Test
	public void login() throws InterruptedException, IOException {
		LoginPage login = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		login.setUserName(username);
		login.setPassword(password);
		login.setSubmit();
		Thread.sleep(3000);
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(driver.getTitle().equals("Freshflows.io"))
		{
			Assert.assertTrue(true);
			logger.info("login passed");
		}
		else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("login method failed");
		}
	}
}
