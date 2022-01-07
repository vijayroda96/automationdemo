package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest {
	WebDriver driver;
	
	@BeforeTest
	public void openurl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://lms.fortunecloudindia.com/index/");
		
	}
	@Test  (priority = 1)
	public void enteruser() throws InterruptedException{
		WebElement enteruser =driver.findElement(By.id("id_username"));
		enteruser.click();
		enteruser.sendKeys("paniket281@gmail.com");
		System.out.println("User name Enterd");
		//Thread.sleep(2000);
	
	}
	@Test  (priority = 2)
	public void enterpass() {
		WebElement enterpass =driver.findElement(By.xpath("//input[@id='id_password']"));
		enterpass.click();
		enterpass.sendKeys("paniket281@gmail.com");
		System.out.println("Password Enterd");
	}
	@Test  (priority = 3)
	public void clickonlogin() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
	}
	@AfterTest
	public void closedriver() {
		driver.close();
	}
}
