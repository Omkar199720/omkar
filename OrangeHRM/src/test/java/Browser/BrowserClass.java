package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserClass {

    public static WebDriver chromebrowser() {
    
    	WebDriver driver = WebDriverManager.chromedriver().create();
    	driver = new ChromeDriver();
    	return driver;
//    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   	
    }
	
    public static WebDriver Withouthead() {
    	ChromeOptions op = new ChromeOptions();
        op.setHeadless(true);
    	WebDriver driver = WebDriverManager.chromedriver().create();
    	return driver;
//    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   	
    }
    
    public static WebDriver firefoxbrowser() {       
    	WebDriver driver = WebDriverManager.firefoxdriver().create();
    	driver = new FirefoxDriver();
    	return driver;
//    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   	
    }
}
