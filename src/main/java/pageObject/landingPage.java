package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	
	public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getLogin()
	
	{
		return driver.findElement(signin);
	}
	
}
