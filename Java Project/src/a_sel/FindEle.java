package a_sel;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


   public class FindEle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		List<WebElement> objLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement objCurrentLink : objLinks) {
			
			String strLinkTest = objCurrentLink.getText();
			
			
			 System.out.println(strLinkTest);
		
	}
		
		
		driver.close();
		

	}

}
 
