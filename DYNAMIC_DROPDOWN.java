package DROPDOWNS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DYNAMIC_DROPDOWN {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver","D:\\kcsm12\\automation1\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		   Thread.sleep(1000);
	          element.sendKeys("mobiles");
	          Thread.sleep(1000);
	          element.sendKeys(Keys.DOWN);
	          Thread.sleep(1000);
	          element.sendKeys(Keys.ENTER);
	          Thread.sleep(1000);
	          driver.get("https://www.google.com");
	          Thread.sleep(1000);
	          driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("qspiders");
	          Thread.sleep(1000);
	           List<WebElement> alloptions=driver.findElements(By.xpath("//body[@jsmodel='hspDDf ']"));// this xpathis the full page dynamicelements  purpose
	           Thread.sleep(1000);
              System.out.println(alloptions.size());
              driver.close();
	}

}
