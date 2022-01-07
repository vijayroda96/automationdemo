package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class yearofexandautotools {
	WebDriver driver;
	@BeforeTest
	public void yearandtool() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
		  driver =new ChromeDriver();
		//  driver.manage().window().maximize();
		  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}
	@Test
	public void yearofexperience() {
		driver.findElement(By.xpath("//lable[@for='1year']")).click();
		//driver.findElement(By.id("1year")).click();
	}
	@Test
	public void autotools() {
		driver.findElement(By.xpath("//label[@for='selenium']")).click();
		driver.findElement(By.xpath("//label[@for='testng']")).click();
		driver.findElement(By.xpath("//label[@for='cucumber']")).click();
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
