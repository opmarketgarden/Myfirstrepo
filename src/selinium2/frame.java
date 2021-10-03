package selinium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class frame{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//iframe[@src='/howto/tryhow_css_sidenav_ifr.htm']"));
		driver.switchTo().frame(e);
		driver.getTitle().getClass();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='sidenav']/a[2]")).getClass().getName();
		driver.findElement(By.xpath("//div[@class='sidenav']/a[2]")).click();
		//driver.findElement(By.xpath("a[contains(text(),'About')")).click();
		
	}
}