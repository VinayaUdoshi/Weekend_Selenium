package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
	public static void main(String[] args) throws InterruptedException
	{

		{

			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");  
            Thread.sleep(3000);
            WebElement src = driver.findElement(By.id("box3"));
            WebElement dist = driver.findElement(By.id("box103"));
            Actions a = new Actions(driver);
            a.dragAndDrop(src, dist).perform();
		}
	}
}
