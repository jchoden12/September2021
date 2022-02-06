package session2HomeWork;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorHomeWork {
	
	
	WebDriver driver;
	
	@Before
	public void init() {

	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");	
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://techfios.com/billing/?ng=login/");
	
		
	}
	
	@Test	
	public void getElement() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.findElement(By.xpath("//span[text()='Bank & Cash']")).click();
		driver.findElement(By.xpath("//a[text()='New Account']")).click();
		driver.findElement(By.cssSelector("input#account")).sendKeys("Saving");
		driver.findElement(By.cssSelector("input#description")).sendKeys("AccountBalance");
		driver.findElement(By.cssSelector("input#balance")).sendKeys("25000");
		driver.findElement(By.cssSelector("input#account_number")).sendKeys("1121212");
		driver.findElement(By.cssSelector("input#contact_person")).sendKeys("Tserrano");
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("4217561125");
		driver.findElement(By.xpath("//input[@id='ib_url' and @name='ib_url']")).sendKeys("Saving@chase.com");
		driver.findElement(By.xpath("//button[@class='btn btn-primary'and@type='submit']")).click();
		
	
		
	}
	
	public void tearDown() {
//	 driver.close();
//	 driver.quit();
	
		
	}

}
