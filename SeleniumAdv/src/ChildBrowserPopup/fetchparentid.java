package ChildBrowserPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchparentid 
{
	public static void main(String[] args) throws InterruptedException
	{

		{

			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.amazon.in/");  
            String p_id = driver.getWindowHandle();
            System.out.println(p_id);
		}
	}
}
