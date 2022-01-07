package automationpractice1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class autotest {
	WebDriver driver;
	Properties prop;
  @BeforeTest
  public void Open_page() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Chrom data\\\\chromedriver.exe");
	  driver = new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.manage().deleteAllCookies();
	  prop = new Properties();
	  FileInputStream fis = new FileInputStream("C:\\Users\\viju\\eclipse-workspace\\AutomationDemo\\src\\automationpractice1\\datadriven.properties");
	  prop.load(fis);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
  }
  @Test (priority=1)
  public void logintest() throws InterruptedException {
	  driver.get(prop.getProperty("url"));
	  Thread.sleep(2000);
	  driver.findElement(By.id("field1")).clear();
	  driver.findElement(By.id("field1")).sendKeys(prop.getProperty("name"));
	  driver.findElement(By.id("field2")).sendKeys(prop.getProperty("id"));
	  driver.findElement(By.xpath("//button[text()='Copy Text']")).click();
	  Thread.sleep(2000);
	 }
  @Test (priority=2,enabled = false)
  public void dragdrop() throws InterruptedException {
	  WebElement from =driver.findElement(By.id("draggable"));
	  WebElement to=driver.findElement(By.id("droppable"));
	  Actions actions = new Actions(driver);
	  actions.clickAndHold(from).dragAndDrop(from, to).perform();
	
  }
  @Test (priority=3)
  public void basicform() {
	  driver.findElement(By.id("RESULT_TextField-1")).sendKeys(prop.getProperty("FirstName"));
	  driver.findElement(By.id("RESULT_TextField-2")).sendKeys(prop.getProperty("LastName"));
	  driver.findElement(By.id("RESULT_TextField-3")).sendKeys(prop.getProperty("Phone"));
	  driver.findElement(By.id("RESULT_TextField-4")).sendKeys(prop.getProperty("Country"));
	  driver.findElement(By.id("RESULT_TextField-5")).sendKeys(prop.getProperty("City"));
	  driver.findElement(By.id("RESULT_TextField-6")).sendKeys(prop.getProperty("Email"));
	  driver.findElement(By.id("RESULT_RadioButton-7_0")).click();
  }
  @AfterTest
  public void close() {
	  driver.close();
  }
}
