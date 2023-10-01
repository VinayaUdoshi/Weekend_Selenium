package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchLocationOfElement 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//img[@alt = 'Facebook']"));
				 Point loc = ele.getLocation();
				 System.out.println(loc);
				 int x = loc.getX();
				 System.out.println(x);
				 int y = loc.getY();
				 System.out.println(y);
	}
}
