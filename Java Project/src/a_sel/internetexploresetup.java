package a_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetexploresetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","C:\\SeleniumDrivers\\IEDriverServer_Win32_3.150.2\\iedriver.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		
		
		

	}

}
