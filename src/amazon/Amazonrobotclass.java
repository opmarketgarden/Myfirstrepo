package amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonrobotclass {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		Robot r = new Robot();
		
        WebElement Best_Seller =  driver.findElement(By.xpath("//a[contains(text(),'Best Seller')]"));
        a.contextClick(Best_Seller).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        
        WebElement Mobiles = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
        a.contextClick(Mobiles).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        

        WebElement Todays_deal = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
        a.contextClick(Todays_deal).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        
     // WebElement signin = driver.findElement(By.xpath("//div[@class='nav-line-1-container']//following-sibling::/span[contains(text(),'Hello, Sign in')]"));
        WebElement signin = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
        a.contextClick(signin).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);    
        r.keyPress(KeyEvent.VK_ENTER);
        
        String parentId = driver.getWindowHandle();
        System.out.println(parentId);
        driver.switchTo().window(parentId).getTitle();
        
        
        Set<String>Allid  = driver.getWindowHandles();	
	    for (String ID : Allid) 
	    {
			
	    	String title=(driver.switchTo().window(ID).getTitle());
	    if(title.equals("Amazon Sign In"))
	    {
	    	String o = driver.switchTo().window(ID).getTitle();
	    	System.out.println(o);
	    	break;
	    }
	    
	    }
	    
	
	}

}
