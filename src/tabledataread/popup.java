package tabledataread;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class popup {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.axisbank.com/");
	Thread.sleep(2000);
	Set<String> windowhandles = driver.getWindowHandles();
	for (String string : windowhandles) {
	System.out.println(string);
	driver.switchTo().window(string);
	}
}
}