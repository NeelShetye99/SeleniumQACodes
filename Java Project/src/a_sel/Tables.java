package a_sel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		// System.out.println("Row details :"+noofrows);
		System.out.println("no of rows :" + allrows.size());
		int i = 0;
		for (WebElement element : allrows) {
			// finding number of columns
			List<WebElement> eachcolumn = element.findElements(By.tagName("td"));
			i++;
			System.out.println("no of columns in " + i + " row are:" + eachcolumn.size());
			for (WebElement column : eachcolumn) {
				System.out.print(" | " + column.getText());
			}
			System.out.println(" ");
		}

		
		
		}

}
