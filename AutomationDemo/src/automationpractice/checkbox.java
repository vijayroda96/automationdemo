package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checkbox {
		WebDriver driver;
		  @BeforeTest 
		  public void gendercheck(){
			  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
			  driver =new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://itera-qa.azurewebsites.net/home/automation");
			  System.out.println("Site is opened");
			 }
		  @Test
		  public void gendercheckmale() {
			  driver.findElement(By.id("male")).click();
			  
		  }
		  @Test
		  public void daycheck() {
			  driver.findElement(By.id("monday")).click();
			  driver.findElement(By.id("friday")).click();
			  driver.findElement(By.id("sunday")).click();
		  }
		  @AfterTest
			public void close() {
				driver.close();
		  }
}

