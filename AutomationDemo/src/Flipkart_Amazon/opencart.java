package Flipkart_Amazon;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class opencart {


	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private JavascriptExecutor js;

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Chrom data\\\\chromedriver.exe");
	    driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    js = (JavascriptExecutor) driver;
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("https://demo.opencart.com/");
	    driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div/div/a/img")).click();
	    driver.findElement(By.id("button-cart")).click();
	    driver.findElement(By.id("cart-total")).click();
	    driver.findElement(By.id("cart-total")).click();
	    driver.findElement(By.id("cart-total")).click();
	    driver.findElement(By.xpath("//div[@id='cart']/ul/li[2]/div/p/a/strong/i")).click();
	    driver.findElement(By.xpath("//div[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]")).click();
	    driver.findElement(By.xpath("//div[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}


