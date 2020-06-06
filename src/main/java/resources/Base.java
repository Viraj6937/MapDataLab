package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public WebDriver driver;
	
	public Properties prop;
	
	
	
	public WebDriver IntializeDriver() throws IOException
	{
		
	String f =	System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		
		FileInputStream fis = new FileInputStream(f);
		
		prop = new Properties();
		
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		
		if(browser.equals("chrome"))
			
		{
			
			
			String ch = System.getProperty("user.dir")+"\\browser1\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver",ch);
			
			 driver = new ChromeDriver();
			
		}
		else if(browser.equals("fireFox"))
		{
			
			String fx = System.getProperty("user.dir")+"\\browser\\geckodriver.exe";
			
			System.setProperty("webdriver.gecko.driver",fx);
			
			driver = new FirefoxDriver();
			
		}
		
		else
		{
			
			System.out.println("Driver not found");
		}
	
	
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
		
	}
	
	
	public void getScreenshotsPath(String TestCaseName, WebDriver driver) throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destination = System.getProperty("user.dir")+"\\Screenshots\\"+TestCaseName +".png";
		
		FileUtils.copyFile(source,new File(destination));
				
		
	}
	
	
	
}
