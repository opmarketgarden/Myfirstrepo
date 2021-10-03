package selinium2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
    WebElement day = driver.findElement(By.id("select-demo"));
    Select s = new Select(day);
    s.selectByVisibleText("Monday");
    WebElement multi = driver.findElement(By.id("multi-select"));
    Select s1 = new Select(multi);
    s1.selectByValue("Florida");
    s1.selectByIndex(6);
    s1.selectByVisibleText("Florida");
    
    WebElement f = driver.findElement(By.xpath("//select[@id='multi-select']//child::option[@value='California']//following-sibling::option[@value='Pennsylvania']"));
    System.out.println(f.isSelected());
    
    //s.deselectByIndex(1);
    s1.deselectAll();
    s1.selectByVisibleText("Florida");
    List<WebElement> g = driver.findElements(By.xpath("//select[@id='multi-select']"));
    List<WebElement> allop =s1.getOptions();
    for(WebElement o:allop)
    {
    	System.out.println(o.getText());
    }
    List<WebElement> a=s.getOptions();
    for(WebElement o:a)
    {
    	System.out.println(o.getText());
    }
    List<WebElement> b=s.getAllSelectedOptions();
    for(WebElement o:b)
    {
    	System.out.println(o.getText());
    }driver.close();
}
}