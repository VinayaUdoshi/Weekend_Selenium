package ActionsClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotC
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{

		{

			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.facebook.com/");  
            Thread.sleep(3000);
            WebElement ele = driver.findElement(By.xpath("//a[. = 'Forgotten password?']"));
            Actions a = new Actions(driver);
            a.contextClick(ele).perform();
            Thread.sleep(3000);
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_RIGHT);
            r.keyRelease(KeyEvent.VK_RIGHT);
            Thread.sleep(3000);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(3000);                    
		}
	}
}
