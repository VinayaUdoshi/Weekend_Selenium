//To open Amazon website , select one product and click on - add to cart
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAddToCart 
{
	public static void main(String[] args) throws InterruptedException
	{

		{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");

	WebDriver driver = new FirefoxDriver();
    driver.get("https://www.amazon.com/");  
    driver.findElement(By.xpath("//img[@alt ='Headsets']")).click();
    driver.findElement(By.xpath("//img[@alt ='Sponsored Ad - Corsair HS80 MAX Wireless Multiplatform Gaming Headset with Bluetooth - Dolby Atmos - Broadcast Quality Mic...']")).click();
    driver.findElement(By.id("add-to-cart-button")).click();
    Thread.sleep(2000);
		}
	}
}
