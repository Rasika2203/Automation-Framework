package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
// Window handling : we can handle the window in selenium by using the unique id of every window on that basis we
// switch to multiple windows.

import io.github.bonigarcia.wdm.WebDriverManager;

// to get the parent window id (the window which got opened first):
// String parentid = driver.switchTo().getWindowHandle();
// To get the window id we have to use :
// Set<String> allwinid = driver.switchTo().getWindowHandles();

public class WindowHandling {
	
	@Test
	
	public void window()
	{
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Windows.html");
			
			String parentId = driver.getWindowHandle();
			System.out.println(parentId);
			
			driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
			//driver.findElement(By.xpath("//button[text()='click']")).click();
			driver.findElement(By.xpath("//*[@onclick='multiwindow()']")).click();
		
		
	}
	}
}
