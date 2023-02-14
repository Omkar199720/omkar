package POMCLASSES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminpage {

 // @FindBy ( xpath ="//span[text()='Admin']")
 // private WebElement admin;
	
 @FindBy (xpath = "//span[text()='Organization ']")
 private WebElement oranganisation;
 
 @FindBy (xpath = "//a[text()='General Information']")
 private WebElement generalinfo;
 
 @FindBy (xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-left']")
 private WebElement togglebutton;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
 private WebElement companyname;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
 private WebElement registrationnumber;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
 private WebElement taxid;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
 private WebElement phonenumber;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
 private WebElement fax;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
 private WebElement emailid;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[8]")
 private WebElement address1;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[9]")
 private WebElement address2;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[10]")
 private WebElement city;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[11]")
 private WebElement state;
 
 @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[12]")
 private WebElement pincode;
 
 @FindBy (xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
 private WebElement country;
 
 @FindBy (xpath = "//div[text()='India']")
 private WebElement selectindia;
 
 @FindBy (xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
 private WebElement notes;
 
 @FindBy (xpath = "//button[text()=' Save ']")
 private WebElement save;
 		
 public WebDriver driver;

public Adminpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
}

public void verifytheorganisation() throws InterruptedException {
	admin.click();
	Thread.sleep(2000);
	oranganisation.click();
	Thread.sleep(2000);
	generalinfo.click();
}
 public void savathedata() throws InterruptedException {
	 Thread.sleep(4000);
	 togglebutton.click();
	 companyname.sendKeys("virtusa");
	 //return companynames ;	 
 }
 public void registrationdetails() throws InterruptedException {
	 Thread.sleep(3000);
	 registrationnumber.sendKeys("123456789");
//	 registrationnumber.sendKeys(regtno);
//	 return regtno;
	 }
 
 public void taxdetails() throws InterruptedException {	
	 Thread.sleep(3000);
	 taxid.sendKeys("989878");	 
 }
 
 public void cellphonenumber() throws InterruptedException {
	 Thread.sleep(3000);
	 phonenumber.sendKeys("2147483647");
//	 return phnno;
 }
 
 public void faxdetails() throws InterruptedException {
	 Thread.sleep(3000);
	 fax.sendKeys("4567");
//	 return faxx;
 }
 
 public void mailid() throws InterruptedException {
	 Thread.sleep(3000);
	 emailid.sendKeys("omkarwagh20@gmail.com");
	 //return email;
 }
 
 public void addressone() throws InterruptedException {
	 Thread.sleep(3000);
	 address1.sendKeys("pune");
	// return addr1;
 }
 
 public void addresstwo() throws InterruptedException {
	 Thread.sleep(3000);
	 address2.sendKeys("phase 2");
	 //return addr2;
 }
public void cityname() throws InterruptedException {
	Thread.sleep(3000);
	city.sendKeys("Pune");
	//return City;
}
public void statee() throws InterruptedException {
	Thread.sleep(3000);
	state.sendKeys("Maharshtra");
//	return State;
}
 public void pincoder() throws InterruptedException {
	 Thread.sleep(3000);
	 pincode.sendKeys("413709");
//	 return code;
 }
 public void savadata() throws InterruptedException {
	 Thread.sleep(3000);
	 country.click();
	 Thread.sleep(3000);
	 selectindia.click();
	 Thread.sleep(3000);
	 notes.sendKeys("im alright");
	 Thread.sleep(3000);
	 save.click();
 }
 
 
 
}
