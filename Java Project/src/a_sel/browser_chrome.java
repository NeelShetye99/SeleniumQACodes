package a_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class browser_chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("From Selenium");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("NeelShetye@99");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("UserFirstName")).sendKeys("First Name");
		Thread.sleep(2000);
		
		
		//driver.findElement(By.linkText("Legal")).click();
		//driver.findElement(By.partialLinkText("Responsible")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Shetye");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("Manyy");
		Thread.sleep(2000);
		
		//driver.findElement(By.partialLinkText("All Rights Reserved")).click();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(2000);
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.manage().window().maximize();
		
		//Select jobtitle=new Select(driver.findElement(By.name("UserTitle")));
		

		
		//WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		//username.clear();
		//Thread.sleep(1000);
		//username.sendKeys("From webelement");
		driver.close();
		//driver.get("https://login.salesforce.com/");
	}

}
