package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb {
	WebDriver driver;
	@Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement userid=driver.findElement(By.id("email"));
		userid.click();
		userid.sendKeys("Sfzfxm@qhgcmj.com");
	
		
		
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.click();
		pass.sendKeys("54654651");
		
		
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		WebElement create=driver.findElement(By.xpath("//a[text()='Create a Page']"));
		create.click();
		
		WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgot.click();
  }
}
