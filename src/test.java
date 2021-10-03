import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver1\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://omayo.blogspot.com/");
    List<WebElement> s =driver.findElements(By.xpath("//div[@id='HTML25']"));
    for (int i = 0; i < args.length; i++) {
	System.out.println(s.get(i).getText());
	
	}
}
}
