package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FetchValueFromPropertyFile 
{
        @Test
        public void test() throws FileNotFoundException, IOException
        {
        	Properties p = new Properties();
        	p.load(new FileInputStream("./File/p.properties"));
        	String url = p.getProperty("URL");
        	System.out.println(url);
        }        
}


