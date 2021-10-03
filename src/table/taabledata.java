package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taabledata {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\eclipse-workspace\\sellinium\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.w3schools.com/html/html_tables.asp");
    List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
    System.out.println("the size is"+alldata.size()); 
    System.out.println("====alldata====");
    for (WebElement data : alldata)
    {
    	
    	System.out.println(data.getText());
	
	}
    List<WebElement> heading = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
    System.out.println("====heading======");
    for (WebElement Element : heading)
    {
		
    	System.out.println(Element.getText());
	}
 List<WebElement> coloumn2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
 System.out.println("===coloumn2===");  
 System.out.println(coloumn2.size());
 for (WebElement Element : coloumn2) {
	 System.out.println(Element.getText());
	
}
 List<WebElement> row5 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]"));
 System.out.println("===row5===");
 System.out.println(row5.size());
 for (WebElement Element : row5) {
System.out.println(Element.getText());	
}
}
}
