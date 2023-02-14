package TestClasses;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass2 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().create();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for(WebElement links : link) 
		{
			String url = links.getAttribute("href");
			
			URL url1 = new URL(url);
			
			URLConnection url2 =  url1.openConnection();
			
			HttpURLConnection url3 = (HttpURLConnection)url2;
			
			url3.setConnectTimeout(5000);
			url3.connect();
			
			if(url3.getResponseCode()==200)
			{ System.out.println("reponse code is "+url3.getResponseCode()+" message for code is "+url3.getResponseMessage());
			}
			if(url3.getResponseCode()==404)
			{ System.out.println("reponse code is "+url3.getResponseCode()+" message for code is "+url3.getResponseMessage());
		    }
		}
		
	}

}
