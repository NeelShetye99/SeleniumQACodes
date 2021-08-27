package a_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumDrivers\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.com/");   
	}

}
