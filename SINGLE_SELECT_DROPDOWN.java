package DROPDOWNS;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SINGLE_SELECT_DROPDOWN {

	public static void main(String[] args) throws Throwable {
	         System.setProperty("webdriver.gecko.driver","D:\\kcsm12\\automation1\\drivers\\geckodriver.exe");
	         FirefoxDriver driver=new FirefoxDriver();
	         driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	         driver.manage().window().maximize();
                Thread.sleep(1000);
	  WebElement element=driver.findElement(By.xpath("//select[@id='course']"));
	  
               Select sel=new Select(element);
               List<WebElement> elements=sel.getOptions();
              for (WebElement options:elements)
            		 {
            	   System.out.println(options.getText());
               }
               
               
               Thread.sleep(1000);
              sel.selectByIndex(1);
               Thread.sleep(1000);
               sel.selectByValue("net");   
               Thread.sleep(1000);
               sel.selectByVisibleText("Javascript");
               
      String selecttext=sel.getFirstSelectedOption().getText();
         System.out.println(selecttext);        
                 
          
	}
 
}
