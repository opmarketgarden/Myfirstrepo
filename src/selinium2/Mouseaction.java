package selinium2;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Mouseaction {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver\\chromedriver.exe" );
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://www.oyorooms.com/");
	Actions act = new Actions(driver);
	WebElement d = driver.findElement(By.xpath("//h2[contains(text(),'Chennai')]"));
	WebElement e =driver.findElement(By.xpath("//a[contains(text(),'Ecr East Coast Road')]"));
	act.moveToElement(d).click(e).build().perform();
	
	
	TakesScreenshot ts = ((TakesScreenshot)driver);
	ts.getScreenshotAs(OutputType.FILE);
	File dest= new  File("C:\\Users\\91994\\eclipse-workspace\\sellinium\\src\\selinium2\\screenshot");
	
	
}
	
}


