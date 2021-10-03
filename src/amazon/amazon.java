package amazon;
//s
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class amazon {
	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement searchbar=driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("phone under 7000"+Keys.ENTER);
		
		List<WebElement> e = driver.findElements(By.xpath("//span[@class='a-price a-text-price']//following-sibling::span[@class='a-price a-text-price']"));
		List<Integer> e1 = new ArrayList<Integer>();
		
		System.out.println(e.size());
		//System.out.println(e.get(5).getText();
	
		for (int i = 0; i <e.size(); i++) 
		{   
		String s =(e.get(i).getText());
		System.out.println(s);
		}
		WebElement prime= driver.findElement(By.xpath("//i[@aria-label='Prime Eligible']"));
		
		
		WebElement minp= driver.findElement(By.xpath("//input[@id='low-price']"));
		Thread.sleep(6000);
		minp.sendKeys("5000");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.mousePress(MouseEvent.MOUSE_PRESSED);
		}
	
		}
