package browser_details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_details {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shrinidhi\\eclipse-workspace\\selenium_automation\\all_necessary_files\\chromedriver.exe");
		
		//Open the browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to website
		driver.get("https://www.flipkart.com/");
		
//		driver.navigate().to("https://www.flipkart.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Get title
		String titlename = driver.getTitle();
		System.out.println("Title name is\n");
		System.out.println(titlename);
		
		//get url
		String url = driver.getCurrentUrl();
		System.out.println("The page url is:\n");
		System.out.println(url);
		
		String page = driver.getPageSource();
		System.out.println("The page source is:\n");
		System.out.println(page);
		
		
		//Hold the execution in 2 sec.
		Thread.sleep(2000);
		//close the browser.
		driver.quit();
	}

}
