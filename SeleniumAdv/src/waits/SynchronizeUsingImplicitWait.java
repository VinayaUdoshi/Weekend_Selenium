package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SynchronizeUsingImplicitWait
{
		public static void main(String[] args) throws InterruptedException

		{
 
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.get("https://www.facebook.com");
            driver.findElement(By.id("email")).sendKeys("abc");
            driver.findElement(By.id("pass")).sendKeys("123");
            driver.findElement(By.name("login")).click();
		}
}

