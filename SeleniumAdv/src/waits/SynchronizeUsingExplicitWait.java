package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizeUsingExplicitWait 
{
	public static void main(String[] args) throws InterruptedException

	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("abc");
        driver.findElement(By.id("pass")).sendKeys("123");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleContains("Facebook"));
        String title = driver.getTitle();
        System.out.println(title);
	}
}

