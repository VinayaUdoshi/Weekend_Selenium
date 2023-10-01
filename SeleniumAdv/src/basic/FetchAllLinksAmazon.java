package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchAllLinksAmazon 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		int s = all_links.size();
		System.out.println(s);
	}
	
}
