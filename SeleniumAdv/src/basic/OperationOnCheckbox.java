package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OperationOnCheckbox
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> eles = driver.findElements(By.xpath("//input"));
		for(WebElement ele:eles)
		{
			ele.click();
			Thread.sleep(1000);
		}
		for(int i = eles.size()-1;i>=0;i--)
		{
			WebElement ele = eles.get(i);
					ele.click();
					Thread.sleep(10000);
		}
}
}
