package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollToParticularElement 
{
	public static void main(String[] args) throws InterruptedException
	{
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
			WebDriver driver = new FirefoxDriver();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
		    driver.get("https://www.amazon.com/"); 
		    
		    WebElement ele = driver.findElement(By.xpath("//span[ . = 'Headsets']"));
		    Thread.sleep(2000);
		    jse.executeScript("arguments[0].scrollIntoView();",ele);
		}
	}
}
