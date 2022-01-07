package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class search {
	WebDriver driver;
	@BeforeTest
	public void openpage() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Chrom data\\\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		System.out.println("The Browssser is opened");
	}
	@Test (priority=1)
	public void serachitem() {
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Hangama Best Scenes");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		System.out.println("Searched item");
	}
	
	

}
