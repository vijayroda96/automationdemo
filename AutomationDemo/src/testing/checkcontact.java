package testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class checkcontact {
	WebDriver driver;
	  @Test(priority=0)
	  public void openurl() {
		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.fortunecloudindia.com/");
			System.out.println("Url Opened");
			
			WebElement contact=driver.findElement(By.xpath("//a[text()='Contact']"));
			driver.getWindowHandle();
			contact.click();
			System.out.println("Clicked on Contact");
			driver.manage().window().maximize();
		}
	  @Test(priority=1)
		public void fillname() throws InterruptedException {
		  WebElement name=driver.findElement(By.id("fname"));
		  Actions move= new Actions(driver);
		  move.moveToElement(name);
		  move.perform();
		  name.click();
		  name.sendKeys("Boss");
		  Thread.sleep(1000);
		  System.out.println("Typed Boss");
		}
	  @Test(priority=2)
	  public void fillemail() {
	  WebElement email=driver.findElement(By.id("email"));
	  email.click();email.sendKeys("Boss235@gmail.com");
	  System.out.println("Typed Mail");
	  }
	  @Test(priority=3)
	  public void fillphoneno() {
	  WebElement phoneno=driver.findElement(By.id("tele"));
	  phoneno.click();phoneno.sendKeys("88888778787");
	  System.out.println("Typed Phone No");
	  }
	  
	  @Test(priority=4)
	  public void fillmessage() {
	  WebElement message=driver.findElement(By.xpath("//textarea[@name='subject']"));
//	  message.click();
//	  message.sendKeys("Hi This is only a Test on Your Site");
		  
		
		message.click();message.sendKeys("THis is message");
	  
	  }
	  @Test(priority=5)
	  public void closedriver() {
	  driver.close();
	  System.out.println("Driver closed Succsefully");
	  }
}
