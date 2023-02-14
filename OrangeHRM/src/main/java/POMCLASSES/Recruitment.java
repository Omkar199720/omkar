package POMCLASSES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recruitment {

	@FindBy (xpath = "//span[text()='Recruitment']")
	private WebElement Recurit;
	
	@FindBy (xpath = "//a[text()='Vacancies']")
	private WebElement vacancy;
	
	@FindBy (xpath = "(//div[@class='oxd-select-text--after'])[1]")
	private WebElement jobclick;
	
	@FindBy (xpath = "(//div[text()='QA Lead'])[1]")
	private WebElement qaclick;
	
	@FindBy (xpath = "(//div[@class='oxd-select-text--after'])[2]")
	private WebElement vacancyclick;
	
	@FindBy (xpath = "//span[text()='Senior QA Lead']")
	private WebElement seniorqa ;
	
	@FindBy (xpath = "(//div[@class='oxd-select-text--after'])[3]")
	private WebElement hiringclick;
	
	@FindBy (xpath="//span[text()='Kevin Mathews']")
	private WebElement hiringselection;
	
	@FindBy (xpath="(//div[@class='oxd-select-text--after'])[4]")
	private WebElement statusclick;
	
	@FindBy (xpath="//span[text()='Active']")
	private WebElement statusselection;
	
	@FindBy (xpath="//button[text()=' Search ']")
	private WebElement search;
	
	@FindBy (xpath="//span[text()='No Records Found']")
	private WebElement msg;
	
	public WebDriver driver;

	public Recruitment(WebDriver driver) {
	PageFactory.initElements(driver, this);
    this.driver = driver;
	}
	
	public void clickonjobtitle() throws InterruptedException {
		Recurit.click();
		Thread.sleep(2000);
		vacancy.click();
		Thread.sleep(1000);
		jobclick.click();
		Thread.sleep(2000);
		qaclick.click();	
		System.out.println("job title is pass");
	}
	
	public void clickonvacancy() throws InterruptedException {
		Thread.sleep(4000);
		vacancyclick.click();
		Thread.sleep(4000);
		seniorqa.click();	
		System.out.println("vacancy is pass");
	}
	
	public void clickonHiring() throws InterruptedException {
		Thread.sleep(4000);
		hiringclick.click();
		Thread.sleep(3000);
		hiringselection.click();
		
	}
	
	public void clickonstatus() throws InterruptedException {
		Thread.sleep(3000);
		statusclick.click();
		Thread.sleep(3000);
		statusselection.click();		
	}
	
	public void clickonserach() throws InterruptedException {
		Thread.sleep(3000);
		search.click();
	}
	
	public void errormessagedisplay() throws InterruptedException {
		Thread.sleep(3000);
		String msg1 = msg.getText();
		if(msg1.endsWith("No Records Found")) {
			System.out.println("msg is corect");
		}else {
			System.out.println("msg is wrong");
		}
	}
}
