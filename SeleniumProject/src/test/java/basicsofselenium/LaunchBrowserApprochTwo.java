package basicsofselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserApprochTwo {
	
	@Test
	
	public void launchBrowsertwo()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/signup");
					
	}

}
