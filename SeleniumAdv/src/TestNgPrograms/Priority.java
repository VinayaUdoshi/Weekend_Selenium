package TestNgPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority
{
	
	@Test(priority = 1 )
	public void test1()
	    {
		    Reporter.log("hi",true);
         }
	@Test(priority = 2 )
	public void test2()
	    {
		    Reporter.log("Bye",true);
         }
	}

