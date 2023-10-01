package ChildBrowserPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenMultipleTabsSwitchIndividuallyandCloseAllTabs 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{

		{
 
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.selenium.dev");  
            Thread.sleep(2000);
            WebElement ele1 = driver.findElement(By.xpath("//span[. = 'Downloads']"));
            WebElement ele2 = driver.findElement(By.xpath("//span[. = 'Documentation']"));
            WebElement ele3 = driver.findElement(By.xpath("//span[. = 'Projects']"));
            WebElement ele4 = driver.findElement(By.xpath("//span[. = 'Support']"));
            
            ArrayList<WebElement> l = new ArrayList<WebElement>();
            l.add(ele1);
            l.add(ele2);
            l.add(ele3);
            l.add(ele4);
            
            Actions a = new Actions(driver);
            Robot r = new Robot();
            for(WebElement ele:l)
            {
            	a.contextClick(ele).perform();
            	Thread.sleep(1000);
            	r.keyPress(KeyEvent.VK_T);
            	r.keyRelease(KeyEvent.VK_T);
            	Thread.sleep(1000);
            }
            
            Set<String> all_id = driver.getWindowHandles();
            for(String id:all_id)
            {
            	Thread.sleep(1000);
            	driver.switchTo().window(id);
            	System.out.println(driver.getTitle());
            	Thread.sleep(1000);
            	driver.close();
            }           
		}
	}
}
