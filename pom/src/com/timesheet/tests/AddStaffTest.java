package com.timesheet.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testbase.BrowserFactory;
import com.timesheet.pages.AddStaff;

public class AddStaffTest {
	String joiningdate = "Please Select Joining Date";
	String name = "Please Enter Name";
	String salary = "Please Enter Salary";
	String licenseNo = "Please Enter License No";
	String email = "Please Enter Email ID";
	String contact="Please Enter Contact no";
	String address="Please Enter Address";
	
	WebDriver driver;
	AddStaff addstaff;
	BrowserFactory browser = new BrowserFactory();

	@BeforeTest
	public void launchBrowser() {
		driver = browser.startBrowser("firefox", "https://timesheet.sackalerts.world/AddStaff.aspx");

		// System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		// driver = new ChromeDriver();
		// driver.get("https://timesheet.sackalerts.world/AddStaff.aspx");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		addstaff = PageFactory.initElements(driver, AddStaff.class);
	}

	@Test(priority=1)
	public void verifyAddStaffPageTest() {
		addstaff.verifyAddStaff();
		String staffpage = addstaff.addStaffPagetitle.getText();
		if (staffpage.equals("ADD STAFF")) {
			System.out.println("we are in ADD STAFF PAGE");
		} else {
			System.out.println("not in ADD STAFF");
		}
	}

//	@Test(priority=10)
//	public void verifyStaffRecordPageTest() {
//		addstaff.verifyStaffRecord();
//		String staffRecordpage = addstaff.StaffRecordPagetitle.getText();
//
//		if (staffRecordpage.equals("STAFF RECORD")) {
//			System.out.println("we are in STAFF RECORD PAGE");
//		} else {
//			System.out.println("not in ADD STAFF");
//		}
//	}

	@Test(priority=2)
	public void verifyAddStaffFormTest() {
		addstaff.verifyAddStaff();
		
		addstaff.verifyAddStaffForm("11/05/2015", "2000", "phani", "ap123456", "phanok000@gmail.com", "7416744393",
				"koti","C:\\Users\\admin\\Desktop\\manoj.xlsx","12/05/2018","12/04/2018");
		addstaff.verifyAlertmessage();
	}

	@Test(priority=3)
	public void verifyAddStaffJoiningDateCheck() {
		addstaff.verifyAddStaff();
		addstaff.verifyAddStaffForm("", "2000", "phani", "ap123456", "phanok000@gmail.com", "7416744393", "koti","C:\\Users\\admin\\Desktop\\manoj.xlsx","12/05/2018","12/04/2018");

		Assert.assertEquals(addstaff.addStaffDateCheck.getText(), joiningdate);
		// verifyAddStaffFormTest();
		// addstaff.addStaffjoiningDate.clear();

	}

	@Test(priority=4)
	public void verifyAddStaffNameCheck() {
		addstaff.verifyAddStaff();
		addstaff.verifyAddStaffForm("06/05/2018", "2000", "", "ap123456", "phanok000@gmail.com", "7416744393", "koti","C:\\Users\\admin\\Desktop\\manoj.xlsx","12/05/2018","12/04/2018");
		Assert.assertEquals(addstaff.addStaffNameCheck.getText(), name);

	}

	@Test(priority=5)
	public void verifyAddStaffSalaryCheck() {
		addstaff.verifyAddStaff();
		addstaff.verifyAddStaffForm("06/05/2018", "", "phani", "ap123456", "phanok000@gmail.com", "7416744393", "koti","C:\\Users\\admin\\Desktop\\manoj.xlsx","12/05/2018","12/04/2018");
		Assert.assertEquals(addstaff.addStaffSalaryCheck.getText(), salary);

	}

	@Test(priority=6)
	public void verifyAddStaffLicenseCheck() {
		addstaff.verifyAddStaff();
		addstaff.verifyAddStaffForm("06/05/2018", "2000", "phani", "", "phanok000@gmail.com", "7416744393", "koti","C:\\Users\\admin\\Desktop\\manoj.xlsx","12/05/2018","12/04/2018");
		Assert.assertEquals(addstaff.addStaffLicenceCheck.getText(), licenseNo);

	}

	@Test(priority=7)
	public void verifyAddStaffEmailCheck() {
		addstaff.verifyAddStaff();
		addstaff.verifyAddStaffForm("06/05/2018", "2000", "phani", "ap123456", "", "7416744393", "koti","C:\\Users\\admin\\Desktop\\manoj.xlsx","12/05/2018","12/04/2018");
		Assert.assertEquals(addstaff.addStaffEmailCheck.getText(), email);

	}

	
	
	@Test(priority=8)
	public void verifyAddStaffContactCheck() {
		addstaff.verifyAddStaff();
		addstaff.verifyAddStaffForm("06/05/2018", "2000", "phani", "ap123456", "phanok000@gmail.com", "", "koti","C:\\Users\\admin\\Desktop\\manoj.xlsx", "12/05/2018", "12/04/2018");
		Assert.assertEquals(addstaff.addStaffContactCheck.getText(), contact);

	}
	@Test(priority=9)
	public void verifyAddStaffAddressCheck() {
		addstaff.verifyAddStaff();
		addstaff.verifyAddStaffForm("06/05/2018", "2000", "phani", "ap123456", "phanok000@gmail.com", "7416744393", " ","C:\\Users\\admin\\Desktop\\manoj.xlsx", "12/05/2018", "12/04/2018");
		Assert.assertEquals(addstaff.addStaffAddressCheck.getText(), address);
	}
//	@Test(priority=11)
//	public void verifyTabledata() {
//    addstaff.addRecordTableCheck();
//
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
