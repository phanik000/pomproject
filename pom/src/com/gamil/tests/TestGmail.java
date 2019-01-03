package com.gamil.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gamil.pages.Signin;
import com.gamil.pages.Signout;

public class TestGmail {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		driver = new FirefoxDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		System.out.println("browser ha launched and get into gmail signin ");

	}

	@Test
	public void signIn() throws Exception {
		Signin s = new Signin(driver);
		s.userName("phanik000");
		Thread.sleep(2000);
		s.userNext();
		Thread.sleep(1000);
		s.userPassword("phanikumar");
		Thread.sleep(2000);
		s.passNext();
		Thread.sleep(1000);
		Signout so = new Signout(driver);
		so.signOut();
		so.signoutUser();
	}

	@AfterTest
	public void Teardown() {
		driver.close();
	}
}
