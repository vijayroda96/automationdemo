package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class insta {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		Thread.sleep(1000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.click();
		username.sendKeys("880515000131");
		
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.click();
		pass.sendKeys("JKGsad54");
		
		Thread.sleep(1000);
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		
		driver.close();
	}
}
