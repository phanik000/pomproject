package com.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public WebDriver driver;

	public WebDriver startBrowser(String browserName, String url) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\Testing Softwares\\geckodriver.exe");
		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}

		else

			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}
		driver.get(url);
		return driver;
	}
}
