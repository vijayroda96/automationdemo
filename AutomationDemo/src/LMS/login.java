package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
	@Test
	public void openurl(){
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Chrom data\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://lms.fortunecloudindia.com/index/");
		System.out.println("The Page URL is Opened");
	}
	@Test
	public void verifyloginvisibleornot() {
		boolean isDisplayed =driver.findElement(By.xpath("//*[@id=\"id_username\"]")).isDisplayed();
		boolean isEnabled =driver.findElement(By.xpath("//*[@id=\"id_username\"]")).isEnabled();
		
		if(isDisplayed){
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is Not Present");
		}
	
	}
	@Test
	public void verifypasswordvisibleornot() {
		boolean isDisplayed =driver.findElement(By.xpath("//*[@id=\"id_password\"]")).isDisplayed();
		boolean isEnabled =driver.findElement(By.xpath("//*[@id=\"id_password\"]")).isEnabled();
		
		if(isDisplayed){
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is Not Present");
		}
		

	}
	
}

	


