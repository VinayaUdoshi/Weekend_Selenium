package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver
{
	public static void main(String[] args)
	{

		{

			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.flipkart.com/");  
            driver.findElement(By.xpath("//button[. ='✕']")).click();
            WebElement ele = driver.findElement(By.xpath("//img[@alt ='Fashion']"));
            Actions a = new Actions(driver);
            a.moveToElement(ele).perform();

          }
	}
}

