package com.gamil.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signin {
	WebDriver driver;
	By userid =By.id("identifierId");
	By unext =By.xpath("//*[@id=\"identifierNext\"]/content/span");
	By password=By.cssSelector("#password input");
	//By password=By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input");
	By pnext=By.id("passwordNext");
	

public Signin(WebDriver driver) {
	
	this.driver=driver;
}
	public void userName(String username) {
		driver.findElement(userid).sendKeys(username);
	}
	public void userNext() {
		driver.findElement(unext).click();;

}
	public void userPassword(String userpass) {
		driver.findElement(password).sendKeys(userpass);
	
}
	public void passNext() {
		driver.findElement(pnext).click();
	}


}