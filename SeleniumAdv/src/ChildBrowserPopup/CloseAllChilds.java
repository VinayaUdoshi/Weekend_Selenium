package ChildBrowserPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAllChilds 
{
	public static void main(String[] args) throws InterruptedException
	{

		{
 
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://skpatro.github.io/demo/links/");  
            Thread.sleep(2000);
            driver.findElement(By.name("NewWindow")).click();
            Thread.sleep(2000);
            String p_id = driver.getWindowHandle();
            Set<String> all_id = driver.getWindowHandles();
            all_id.remove(p_id);
            for(String id:all_id)
            {
            	driver.switchTo().window(id);
            	driver.close();
            }
            
		}
	}
	
}
