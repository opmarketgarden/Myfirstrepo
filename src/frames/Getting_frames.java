package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getting_frames{

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.hdfcbank.com/nri-banking");
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    Thread.sleep(6000);
    List<WebElement> i = driver.findElements(By.tagName("iframe"));
    for (WebElement Element : i) {
    	System.out.println(Element.getText());
		
	}
   
    
}



}
