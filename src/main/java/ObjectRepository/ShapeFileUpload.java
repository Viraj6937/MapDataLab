package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShapeFileUpload {

	
		public WebDriver driver;
		
		//UserTab
		private By UserDatTab = By.xpath("//button[@id='dataTab']");
		
		// +New User Layer Button
		
		private By UserLayer = By.xpath("//span[text()='+ NEW USER LAYER']");
		
		
		// File Format
		
		private By fileFrm6 = By.xpath("//select[@id='fileFormat']//option[@value='zip']");
		
	   // File Layer Name
		
		private By fileFrm61 = By.xpath("//input[@id='file_name']");
		
		//Browse Layer File
		
		private By fileFrm62 = By.id("exampleFormControlFile1");
		
		// Submit Button
		
		private By fileFrm63 = By.xpath("//button[@id='upload_file']");
		
		// PopUP Button
		
		private By fileFrm64 = By.xpath("//button[text()='OK']");
		
		
		// PopUp2 Button
		
		private By fileFrm65 = By.xpath("//button[text()='OK']");

		
		
		public ShapeFileUpload(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver = driver;
		}


		
		public WebElement userDataTabBtn()
		{
			return driver.findElement(UserDatTab);
		}
		
		public WebElement userLayerBtn()
		{
			return driver.findElement(UserLayer);
		}
		

		public WebElement fileFormat6()
		{
			return driver.findElement(fileFrm6); 
		}
		
		public WebElement fileName61()
		{
			return driver.findElement(fileFrm61);
		}
		
		public WebElement fileBrowse62()
		{
			return driver.findElement(fileFrm62);
		}
		
		public WebElement fileSubBtn63()
		{
			return driver.findElement(fileFrm63);
		}
		
		public WebElement filePopUp1Btn64()
		{
			return driver.findElement(fileFrm64);
		}
		
		
		public WebElement filePop2Btn65()
		{
			return driver.findElement(fileFrm65);
		}
		

		
		
		
	

}
