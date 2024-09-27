package basicsofselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	
	 public void launChromeBrowser()
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratik Dhokane\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
	 }
	

}
