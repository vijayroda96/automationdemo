package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	WebDriver driver;
	@BeforeTest
	public void dropdowncheck() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
		  driver =new ChromeDriver();
		//  driver.manage().window().maximize();
		  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}
	@Test
	public void selectoption() {
		Select dropdwn= new Select(driver.findElement(By.className("custom-select")));
		dropdwn.selectByValue("6");
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
