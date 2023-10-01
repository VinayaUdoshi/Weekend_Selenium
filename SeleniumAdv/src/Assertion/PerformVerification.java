package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class PerformVerification
{
	public static void main(String[] args) throws InterruptedException
	{
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("abc");
			// Assert.fail(); //Intentionally fail the test case
			driver.findElement(By.id("pass")).sendKeys("123");
			String title = driver.getTitle();
			Assert.assertEquals(title, "facebook - log in or sign up");
		}
	}
}
