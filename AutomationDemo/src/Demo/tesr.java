package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tesr {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	WebElement userid=driver.findElement(By.id("email"));
	userid.click();
	userid.sendKeys("Sfzfxm@qhgcmj.com");
	Thread.sleep(1000);
	
	
	
	WebElement pass = driver.findElement(By.name("pass"));
	pass.click();
	pass.sendKeys("54654651");
	Thread.sleep(1000);
	
	
	WebElement login=driver.findElement(By.name("login"));
	//login.click();
	Thread.sleep(5000);
	
	if(login.isDisplayed())
	{
		login.click();
		System.out.println("Login Button is present");
	}
	
	
	//WebElement createpage=driver.findElement(By.xpath("//a[text()='Create a Page']"));
	//createpage.click();
	//Thread.sleep(1000);
	
	driver.close();
	Thread.sleep(2000);
	
	
	}

}
