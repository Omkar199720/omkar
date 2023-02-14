package POMCLASSES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehrm {
  
	@FindBy (xpath = "//input[@name='username']" )
    private WebElement username;
    
	@FindBy (xpath = "//input[@name='password']" )
    private WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement LoginButton;
	
	public WebDriver driver;

	public Orangehrm (WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	public String Username(String id) {
		username.sendKeys(id);
		return id;	
	}
	
	public String Password(String pass) {
		password.sendKeys(pass);
		return pass;		
	}
	public void Login() {
		LoginButton.click();
	}
	
	
}

