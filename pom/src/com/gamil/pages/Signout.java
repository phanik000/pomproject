package com.gamil.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signout {
WebDriver driver;
By sign=By.xpath("//*[@class='gb_ab gbii']");
By signout=By.xpath("//*[text()='Sign out']");


public Signout(WebDriver driver) {
	this.driver=driver;
}
public void signOut() {
	driver.findElement(sign).click();
}
	
	public void signoutUser() {
		driver.findElement(signout).click();

	}



}