package POMCLASSES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Timehrm {

	@FindBy (xpath ="//span[text()='Time']")
	private WebElement Time;
	
	@FindBy (xpath ="//input[@placeholder='Type for hints...']")
	private WebElement input;
	
	@FindBy (xpath ="(//button[text()=' View '])[1]")
	private WebElement view;
	
	@FindBy (xpath ="//span[text()='Required']")
	private WebElement errormsg;
	
	public WebDriver driver;
	
	public Timehrm(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void verifythetime() throws InterruptedException {
		Time.click();
		Thread.sleep(3000);
		input.sendKeys("omkar wagh");
		Thread.sleep(2000);
		view.click();
		Thread.sleep(2000);
		String msg = errormsg.getText();
		if(msg.equals("Required")) {
			System.out.println("test is pass");
		}else {
			System.out.println("test is fails");
		}
	}
}
