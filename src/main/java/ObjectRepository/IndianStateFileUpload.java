package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndianStateFileUpload {
	
public WebDriver driver;



   //UserDataTab
   private By UserDatTab = By.xpath("//button[@id='dataTab']");

   //UserLayer
   private By UserLayer = By.xpath("//span[text()='+ NEW USER LAYER']");
	
	//FileFormat
	private By fileFormat1 = By.xpath("//select[@id='fileFormat']//option[@value='nonspatial']");
	
	//DataScope
	
	private By fileFormat2 = By.xpath("//select[@id='dataScope']//option[@value='state']");
	
	//FileName
	
	private By fileFormat3 = By.xpath("//input[@id='file_name']");
	
	//FileBrowse
	
	private By fileFormat4 = By.id("exampleFormControlFile1");
	
	//SubmitButton1
	
	private By fileBtn1 = By.cssSelector("button[id='upload_file']");
	
	//PopBtn1
	
	private By filepop1 = By.xpath("//button[text()='OK']");
	
	//PopBtn2
	
	private By filepop2 = By.xpath("//button[text()='OK']");
	
	


	public IndianStateFileUpload(WebDriver driver) {
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
	

	public WebElement fileFormat1Update()
	{
		return driver.findElement(fileFormat1);
	}
	
	public WebElement dataScope()
	{
		return driver.findElement(fileFormat2);
	}
	
	public WebElement fileName()
	{
		return driver.findElement(fileFormat3);
	}
	
	public WebElement fileBrowse1()
	{
		return driver.findElement(fileFormat4);
	}
	
	public WebElement fileSubBtn()
	{
		return driver.findElement(fileBtn1);
	}
	
	public WebElement filePop()
	{
		return driver.findElement(filepop1);
	}
	
	public WebElement filePop2()
	{
		return driver.findElement(filepop2);
	}
	

}
