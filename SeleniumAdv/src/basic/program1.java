//To clcik on "Youtube and click on video to play"
package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 
{
	public static void main(String[] args)
	{

		{

			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");

			WebDriver driver = new FirefoxDriver();
            driver.get("https://www.google.com/search?client=firefox-b-d&q=youtube");  
            driver.findElement(By.xpath("//h3[. ='YouTube: Home']")).click();
            driver.findElement(By.xpath("//div[@class = 'ytp-inline-preview-scrim']")).click();
		
		
		}
}
}
