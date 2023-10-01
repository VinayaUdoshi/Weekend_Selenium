//To type 'vinaya' and highlight all headings in page and display those in console
package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program2 
{


		public static void main(String[] args)
		{

			{

				System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");

				WebDriver driver = new FirefoxDriver();
			    driver.get("https://www.google.com/search?q=vinaya&sca_esv=562133542&source=hp&ei=YuHyZMmWG6DS1e8PhZ2-EA&iflsig=AD69kcEAAAAAZPLvciDUo44hKmpMJLb1HcS-0N8U9-hs&ved=0ahUKEwjJz-H8sIuBAxUgafUHHYWODwIQ4dUDCAg&uact=5&oq=vinaya&gs_lp=Egdnd3Mtd2l6IgZ2aW5heWEyEBAAGIAEGLEDGIMBGEYY-wEyCxAuGIMBGLEDGIAEMgsQABiKBRixAxiDATILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMggQLhiABBixAzILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMgsQABiKBRixAxiDATIIEC4YgAQYsQNIkTxQAFgXcAF4AJABAZgBmAGgAZAEqgEDMC40uAEDyAEA-AEBwgILEC4YgAQYsQMYgwHCAgsQLhiKBRixAxiDAcICBRAuGIAE&sclient=gws-wiz&bshm=rimc/1");
              
			    List<WebElement> all_links = driver.findElements(By.xpath("//h3"));
			    for(WebElement ele :all_links)
			    {
			    	String text = ele.getText();
			    	System.out.println(text);
			    }
			    System.out.println(all_links.size());
			
			}
}
}