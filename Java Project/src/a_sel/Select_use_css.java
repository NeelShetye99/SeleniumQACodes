package a_sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_use_css {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().window().maximize();
		
		WebElement fte= driver.findElement(By.xpath("//ul[@id='menu-footer-menu']"));
		List<WebElement> all_elements =fte.findElements(By.tagName("a"));

		for(WebElement element:all_elements)
			System.out.println(element.getText());
		//driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		
		//driver.findElement(By.cssSelector("input[name='UserFirstName']")).sendKeys("Used CSS");
		//Thread.sleep(3000);
		
		//WebElement fte= driver.findElement(By.xpath("//ul[@id='menu-footer-menu']"));
		//List<WebElement> label_element = driver.findElements(By.tagName("footer"));
		//for(WebElement element:label_element)
			//System.out.println(element.getText());
		System.out.println("Lists of all the links in the page");

		
		driver.close();

	}

}
