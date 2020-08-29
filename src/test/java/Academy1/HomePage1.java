package Academy1;

import java.io.IOException;
import org.testng.annotations.Test;

import pageObject.landingPage;
import resources.base1;

public class HomePage1 extends base1{

@Test
	
	public void basepageNavigation() throws IOException
	{
	    driver=initializeDriver();
	    driver.get("http://www.qaclickacademy.com/");
	    
	    landingPage l = new landingPage(driver);
	    
	    l.getLogin().click();
	    
	    
	}
}
