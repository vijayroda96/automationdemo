package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class azurewebsite {
	WebDriver driver;
  @BeforeSuite
  public void Opensite() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
	  driver =new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	  System.out.println("Site is opened");
	 }
  @Test(priority=1)
  public void entername() {
	  driver.findElement(By.id("name")).click();
	  driver.findElement(By.id("name")).sendKeys("Boss");
	  }
  @Test(priority=2)
  public void enterphone() {
	  driver.findElement(By.id("phone")).click();
	  driver.findElement(By.id("phone")).sendKeys("546541");
	  }
  @Test(priority=3)
  public void enteremail() {
	  driver.findElement(By.id("email")).click();
	  driver.findElement(By.id("email")).sendKeys("wkygdkweugd@aygmail.com");
  }
  @Test(priority=4)
  public void enterpass() {
	  driver.findElement(By.id("password")).click();
	  driver.findElement(By.id("password")).sendKeys("5464+464613");
  }
  @Test(priority=5)
  public void enteradd() {
	  driver.findElement(By.id("address")).click();
	  driver.findElement(By.id("address")).sendKeys("agdsnfbvmvj");
  }
  @Test(priority=6)
  public void submit() {
	  driver.findElement(By.name("submit")).click();
  }
  @AfterSuite
  public void closedriver() {
	  driver.close();
  }
}
