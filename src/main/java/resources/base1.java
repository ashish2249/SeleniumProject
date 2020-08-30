package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base1 {
public WebDriver driver;
	
public WebDriver initializeDriver() throws IOException

{
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\akgup\\eclipse-workspace\\E2EProject1\\src\\main\\java\\resources\\data1.properties");	
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","F:\\Software\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","F:\\Software\\geckodriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		
	}
	
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return driver;
	
	}

	}
