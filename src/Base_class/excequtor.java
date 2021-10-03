package Base_class;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class excequtor extends base {
	
	public static void main(String[] args) throws InterruptedException {
		
        Browserlaunch("chrome");
		webpage("http://automationpractice.com/index.php");
		title();
		navigateto("https://twitter.com/");
		windowid();
		windowid();
		Thread.sleep(5000);
		WebElement one=FE("//span[contains(text(),'Sign up')]");
		//one.click();
		Webop(one,"click");
		
				
	}

}
