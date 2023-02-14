package TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browser.BrowserClass;
import POMCLASSES.Logout;
import POMCLASSES.Orangehrm;
import POMCLASSES.Recruitment;
import POMCLASSES.Timehrm;

public class Testclass1 {

	private WebDriver driver;
	private Orangehrm org;
	private Logout out;
//	private Adminpage admin;
	private Timehrm tim;
	private Recruitment recruit;
	int Testid;
	SoftAssert softassert;
	
	@BeforeTest
	public void BrowserSetup() {
//	driver = BrowserClass.Withouthead();
    driver = BrowserClass.chromebrowser();
    System.out.println("Browser is Launched");
    driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void ObjectofClasses(){
	System.out.println("Beforeclass is Excuted");
//    extent = new ExtentsHtmlReporter();
	}
	
	@BeforeMethod
	public void LaunchTheBrowser() throws EncryptedDocumentException, IOException {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println(driver.getCurrentUrl());
	org = new Orangehrm(driver);
	out = new Logout(driver);
	String username=Utility.Utility.getdatafromexcel("Sheet3", 0, 0);
	System.out.println(username);
	String password=Utility.Utility.getdatafromexcel("Sheet3", 0, 1);
	System.out.println(password);
	org.Username(username);    //username
	org.Password(password);    //password
	org.Login();	           //loginbutton
//	admin = new Adminpage(driver);
	tim = new Timehrm(driver);         //object creation
	recruit = new Recruitment(driver);  //object creation
	softassert  = new SoftAssert();
	}
	
	@Test (priority=1)       //test case1
	public void LoginTheOrangehrm() throws InterruptedException {
    Testid = 100;
	tim.verifythetime();
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
	}
	
	@Test                //test case 2
	public void VerifytheRecruitment() throws InterruptedException {
	recruit.clickonjobtitle();
	recruit.clickonvacancy();
	recruit.clickonHiring();
	recruit.clickonstatus();
	recruit.clickonserach();
	recruit.errormessagedisplay();
    String url1 =driver.getCurrentUrl();
	softassert.assertEquals(url1,"https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewJobVacancy");
	softassert.assertAll();
	}
	
	
//	@Test
//	public void LogintheOrangehrm() throws EncryptedDocumentException, IOException, InterruptedException  {
//	Testid = 101;
//	admin.verifytheorganisation();
//	admin.savathedata();
//	admin.registrationdetails();
//    admin.taxdetails();
//    admin.cellphonenumber();
//    admin.faxdetails();
//	admin.mailid();
//	admin.addressone();
//	admin.addresstwo();
//	admin.cityname();
//	admin.statee();
//    admin.pincoder();
//	admin.savadata();
//	}
	
	@AfterMethod
	public void Logoutapp(ITestResult result) throws IOException {
	
		if(ITestResult.SUCCESS==result.getStatus())   //pass
		{
		Utility.Utility.getscreenshot(driver,Testid);
	    }
		
		if(ITestResult.FAILURE==result.getStatus()) {         //fail
		Utility.Utility.getscreenshot(driver, Testid);
		}
		out.clickthelogout();            //Logout
	    System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void FlushtheObject() {
    tim = null;
    System.out.println("Afterclass");
	}
	
	@AfterTest
	public void QuitTheBrowser() {
	System.out.println("aftertest");
	//driver.close();
	}
	
	
	
	
	
}
