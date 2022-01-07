package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class inputfile {
	WebDriver driver;
	@BeforeTest
	public void inputfilesite() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
		  driver =new ChromeDriver();
		//  driver.manage().window().maximize();
		  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}
	@Test
	public void clickonbox() {
		driver.findElement(By.id("inputGroupFile02")).sendKeys("C:\\Users\\viju\\Desktop\\Annotations of TestNG.txt");
		driver.findElement(By.xpath("//span[text()='Upload']")).click();
		
	}
	@Test
	public void upload() {
		driver.findElement(By.xpath("//span[text()='Upload']")).click();
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
