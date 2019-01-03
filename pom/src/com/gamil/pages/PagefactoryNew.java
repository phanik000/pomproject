package com.gamil.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PagefactoryNew {
	WebDriver driver;
public PagefactoryNew(WebDriver driverr) {
	this.driver=driverr;
}
	@FindBy(id="identifierId")
	WebElement uName;
	
	@FindBy(how=How.XPATH,using="//*[text()='Next']")
	WebElement uNext;

	@FindBy(css="input[type='password']")
	WebElement Pwd;
	
	@FindBy(how=How.XPATH,using="//*[text()='Next']")
	WebElement PwdNext;
	
	
	@FindBy(how=How.XPATH,using="//*[@class='gb_ab gbii']")
	WebElement signClick;
	
	@FindBy(how=How.XPATH,using="//*[text()='Sign out']")
	WebElement signOut;
	
	
	public void gmailLogin(String uname,String pwd) {
		uName.sendKeys("phanik000");
		uNext.click();
		Pwd.sendKeys("phanikumar");
		Pwd.click();
		signClick.click();
		signOut.click();
		
	}
}
 