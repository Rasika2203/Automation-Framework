package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByUsingTags {
	
	
@Test
   public void tagMethod()  //non static method
   {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	//WebDriverManager.edgedriver().setup();
	//WebDriver driver1 = new EdgeDriver();
	//driver1.manage().window().maximize();
	driver.get(" https://www.facebook.com/r.php?locale=en_GB&display=page");
//	WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
//	firstName.sendKeys("Rasika");
//	WebElement lastname = driver.findElement(By.xpath(("//input[@name='lastname']")));
//	lastname.sendKeys("Dhokane");
//	WebElement mobnumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//	mobnumber.sendKeys("123456789");
//	
//	WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//	password.sendKeys("11223344");
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rasika");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dhokane");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("11223344");
	
//	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//	Select selectDay = new Select(day);  // select dropdown
//	selectDay.selectByVisibleText("19");
//	
//	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//	Select selectMonth = new Select(month);
//	selectMonth.selectByVisibleText("Sep");
//	
//	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year"));
//	Select selectYear = new Select(year);
//	selectYear.selectByVisibleText("2023");
	
	driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("19");  // bootstrape dropdown
	driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Sep");  //  bootstrape dropdown
	driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2023");  // bootstrape dropdown
	
	driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();   //(//label[@class='_58mt'])[2]   //label[text()='Female']
	driver.findElement(By.xpath("//button[@id='u_0_n_1e']")).click();
//	WebElement msg = driver.findElement(By.xpath("(//input[@class='_8esa'"));
//	
//	String message = msg.getText();
//	System.out.println(message);
//	String expectedMessage = "Female";
//	if (expectedMessage.equals(message))
//	{
//	System.out.println("Test Case Pass");
//	}
//	else
//		{
//		System.out.println("Test Case Fail");
//		}
	
   }
}
	
	
	
	// WebElement firstname1=  driver.findElement(By.name("firstname"));
	// firstname1.sendKeys("Rasika");
	 
				
	//"https://www.facebook.com/signup"
	////https://www.amazon.in/
	//<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" 
	//name="firstname" value="" aria-required="true" placeholder="First name" aria-label="First name" id="u_2_8_to" tabindex="0">

	 // input - tag name 
	 // id - attribute name
	// u_2_8_to - attribute value
    // by link text   //by partial link text // by tag name- reliable
    // by xpath - //tagname[@attributename='attribute-value']
    // customization of xpath
    // text()- //div[text()='Mobilr number or email address']
    //contains() -//input[contains(@id,'u_0_g_oY')]
    // Logical operations - and -//*[@type='text' and @name ='reg_email_']

    // Relative xpath: Whenever we write the xpath using // then it is called relative xpath inside relative xpath
   // we can jump from parent to any child directly by skipping the middle part(in between child nodes )

  // Absolute xpath: The xpath which we write using   '\' single forword slash is called as absolute xpath.
  



