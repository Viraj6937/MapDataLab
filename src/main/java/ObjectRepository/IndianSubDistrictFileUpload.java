package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndianSubDistrictFileUpload {

public WebDriver driver;
	


   //UserDataTab
    private By UserDatTab = By.xpath("//button[@id='dataTab']");

    
    //UserLayer
    private By UserLayer = By.xpath("//span[text()='+ NEW USER LAYER']");
    
	
	//File Format
	
	private By  fileForm3 = By.xpath("//select[@id='fileFormat']//option[@value='nonspatial']");
	
	//DataScope
	
	private By fileForm31 = By.xpath("//select[@id='dataScope']//option[@value='subDistrict']");
	
	//File Name
	
	private By fileForm32 = By.xpath("//input[@id='file_name']");
	
	// File Browse
	
	private By fileForm33 = By.id("exampleFormControlFile1");
	
	//Submit Button
	
	private By fileBtn34 = By.cssSelector("button[id='upload_file']");
	
	// PopUp Button 1
	
	private By filePopUp35 = By.xpath("//button[text()='OK']");
	
	//PopUp Button 2
	
	private By filePopUp36 = By.xpath("//button[text()='OK']");
	
	
	
	public IndianSubDistrictFileUpload(WebDriver driver) {
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
	

	public WebElement fileFormatUpdate3()
	{
		return driver.findElement(fileForm3);
	}
	
	public WebElement fileDataScope32()
	{
		return driver.findElement(fileForm31);
	}
	
	public WebElement fileName33()
	{
		return driver.findElement(fileForm32);
	}
	
	public WebElement fileBrowse34()
	{
		return driver.findElement(fileForm33);
	}
	
	public WebElement fileSubBtn35()
	{
		return driver.findElement(fileBtn34);
	}
	
	public WebElement filePopUp36()
	{
		return driver.findElement(filePopUp35);
	}
	
	public WebElement filePopUp37()
	{
		return driver.findElement(filePopUp36);
	}

	
	
	
}
