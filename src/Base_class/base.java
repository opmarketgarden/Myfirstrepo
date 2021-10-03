package Base_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class base {
	
   static WebDriver driver;
   static JavascriptExecutor js; 

   public static void Browserlaunch(String name) {
   
	if(name.equalsIgnoreCase("chrome"))
	{	
     System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver\\chromedriver.exe");
     driver = new ChromeDriver();   
	}
}
  
public static void webpage(String webpage1){
		
	driver.get(webpage1);	
	}
   
   public static void navigateto(String webpage) {
		
		driver.navigate().to(webpage);
	}
   public static  void Dropdown( WebElement element,String text) {
	  
	   Select s = new Select(element);
       s.selectByVisibleText("text");    
   }
   public static String geturl() {
	   String url = driver.getCurrentUrl();
	   return(url);
   }
   public static void title() {
	String title = driver.getTitle();
    System.out.println(title);     
   }
   public static String windowid() {
	String currentid =driver.getWindowHandle();
	return(currentid);
   }
   public static void Action(WebElement name,WebElement name1,String action)  {
	   Actions a = new Actions(driver);
	   
	   if(action.equalsIgnoreCase("click")) {	   
	   a.click(name).perform();
	   }
	   else if(action.equalsIgnoreCase("rightclick")) {
	   a.contextClick(name).perform();	   
	   }
	   else if(action.equalsIgnoreCase("clickhold")) {
	   a.clickAndHold(name).perform();	   
	   }
	   else if(action.equalsIgnoreCase("doubleclick")) {
	   a.doubleClick(name).perform();	   
	   }
	   else if(action.equalsIgnoreCase("dragdrop")) {
	   a.dragAndDrop(name,name1).perform();
	   }
 }
   public static WebElement FE(String path) {
   return driver.findElement(By.xpath(path));
   }
   public static void close(String id) {
	   driver.switchTo().window("id").close();
   }
   public static void quit() {
	   driver.quit();
   }
   public static void iframes(String xpath) {
	   driver.switchTo().frame(xpath);
   }
   
 public static void Webop(WebElement h1,String ope) {
	
	 js = (JavascriptExecutor) driver;
	  
	 if(ope.equalsIgnoreCase("click")) {
     		 
		 js.executeScript("aruguments[0].click();",h1);
	 }
	
 }

}
