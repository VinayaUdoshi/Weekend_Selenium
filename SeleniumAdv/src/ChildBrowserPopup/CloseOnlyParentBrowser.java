package ChildBrowserPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseOnlyParentBrowser
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
            
            String p_id = driver.getWindowHandle(); //p_id
            Set<String> all_id = driver.getWindowHandles(); //p_id and c_id
            
            for(String id : all_id)
            {
            	if(id.equals(p_id))
            			{
            		driver.close();
            			}
            }
		}
	}
}
