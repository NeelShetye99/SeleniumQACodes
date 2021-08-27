package a_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Democlass {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webDriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver-v0.29.1-win32"\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://ebay.com");
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumDrivers\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("OnePlus6T");
		driver.findElement(By.cssSelector("#gh-btn")).click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
