package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Fb1 {
	
	WebDriver driver;
  @Test
  public void fing() {
	  WebElement userid=driver.findElement(By.id("email"));
		userid.click();
		userid.sendKeys("Sfzfxm@qhgcmj.com");
	
		
		
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.click();
		pass.sendKeys("54654651");
		
		
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
  }
  @BeforeTest
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
  }

  @AfterTest
  public void afterMethod() {
	  driver.close();
	  
  }

}
