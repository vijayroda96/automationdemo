package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class Staffing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Chrom data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
		
		WebElement movecursor=driver.findElement(By.xpath("//a[text()='Services']"));
		
		
		
		Actions move =new  Actions(driver);
		move.moveToElement(movecursor).perform();
		//movecursor.click();
		
		WebElement clickonStaffing = driver.findElement(By.xpath("//a[text()='Staffing & Recruitment']"));
		
		if(clickonStaffing.isDisplayed())
		{
		clickonStaffing.click();
		System.out.println("Clicked on Staffing and Recruitment");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
