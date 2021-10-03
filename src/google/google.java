package google;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selinium");
	Thread.sleep(4000);
	List<WebElement> e = driver.findElements(By.xpath("//div[@class='sbtc']"));
	System.out.println(e.size());
    System.out.println( e.get(0).getText());
    for (int i = 0; i <e.size() ; i++)
    {
    	
		System.out.println(e.get(i).getText());
		 
		   if(e.get(i).getText().equals("selenium webdriver") )
		   {
			e.get(i).click();
			break;
	     	}
    }
   // driver.close();
    }
   	}

