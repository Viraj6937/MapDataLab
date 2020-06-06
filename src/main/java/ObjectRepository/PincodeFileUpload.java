package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PincodeFileUpload {


	public WebDriver driver;
	
	
	
	 //UserDataTab
    private By UserDatTab = By.xpath("//button[@id='dataTab']");

    
    //UserLayer
    private By UserLayer = By.xpath("//span[text()='+ NEW USER LAYER']");
    
    
	// File Format
	private By fileForm5 = By.xpath("//select[@id='fileFormat']//option[@value='nonspatial']");
	
	// File DataScope
	private By fileForm51 = By.xpath("//select[@id='dataScope']//option[@value='pincode']");
	
	// FileName
	private By fileForm52 = By.xpath("//input[@id='file_name']");
	
	//File Browse
	private By fileForm53 = By.id("exampleFormControlFile1");
	
	// File Submit
	private By fileBtn54 = By.cssSelector("button[id='upload_file']");
	
	// File PopUp 1
	private By fileBtn55 = By.xpath("//button[text()='OK']");
	
	// File PopUp 2
	private By fileBtn56 = By.xpath("//button[text()='OK']");
	 
	 
	 
	public PincodeFileUpload(WebDriver driver) {
		// TODO Auto-generated constructor stub

	 this.driver = driver;
	
	}
	
	

	public WebElement userDataTab()
	{
		return driver.findElement(UserDatTab);
	}
	
	public WebElement userNewLayer()
	{
		return driver.findElement(UserLayer);
	}
	

	public WebElement fileFormat5()
	{
		return driver.findElement(fileForm5);
	}
	
	public WebElement fileDataScope51()
	{
		return driver.findElement(fileForm51);
	}
	
	public WebElement fileName52()
	{
		return driver.findElement(fileForm52);
	}
	
	public WebElement fileBrowse53()
	{
		return driver.findElement(fileForm53);
	}
	
	public WebElement fileSubBtn54()
	{
		return driver.findElement(fileBtn54);
	}
	
	public WebElement filePopUp55()
	{
		return driver.findElement(fileBtn55);
	}
	
	public WebElement filePopUp56()
	{
		return driver.findElement(fileBtn56);
	}

	
	
}
