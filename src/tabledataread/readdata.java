package tabledataread;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdata {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.worldometers.info/coronavirus/");
    driver.manage().window().maximize();
    List<WebElement> a= driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr/td/a[contains(text(),'India')]/ancestor::td/ancestor::tr"));
    List<WebElement> a1 = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr/td/a[contains(text(),'India')]/ancestor::td/following::td[@class='sorting_1' ]"));
	for (int j = 0; j <a1.size(); j++) {
	
		System.out.println(a1.get(j).getText());
	}
	}
	
}