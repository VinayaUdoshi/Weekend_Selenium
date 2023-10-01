package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipcartAddToCart
{
	public static void main(String[] args) throws InterruptedException
	{

		{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");

	WebDriver driver = new FirefoxDriver();
    driver.get("https://www.flipkart.com/");  
    driver.findElement(By.xpath("//button[ . ='✕']")).click();
    driver.findElement(By.xpath("//img[@alt ='Top Mirrorless Cameras (Shop Now!)']")).click();
    driver.findElement(By.xpath("//img[@alt ='SONY ZV-E1L Mirrorless Camera Full-Frame Interchangeable Vlog �28-60mm with Bluetooth Grip (GP-VPT2BT)']")).click();
    //driver.findElement(By.id("add-to-cart-button")).click();
   
		}
	}
}
