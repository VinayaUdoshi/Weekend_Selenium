package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertandConfirmationPopup 
{
	public static void main(String[] args) throws InterruptedException
	{

		{

			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://demo.guru99.com/test/delete_customer.php");  
            Thread.sleep(3000);
            driver.findElement(By.name("cusid")).sendKeys("admin");
            driver.findElement(By.name("submit")).click();
            Thread.sleep(3000);
            Alert a = driver.switchTo().alert();
            a.accept();
		}
	}
}
