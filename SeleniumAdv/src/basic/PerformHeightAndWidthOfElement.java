package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PerformHeightAndWidthOfElement 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//img[@alt = 'Facebook']"));
		Dimension size = ele.getSize();
		System.out.println(size);
		
		int height = size.getHeight();
		System.out.println(height);
	    int width = size.getWidth();
		System.out.println(width);
	}
}
