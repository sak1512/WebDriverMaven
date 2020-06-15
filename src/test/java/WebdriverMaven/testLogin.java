package WebdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class testLogin {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.gecko.driver","C:\\MUKUL\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
		@Test
		public void dologin() {
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("sakshilumba@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		//driver.findElement(By.name("password")).sendKeys("asdf");
		//driver.findElement(By.id("passwordNext")).click();
		
		}
	
		
	@AfterSuite
	public void teardown() {
		/*
		 * checking the changes in Jenkins latest2
		 */
		
		driver.quit();
	}
	
	

	}


