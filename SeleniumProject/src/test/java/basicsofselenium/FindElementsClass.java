package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsClass{
	
	@Test
	
	public void signUp() {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://upload.facebook.com/reg/");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rasika");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dhokane");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("11223344");
		
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("19");  // bootstrape dropdown
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Sep");  //  bootstrape dropdown
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2023");  // bootstrape dropdown
//		
//		List<WebElement> dayValues = driver.findElements(By.xpath("//*[@name='birthday_day']//option"));
//		for (WebElement Day: dayValues)
//		{
//			String dayValues1 = Day.getText();
//			System.out.println(dayValues1);
//			if(dayValues1.equals("19"))
//			{
//				Day.click();
//				
//				}
			
//
//			List<WebElement> monthValues = driver.findElements(By.xpath("//*[@name='birthday_month']//option"));
//			for (WebElement Month : monthValues)
//			{
//				String monthValues1 = Month.getText();
//				System.out.println(monthValues1);
//				if(monthValues1.equals("sep"))
//				{
//					Month.click();
//					
//					}
//				
//				
//				List<WebElement> yearValues = driver.findElements(By.xpath("//*[@name='birthday_year']//option"));
//				for (WebElement Year : yearValues)
//				{
//					String yearValues1 = Year.getText();
//					System.out.println(yearValues1);
//					if(yearValues1.equals("1996"))
//					{
//						Year.click();
//						break;
//						
//						}
//		}
			
		}}

