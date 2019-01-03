package com.timesheet.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddStaff {
	WebDriver driver;
	String addStaffPage;

	public AddStaff(WebDriver driverl) {
		this.driver = driverl;
	}

	@FindBy(xpath = "//a[text()='Staff']")
	public WebElement staffClick;

	@FindBy(xpath = "//a[text()='Add Staff']")
	public WebElement addStaffClick;

	@FindBy(xpath = "//a[text()='Staff Records']")
	public WebElement staffRecordsclick;

	@FindBy(xpath = "//div[@class='container']/h3")
	public WebElement addStaffPagetitle;

	@FindBy(xpath = "//h3[text()='STAFF RECORD']")
	public WebElement StaffRecordPagetitle;

	@FindBy(id = "TextBox3")
	public WebElement addStaffjoiningDate;

	@FindBy(xpath = "//input[@id='TextBox4']")
	public WebElement addStaffSalarydata;

	@FindBy(xpath = "//input[@id='TextBox1']")
	public WebElement addStaffNameData;

	@FindBy(xpath = "//input[@id='TextBox7']")
	public WebElement addStaffLicenceData;

	@FindBy(xpath = "//input[@id='TextBox2']")
	public WebElement addStaffEmailidData;

	@FindBy(xpath = "//input[@id='TextBox6']")
	public WebElement addStaffContactNum;

	@FindBy(xpath = "//textarea[@id='TextBox5']")
	public WebElement addStaffAddressData;

	@FindBy(xpath = "//input[@id='rbn_0']")
	public WebElement addStaffGenderClick;
	
	
	@FindBy(xpath = "//input[@id='FileUpload1']")
	public WebElement addStaffUploadClick;
	@FindBy(id = "TextBox23")
	public WebElement addStaffExpireDate;
	@FindBy(id = "TextBox38")
	public WebElement addStaffNotificationDate;
	
	
	
	

	@FindBy(xpath = "//input[@id='Button1']")
	public WebElement addStaffSaveButton;

	@FindBy(xpath = "//span[@id='ctl18']")
	public WebElement addStaffDateCheck;

	@FindBy(xpath = "//span[@id='ctl15']")
	public WebElement addStaffNameCheck;

	@FindBy(xpath = "//span[@id='ctl19']")
	public WebElement addStaffSalaryCheck;

	@FindBy(xpath = "//span[@id='ctl20']")
	public WebElement addStaffLicenceCheck;

	@FindBy(xpath = "//span[@id='ctl16']")
	public WebElement addStaffEmailCheck;

	@FindBy(xpath = "//span[@id='ctl21']")
	public WebElement addStaffContactCheck;

	@FindBy(xpath = "//span[@id='ctl17']")
	public WebElement addStaffAddressCheck;

	@FindBy(xpath = "//table[@class='table table-striped dataTable no-footer dtr-inline collapsed']/tbody/tr")
	public List<WebElement> addStaffTabledataCheck;

	@FindBy(xpath = "//table[@class='table table-striped dataTable no-footer dtr-inline collapsed']/thead/tr/th")
	public List<WebElement> addStaffTableFieldCheck;

	public void verifyAddStaff() {
		staffClick.click();
		addStaffClick.click();
	}

	public void verifyStaffRecord() {
		staffClick.click();
		staffRecordsclick.click();
	}

	public void verifyAddStaffForm(String joiningdate, String salary, String name, String licence, String email,
			String contact, String Address,String upload,String expiredate,String notificationdate) {
		addStaffjoiningDate.sendKeys(joiningdate);
		addStaffSalarydata.sendKeys(salary);
		addStaffNameData.sendKeys(name);
		addStaffLicenceData.sendKeys(licence);
		addStaffEmailidData.sendKeys(email);
		addStaffContactNum.sendKeys(contact);
		addStaffAddressData.sendKeys(Address);
		addStaffGenderClick.click();
		addStaffUploadClick.sendKeys(upload);
		addStaffExpireDate.sendKeys(expiredate);
		addStaffNotificationDate.sendKeys(notificationdate);
		
		
		addStaffSaveButton.click();

	}

	public void verifyAlertmessage() {

		Alert a = driver.switchTo().alert();
		String alert = a.getText();
		System.out.println("alert is " + alert);
		a.accept();
	}

	public void addRecordTableCheck() {
		List<WebElement> tabledata = addStaffTabledataCheck;

		List<WebElement> tablefields = addStaffTableFieldCheck;

		int rowsize = tabledata.size();
		int fieldsize = tabledata.size();
		System.out.println("No.of Rows is " + rowsize + "\n" + "No.of columns is " + fieldsize);

		for (int data = 0; data < rowsize; data++) {
			String datatext = tabledata.get(data).getText();
			System.out.println(datatext);

		}

		for (int field = 0; field < fieldsize; field++) {
			String tablefieldsdata = tablefields.get(field).getText();
			System.out.println(tablefieldsdata);

		}

	}

}
