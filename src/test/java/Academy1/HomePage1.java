package Academy1;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.landingPage;
import resources.base1;

public class HomePage1 extends base1{

	public static Logger Log = LogManager.getLogger(base1.class.getName());
@Test
	
	public void basepageNavigation() throws IOException
	{
	    driver=initializeDriver();
	    Log.info("Driver is Initialized");
	    driver.get("http://www.qaclickacademy.com/");
	    
	    landingPage l = new landingPage(driver);
	    l.getLogin().click();
	    
	    LoginPage lp = new LoginPage(driver);
	    lp.getEmail().sendKeys("ashish");
	    lp.getPassword().sendKeys("1234");
	    lp.loginButton().click();
	    
	    
	    
	}
}
