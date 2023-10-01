package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class VerifySoftAssert 
{
	public static void main(String[] args) throws InterruptedException
	{
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			String title = driver.getTitle();
			SoftAssert s = new SoftAssert();
			s.assertEquals(title, "facebook-log-in");
			driver.findElement(By.id("email")).sendKeys("abc");
			driver.findElement(By.id("pass")).sendKeys("123");
			s.assertAll();
		}
	}
}
