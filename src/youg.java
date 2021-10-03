import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class youg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*DesiredCapabilities cap = new DesiredCapabilities().chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        cap.setCapability(ChromeOptions.CAPABILITY,options);*/
        driver.get("https://www.youtube.com");
        driver.findElement(By.xpath("//*[contains(text(),'Sign in') and local-name()='yt-formatted-string']")).click();
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("murugu1957murugu1957");
	    driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();
	}

}
