package a_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action_Demo_w {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement move = driver.findElement(By.xpath("//*[@id='nav-link-prime']/span[1]"));
		
		act.moveToElement(move).build().perform();
	
		
		Thread.sleep(2000);
		WebElement txtbox = driver.findElement(By.xpath("//input[@id='twotabsearchtxtbox']"));
		
		act.moveToElement(txtbox).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		Thread.sleep(2000);
		act.moveToElement(txtbox).doubleClick().build().perform();
		Thread.sleep(2000);
	
		
		driver.close();
		
		
		}

}
