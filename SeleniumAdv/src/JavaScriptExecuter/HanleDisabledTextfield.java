package JavaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HanleDisabledTextfield 
{
	public static void main(String[] args) throws InterruptedException
	{

		{
 
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
            WebDriver driver = new FirefoxDriver();
            //Typecasting from web driver to JSE
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            driver.get("file:///Users/vinayau/Desktop/disabledtextfieldvalue.html");
            Thread.sleep(1000);
            //used to pass data inside a disabled textfiled 
            jse.executeScript("document.getElementById('a2').value= '50000'");
            //used to clear data inside a disabled textfield
            jse.executeScript("document.getElementById('a3').value= ' '");
            
		}
	}	
}
