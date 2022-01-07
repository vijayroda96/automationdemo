package testing;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class newpukale {
		
	 WebDriver driver;
	  @BeforeTest
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver","E:\\Selenium Chrom data\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.get("https://www.fortunecloudindia.com/");
		  driver.manage().window().maximize();
	  }
	  @Test(priority = 1,enabled = true)
	  public void openContact() {
		  
		  driver.findElement(By.xpath("//A[@href='contact.html'][text()='Contact']")).click();
		  
	  }
	  @Test(priority = 2,enabled = true)
	  public void fillName() throws InterruptedException {
		  driver.findElement(By.xpath("//input[@id='fname']/self::input")).sendKeys("Boss");
		  Thread.sleep(2000);
	  }
	  @Test(priority = 3,enabled = true)
	  public void fillEmail() throws InterruptedException {
		  driver.findElement(By.xpath("//INPUT[@id='email']")).sendKeys("boss@gmail.com");
		  Thread.sleep(2000);
	  }
	  @Test(priority = 4,enabled = true)
	  public void fillContact() throws InterruptedException {
		  driver.findElement(By.xpath("//INPUT[@id='tele']/self::INPUT")).sendKeys("1234567890");
		  Thread.sleep(2000);
	  }
	  @Test(priority = 5,enabled = true)
	  public void fillMessage() throws InterruptedException {
		  driver.findElement(By.xpath("//TEXTAREA[@id='subject']/self::TEXTAREA")).sendKeys("Hello FortuneCloud");
		  Thread.sleep(2000);
	  }
	  @Test(priority = 6,enabled = true)
	  public void submitButton() {
		  driver.findElement(By.xpath("//BUTTON[@id='submit']/self::BUTTON")).click();
	  }

	  @AfterTest
	  public void browserClose() {
		  driver.quit();
	  }

	}


