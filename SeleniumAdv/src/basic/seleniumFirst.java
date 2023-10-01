package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumFirst {

	public static void main(String[] args) {

		{

			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");

			WebDriver driver = new FirefoxDriver();
			//driver.get("https://www.facebook.com");
			//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
			//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
			//driver.findElement(By.xpath("//button[@name='login']")).click();
		
			
			
			//driver.get("https://www.amazon.in/");
			//driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search Amazon.in']")).sendKeys("iphone");
			//driver.findElement(By.xpath("//input[@type='submit']")).click();
			//driver.findElement(By.xpath("//span[ . ='Apple iPhone 14 (128 GB) - Blue']")).click();
			//driver.findElement(By.xpath("//input[@id='add-to-cart-button' and @value = 'Add to Cart' and @type='button']")).click();
			
			
			//driver.get("https://www.flipkart.com/");
			//driver.findElement(By.xpath("//button[ . ='✕']")).click();
			//driver.findElement(By.xpath("//img[@loading='eager' and @alt='Printers (From ₹3999)']")).click();
			
			//driver.get("https://www.youtube.com/");
			//driver.findElement(By.xpath("//input[@id='search' and @type='text']")).sendKeys("salman khan");
			//driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
			
			//driver.findElement(By.xpath("//button[ . ='✕']")).click();
			//driver.findElement(By.xpath("//img[@loading='eager' and @alt='Printers (From ₹3999)']")).click();
			// driver.findElement(By.input[type='text']);		
					
			
		}
	}

}


