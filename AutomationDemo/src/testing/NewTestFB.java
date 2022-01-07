package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestFB {
	WebDriver driver;
  @Test
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
		System.out.println("Url Opened");
		
		WebElement contact=driver.findElement(By.xpath("//a[text()='Contact']"));
		driver.getWindowHandle();
		contact.click();
		System.out.println("Clicked on Contact");
		
class Filltheform{
	@Test
	public void filltheform() throws InterruptedException {
		WebElement name=driver.findElement(By.id("fname"));
		name.click();name.sendKeys("Boss");
		Thread.sleep(2000);
		
	}
	
} 

	
  }
}
