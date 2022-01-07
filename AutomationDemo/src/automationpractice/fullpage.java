package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class fullpage {
	WebDriver driver;
	  @BeforeSuite
	  public void Opensite() {
		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
		  driver =new ChromeDriver();
		  //driver.manage().window().maximize();
		  driver.get("https://itera-qa.azurewebsites.net/home/automation");
		  System.out.println("Site is opened");
		 }
	  @Test
	  public void enterdetails() {
		  driver.findElement(By.id("name")).click();
		  driver.findElement(By.id("name")).sendKeys("Boss");
		  driver.findElement(By.id("phone")).click();
		  driver.findElement(By.id("phone")).sendKeys("546541");
		  driver.findElement(By.id("email")).click();
		  driver.findElement(By.id("email")).sendKeys("wkygdkweugd@aygmail.com");
		  driver.findElement(By.id("password")).click();
		  driver.findElement(By.id("password")).sendKeys("5464+464613");
		  driver.findElement(By.id("address")).click();
		  driver.findElement(By.id("address")).sendKeys("agdsnfbvmvj");
		  
		  }
	  @Test
	  public void checkbox() {
		  driver.findElement(By.id("male")).click();
		  driver.findElement(By.id("monday")).click();
		  driver.findElement(By.id("friday")).click();
		  driver.findElement(By.id("sunday")).click();
	  }
	  @Test
	  public void dropdown() {
		  Select dropdwn= new Select(driver.findElement(By.className("custom-select")));
			dropdwn.selectByValue("6");
	  }
	  @Test
	  public void yearandauto() {
			  driver.findElement(By.xpath("//label[@for='1year']")).click();
			  driver.findElement(By.xpath("//label[@for='selenium']")).click();
				driver.findElement(By.xpath("//label[@for='testng']")).click();
				driver.findElement(By.xpath("//label[@for='cucumber']")).click();
	  }
	  @Test
	  public void inputfile() {
		  driver.findElement(By.id("inputGroupFile02")).sendKeys("C:\\Users\\viju\\Desktop\\Annotations of TestNG.txt");
			driver.findElement(By.xpath("//span[text()='Upload']")).click();
			driver.findElement(By.xpath("//span[text()='Upload']")).click();
	  }
	  @AfterTest
	  public void submit() {
		  driver.findElement(By.name("submit")).click();
	  }
	  @AfterSuite()
	  public void close() {
			  driver.close();
		  }
	  
}

