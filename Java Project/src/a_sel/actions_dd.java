package a_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_dd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")); 
		WebElement trgt = driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement droptext = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		act.doubleClick(droptext).build().perform();
		Thread.sleep(2000);
		
		act.dragAndDrop(src, trgt).build().perform();
		Thread.sleep(2000);
		
		act.contextClick(src).build().perform();
		Thread.sleep(2000);
		
		System.out.println("Program Over");
		Thread.sleep(3000);
		driver.close();
		
	}

}
