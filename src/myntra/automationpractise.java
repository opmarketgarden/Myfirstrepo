package myntra;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class automationpractise {
 public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    //options.addArguments("start-maximized");
    //options.addArguments("--diableinfobar");
    
    driver.manage().window().maximize();
    //driver.manage().wait(2, nanos);
    driver.get("http://automationpractice.com/index.php");
    Actions a = new Actions(driver);
    Robot r = new Robot();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    
    WebElement sigin = driver.findElement(By.xpath("//a[@class='login']"));
    js.executeScript("arguments[0].scrollintoview",sigin);
    //js.executeAsyncScript("arguments[0].click()",email);
    sigin.click();
    String s = driver.getWindowHandle();
    driver.switchTo().window(s);
    Thread.sleep(5000);
    
    WebElement women = driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
    a.moveToElement(women).perform();
    
    WebElement Tshirt = driver.findElement(By.xpath("//a[contains(text(),'Blouses')]"));
    js.executeScript("arguments[0].click",Tshirt);
    Tshirt.click();
    
    
    WebElement item1 = driver.findElement(By.xpath("//li[starts_with(@class='ajax_block_product')]"));
    a.moveToElement(item1).click();
    js.executeScript("arguments[0].click",item1);
    
    WebElement cart_btn = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
    js.executeScript("arguments[0].click",cart_btn);

     
    
 }
}
