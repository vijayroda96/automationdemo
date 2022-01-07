package automationpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class drag {
	WebDriver driver;
	@BeforeTest
	public void openpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		
		
	}
	@Test
	public void move() throws InterruptedException {
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		Actions act =new Actions(driver);
		act.clickAndHold(from).dragAndDrop(from, to).perform();
		Thread.sleep(5000);
	}

}
