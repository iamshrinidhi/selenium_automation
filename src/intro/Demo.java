package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shrinidhi\\eclipse-workspace\\selenium_automation\\all_necessary_files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.close();
		
		//open firefox browser.
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shrinidhi\\eclipse-workspace\\selenium_automation\\all_necessary_files\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.close();
		
		//open IE browser
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\Shrinidhi\\eclipse-workspace\\selenium_automation\\all_necessary_files\\IEDriver.exe");
//		WebDriver driver=new InternetExplorerDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.close();
		
		
		//Open safari browser.
//		WebDriver driver=new ChromeDriver();
		
		
		//open edge browser.
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Shrinidhi\\eclipse-workspace\\selenium_automation\\all_necessary_files\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.close();
		
	}

}
