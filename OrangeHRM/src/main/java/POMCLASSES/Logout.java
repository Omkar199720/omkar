package POMCLASSES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy (xpath="//p[@class='oxd-userdropdown-name']")
	private WebElement dropdown ;
	
	@FindBy (xpath="//a[text()='Logout']")
	private WebElement logout ;
	
	
	public WebDriver driver;
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickthelogout() {
		dropdown.click();
		logout.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
}