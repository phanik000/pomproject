package com.gamil.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.gamil.pages.PagefactoryNew;
import com.testbase.BrowserFactory;

public class VerifyPageFactory {
	WebDriver driver;
	BrowserFactory browser=new BrowserFactory();
	@Test
	public  void veirfyGmail() {
		//this will launch browser and specific url
driver=browser.startBrowser("Firefox","https://mail.google.com");
	//created page object using page factory
PagefactoryNew page=PageFactory.initElements(driver, PagefactoryNew.class);
page.gmailLogin("phanik000", "phanikumar");


}
}