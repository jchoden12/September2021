package variousLocators;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	WebDriver driver;

	@Before
	public void launchBrowser() {
		// create and set Property
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();
		// set URL
		driver.get("https://objectspy.space/");
		// Maximize
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		// define wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void learnElementLocator() {

	//	driver.findElement(By.name("firstname")).sendKeys("Sonam");
		// link Text
	//	driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		// wait
		// Thread.sleep(6000);
		// navigate back
		// driver.navigate().back();
		// partial link Text
		// driver.findElement(By.partialLinkText("OS-API Product ")).click();
		// CSS selector
//    driver.findElement(By.cssSelector("input# exp-1")).click();
		driver.findElement(By.cssSelector("input[type='radio'][id='exp-1']")).click();
		
		//XPath
		//Absolute
	//	driver.findElement(By.xpath("//input[@name='lastname' and @ type='text']")).sendKeys("Selenium is fun!!");
	//	driver.findElement(By.xpath("//input[@value='Selenium Webdriver' and @name='tool' and @id='tool-2'] ")).click();
		
		driver.findElement(By.xpath("//strong[contains ( text(), 'Link Test : New Page')]")).click();
	}
	
	@After
	
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
		
	}

}
