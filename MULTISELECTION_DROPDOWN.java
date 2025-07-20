package DROPDOWNS;

import java.util.List;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MULTISELECTION_DROPDOWN {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\kcsm12\\automation1\\drivers\\geckodriver.exe");
		      FirefoxDriver driver= new FirefoxDriver();
		      driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		      driver.manage().window().maximize();
		      Thread.sleep(1000);
		     WebElement element= driver.findElement(By.xpath("//select[@id='ide']"));
		           Select sel=new Select(element);
	          List<WebElement> elements=sel.getOptions(); 
                for(WebElement options:elements)
               {
    	           System.out.println(options.getText());
                 }
		           sel.selectByIndex(0);
		          Thread.sleep(1000);
		         sel.selectByValue("ij");
		            Thread.sleep(2000);
		      sel.selectByVisibleText("NetBeans");
		          Thread.sleep(2000);
		          
           List<WebElement> selectedoptions=sel.getAllSelectedOptions();
             Thread.sleep(2000);
           for(WebElement selectedoption:selectedoptions){
	             Thread.sleep(2000);
	         System.out.println(selectedoption.getText()); 
	      }}}


