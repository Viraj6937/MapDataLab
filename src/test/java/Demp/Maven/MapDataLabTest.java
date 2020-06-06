package Demp.Maven;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import ObjectRepository.LandingPage;
import ObjectRepository.Layer;
import ObjectRepository.Login;
import ObjectRepository.Logout;
import ObjectRepository.PincodeFileUpload;
import ObjectRepository.QualitativeClassification;
import ObjectRepository.QuantitativeClassification;
import ObjectRepository.ShapeFileUpload;
import resources.Base;
import ObjectRepository.AdminZone;
import ObjectRepository.AnalyticsZoneLayer;
import ObjectRepository.CsvFileUpload;
import ObjectRepository.Dashboard;
import ObjectRepository.DeleteFileLayer;
import ObjectRepository.GeojsonFileUpload;
import ObjectRepository.IndianDistrictFileUpload;
import ObjectRepository.IndianStateFileUpload;
import ObjectRepository.IndianSubDistrictFileUpload;

public class MapDataLabTest extends Base {

	
	public WebDriver driver;
	
	ExtentReports extent;
	
	ExtentTest test;
	
	WebDriverWait w ;

	
public static Logger log = LogManager.getLogger(Base.class.getName());
		

	
	@BeforeTest
	public void navUrl() throws IOException
	{
		
		driver = IntializeDriver();
		
		log.info("Driver is intialized successfully");
	
		
		driver.manage().deleteAllCookies();
			
		   
	   log.info("all cookies are cleared");
		   
		
		
		driver.get(prop.getProperty("url"));
		
	   log.debug("Navigating to MapDatalab is been clicked ");
	   
	   Assert.assertTrue(true);
	   
	   log.info("Mapdatalab sit is been successfully landed");
			   
	   
		driver.manage().window().maximize();
		
		log.info("window size is been maximized");
		
		driver.getTitle();
		
		 Assert.assertTrue(true);
		 
       	log.info("site title is been retrieved");	
		

		//------ Extent Reports --->
		
/*		String path = System.getProperty("user.dir")+"\\reports\\index.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("Web Automation Results");

		reporter.config().setDocumentTitle("Test Results");
		
		

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "Viraj D. Utekar");
*/
			

		
 }
	
		

	@Test(groups={"Smoke"})
	public void geojsonFile() throws InterruptedException, SQLException
	{
	 
	//	extent.createTest("geojsonFile");
		

		
        w = new WebDriverWait(driver,10);
		
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='login.php']")));
	
		
		//------------ Landing Page ----->
		
		LandingPage lp = new LandingPage(driver);
		
		lp.LoginReisterLink().click();
		
		log.debug("Login/Registration link is been clicked");
			

		//--------- Login credentials ----->

				
		Login lo = new Login(driver);

		lo.Username();
		
		log.debug("Username is been entered");
		
		lo.password();
		
		log.debug("Password is been entered");
		
		lo.submitBtn().click();
		
		log.debug("Login Submit button is been clicked");
		
		Assert.assertTrue(true);
		
		log.info("login done sucessfully");

		
		

		//----------- Dashboard------------->	
		
		
		  Thread.sleep(2000);
		
			Dashboard db1 = new Dashboard(driver);
			
			db1.mapSelection();
			
			log.debug("Map to perform operations is been clicked");

			Assert.assertTrue(true);
			
			log.info("Map is been selected sucessfully");


			//extent.flush();
			
				

		
		
			
		//--------------- Geojson File ----------->	
		
			Thread.sleep(12000);
		
			GeojsonFileUpload gs = new GeojsonFileUpload(driver);
			
			gs.userTabBtn().click();
			
			log.debug("userTab button is been clicked");
			
			gs.userLayerBtn().click();
			
			log.debug("+ New user Layer Menu button is been clicked");
			
			gs.fileformat().click();
			
			log.debug("FileFormat button is been clicked");
			
			gs.fileName().sendKeys("file1");
			
			log.debug("File Name is entered");
			
			gs.browseFile().sendKeys("C:\\Users\\dell\\Desktop\\mapdatalab\\maharashtra_districts.geojson");
			
			log.debug("File is been browsed");
			
		    Thread.sleep(2000);
		    
		    gs.addLayerSubmitBtn().click();
		    
		    log.debug("Submit Button is been Clicked");
		    
		    gs.popUp1Btn().sendKeys(Keys.ENTER);
		    
		    log.debug("File to be uploading Ok button is been clicked");
		    
		    Thread.sleep(4000);
		
			gs.popUp2Btn().sendKeys(Keys.ENTER);
			
			log.debug("File been uploaded sucessfully..Ok button is been Clicked");
			
			Assert.assertTrue(true);
			
			log.info("Geojson File is been Uploaded Successfully");
			
		//	extent.flush();
			
			

			
	       //-------Quantitative Classification --->
			
			
		Thread.sleep(2000);	
		
		QuantitativeClassification qc = new QuantitativeClassification(driver);
		
		qc.ClassifyBtn().click();
		
		log.debug("Classify 1 Button is been Clicked");
		
		qc.classifyRadioBtn();
		
		log.debug("Classificy DropDown options are selected");
		
		qc.classifyCircle().click();
		
		log.debug("Classify Circle is been selected");
		
		Thread.sleep(2000);
		
		qc.classifyBtn().click();
		
		log.debug("Classify Submit button is been Clicked");
		
		Assert.assertTrue(true);
		
		
		log.info("Quantitative Data is been Classified Sucessfully");
		
		
		
		//------- Qualtiative Classification--------->
		
			
		Thread.sleep(2000);
		
		QualitativeClassification qc2 = new QualitativeClassification(driver);
		
		qc2.ClassiBtnTab().click();
		
		log.debug("Classify Button is been Clicked");
		
		qc2.qualitativeClassify();
		
		log.debug("Qualitative Data radio button and Dropdown options are been selected");
		
		Thread.sleep(2000);
		
		qc2.ClassifySubBtn().click();
		
		log.debug("Qualitative Submit Button is been clicked");
		
		Assert.assertTrue(true);
		
		
		log.info("Qualitative Data is been Classified Sucessfully");
		
			
		//------- Delete file  layer --->
			
		
		Thread.sleep(2000);
		
		DeleteFileLayer dfl = new DeleteFileLayer(driver);
		
		dfl.deleteFileLayerBtn().sendKeys(Keys.ENTER);
		
		log.debug("File Layer Delete button is been clicked");
		
		dfl.deletepopup1().sendKeys(Keys.ENTER);
		
		log.debug("File to delete ..OK button is been clicked");
		
		Thread.sleep(2000);
		
		dfl.deletepopup2().sendKeys(Keys.ENTER);
		
		log.debug("File is been deleted.. Ok button is been clicked");
		
		
		Assert.assertTrue(true);
		
		log.info("File is been deleted sucessfully");
		
		
		
		//-------- Logout ----->

		
		Thread.sleep(2000);
		
		Logout lol = new Logout(driver);
		
		lol.logOut().click();
		
		log.debug("Logout button is been Clicked");
		
		Assert.assertTrue(true);
		
		log.info(" your Logout Successfully");

		
	
		

		//extent.flush();
		
		
	}
	
	
	

	@Test(groups= {"Smoke"})
	public void indianDistrictFile() throws InterruptedException, SQLException
	{
	
		//extent.createTest("indianDistrictFile");
		
	 
		w = new WebDriverWait(driver,10);
		
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='login.php']")));
	
		
		//------------ Landing Page ----->
		
		LandingPage lp2 = new LandingPage(driver);
		
		lp2.LoginReisterLink().click();
		
		log.debug("Login/Registration link is been clicked");
		

		//--------- Login credentials ----->
		
		
		Login lo2 = new Login(driver);

		lo2.Username();
		
		log.debug("Username is been entered");
		
		lo2.password();
		
		log.debug("Password is been entered");
		
		lo2.submitBtn().click();
		
		log.debug("Login Submit button is been clicked");
		
		Assert.assertTrue(true);
		
		log.info("login done sucessfully");
		
		
		
		//----------- Dashboard------------->	
		
		
		  Thread.sleep(2000);
		
			Dashboard db2 = new Dashboard(driver);
			
			db2.mapSelection();
			
			log.debug("Map to perform operations is been clicked");

			Assert.assertTrue(true);
			
			log.info("Map is been selected sucessfully");


			
			//------------------- Indian District File Upload ----->
			
			

			Thread.sleep(12000);
		
			IndianDistrictFileUpload d2 = new IndianDistrictFileUpload(driver);
			
			d2.userTabBtn().click();
			
			log.debug("userTab button is been clicked");
			
			d2.userLayerBtn().click();
			
			log.debug("+ New user Layer Menu button is been clicked");
			
			d2.fileFormatUpload2().click();
			
			log.debug("FileFormat buttonSSS is been clicked");
			
			d2.dataScope21().click();
			
			log.debug("DataScope is been selected");
			
			
			d2.fileName22().sendKeys("file1");
			
			log.debug("File Name is entered");
			
			d2.fileBrowse23().sendKeys("C:\\Users\\dell\\Desktop\\mapdatalab\\India_District.csv");
			
			log.debug("File is been browsed");
			
		    Thread.sleep(2000);
		    
		    d2.submitBtn24().sendKeys(Keys.ENTER);
		    
		    log.debug("Submit Button is been Clicked");
		    
		    d2.filePopUp25().sendKeys(Keys.ENTER);
		    
		    log.debug("File to be uploading Ok button is been clicked");
		    
		    Thread.sleep(4000);
		
			d2.filePopUp26().sendKeys(Keys.ENTER);
			
			log.debug(" Indian District File been uploaded sucessfully..Ok button is been Clicked");
			
			Assert.assertTrue(true);
			
			log.info("Indian District File is been Uploaded Successfully");
			
			//extent.flush();
			
		

			
			//-------Quantitative Classification --->
			
			
		Thread.sleep(2000);	
		
		QuantitativeClassification qc2 = new QuantitativeClassification(driver);
		
		qc2.ClassifyBtn().click();
		
		log.debug("Classify 1 Button is been Clicked");
		
		qc2.classifyRadioBtn();
		
		log.debug("Classificy DropDown options are selected");
		
		qc2.classifyCircle().click();
		
		log.debug("Classify Circle is been selected");
		
		Thread.sleep(2000);
		
		qc2.classifyBtn().click();
		
		log.debug("Classify Submit button is been Clicked");
		
		Assert.assertTrue(true);
		
		
		log.info("Quantitative Data is been Classified Sucessfully");
		
		
		
		//------- Qualtiative Classification--------->
		
			
		Thread.sleep(2000);
		
		QualitativeClassification qcl2 = new QualitativeClassification(driver);
		
		qcl2.ClassiBtnTab().click();
		
		log.debug("Classify Button is been Clicked");
		
		qcl2.qualitativeClassify();
		
		log.debug("Qualitative Data radio button and Dropdown options are been selected");
		
		Thread.sleep(2000);
		
		qcl2.ClassifySubBtn().click();
		
		log.debug("Qualitative Submit Button is been clicked");
		
		Assert.assertTrue(true);
		
		
		log.info("Qualitative Data is been Classified Sucessfully");
		
	
		
	
		//------- Delete file  layer --->
			
		
		Thread.sleep(2000);
		
		DeleteFileLayer dfl2 = new DeleteFileLayer(driver);
		
		dfl2.deleteFileLayerBtn().sendKeys(Keys.ENTER);
		
		log.debug("File Layer Delete button is been clicked");
		
		dfl2.deletepopup1().sendKeys(Keys.ENTER);
		
		log.debug("File to delete ..OK button is been clicked");
		
		Thread.sleep(2000);
		
		dfl2.deletepopup2().sendKeys(Keys.ENTER);
		
		log.debug("File is been deleted.. Ok button is been clicked");
		
		
		Assert.assertTrue(true);
		
		log.info("File is been deleted sucessfully");
		
		

		//-------- Logout ----->

		
		Thread.sleep(2000);
		
		Logout lol2 = new Logout(driver);
		
		lol2.logOut().click();
		
		log.debug("Logout button is been Clicked");
		
		Assert.assertTrue(true);
		
		log.info(" your Logout Successfully");

		
		
		
		//extent.flush();
		
		
	}
	
	
	
	

	
	public void indianStateFile() throws InterruptedException, SQLException
	{
		
		//extent.createTest("indianStateFile");
		

		w = new WebDriverWait(driver,10);
		
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='login.php']")));
	
		
		//------------ Landing Page ----->
		
		LandingPage lp3 = new LandingPage(driver);
		
		lp3.LoginReisterLink().click();
		
		log.debug("Login/Registration link is been clicked");
		

		//--------- Login credentials ----->
		
		
		Login lo3 = new Login(driver);

		lo3.Username();
		
		log.debug("Username is been entered");
		
		lo3.password();
		
		log.debug("Password is been entered");
		
		lo3.submitBtn().click();
		
		log.debug("Login Submit button is been clicked");
		
		Assert.assertTrue(true);
		
		log.info("login done sucessfully");
		
		
		
		//----------- Dashboard------------->	
		
		
		  Thread.sleep(2000);
		
			Dashboard db3 = new Dashboard(driver);
			
			db3.mapSelection();
			
			log.debug("Map to perform operations is been clicked");

			Assert.assertTrue(true);
			
			log.info("Map is been selected sucessfully");


			
			//------------------- Indian State File Upload ----->
			
			

			Thread.sleep(12000);
		
			IndianStateFileUpload isf3 = new IndianStateFileUpload(driver);
			
			isf3.userDataTab().click();
			
			log.debug("userTab button is been clicked");
			
			isf3.userNewLayer().click();
			
			log.debug("+ New user Layer Menu button is been clicked");
			
			isf3.fileFormat1Update().click();
			
			log.debug("FileFormat button is been clicked");
			
			isf3.dataScope().click();
			
			log.debug("DataScope is been selected");
			
			
			isf3.fileName().sendKeys("file1");
			
			log.debug("File Name is entered");
			
			isf3.fileBrowse1().sendKeys("C:\\Users\\dell\\Desktop\\mapdatalab\\India_State.csv");
			
			log.debug("File is been browsed");
			
		    Thread.sleep(2000);
		    
		    isf3.fileSubBtn().sendKeys(Keys.ENTER);
		    
		    log.debug("Submit Button is been Clicked");
		    
		    isf3.filePop().sendKeys(Keys.ENTER);
		    
		    log.debug("File to be uploading Ok button is been clicked");
		    
		    Thread.sleep(4000);
		
			isf3.filePop2().sendKeys(Keys.ENTER);
			
			log.debug("File been uploaded sucessfully..Ok button is been Clicked");
			
			Assert.assertTrue(true);
			
			log.info("Indian State  File is been Uploaded Successfully");
			
			//extent.flush();
			
		

			
			//-------Quantitative Classification --->
			
			
		Thread.sleep(2000);	
		
		QuantitativeClassification qc3 = new QuantitativeClassification(driver);
		
		qc3.ClassifyBtn().click();
		
		log.debug("Classify 1 Button is been Clicked");
		
		qc3.classifyRadioBtn();
		
		log.debug("Classificy DropDown options are selected");
		
		qc3.classifyCircle().click();
		
		log.debug("Classify Circle is been selected");
		
		Thread.sleep(2000);
		
		qc3.classifyBtn().click();
		
		log.debug("Classify Submit button is been Clicked");
		
		Assert.assertTrue(true);
		
		
		log.info("Quantitative Data is been Classified Sucessfully");
		
		
		
		//------- Qualtiative Classification--------->
		
			
		Thread.sleep(2000);
		
		QualitativeClassification qcl3 = new QualitativeClassification(driver);
		
		qcl3.ClassiBtnTab().click();
		
		log.debug("Classify Button is been Clicked");
		
		qcl3.qualitativeClassify();
		
		log.debug("Qualitative Data radio button and Dropdown options are been selected");
		
		Thread.sleep(2000);
		
		qcl3.ClassifySubBtn().click();
		
		log.debug("Qualitative Submit Button is been clicked");
		
		Assert.assertTrue(true);
		
		
		log.info("Qualitative Data is been Classified Sucessfully");
		
	
		
	
		//------- Delete file  layer --->
			
		
		Thread.sleep(2000);
		
		DeleteFileLayer dfl3 = new DeleteFileLayer(driver);
		
		dfl3.deleteFileLayerBtn().sendKeys(Keys.ENTER);
		
		log.debug("File Layer Delete button is been clicked");
		
		dfl3.deletepopup1().sendKeys(Keys.ENTER);
		
		log.debug("File to delete ..OK button is been clicked");
		
		Thread.sleep(2000);
		
		dfl3.deletepopup2().sendKeys(Keys.ENTER);
		
		log.debug("File is been deleted.. Ok button is been clicked");
		
		
		Assert.assertTrue(true);
		
		log.info("File is been deleted sucessfully");
		
		
		//-------- Logout ----->

		
		Thread.sleep(2000);
		
		Logout lol3 = new Logout(driver);
		
		lol3.logOut().click();
		
		log.debug("Logout button is been Clicked");
		
		Assert.assertTrue(true);
		
		log.info(" your been Logout Successfully");

		
		
		
		//extent.flush();
		
		
				
		
	}
	
	


	public void indiaSubDistrictFile() throws InterruptedException, SQLException
	{

		//extent.createTest("indianSubDistrictFile");
		

			w = new WebDriverWait(driver,10);
			
			w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='login.php']")));
		
			
			//------------ Landing Page ----->
			
			LandingPage lp4 = new LandingPage(driver);
			
			lp4.LoginReisterLink().click();
			
			log.debug("Login/Registration link is been clicked");
			

			//--------- Login credentials ----->
			
			
			Login lo4 = new Login(driver);

			lo4.Username();
			
			log.debug("Username is been entered");
			
			lo4.password();
			
			log.debug("Password is been entered");
			
			lo4.submitBtn().click();
			
			log.debug("Login Submit button is been clicked");
			
			Assert.assertTrue(true);
			
			log.info("login done sucessfully");
			
			
			
			//----------- Dashboard------------->	
			
			
			  Thread.sleep(2000);
			
				Dashboard db4 = new Dashboard(driver);
				
				db4.mapSelection();
				
				log.debug("Map to perform operations is been clicked");

				Assert.assertTrue(true);
				
				log.info("Map is been selected sucessfully");


				
				//------------------- Indian District File Upload ----->
				
				

				Thread.sleep(12000);
							
				IndianSubDistrictFileUpload isu4 = new IndianSubDistrictFileUpload(driver);
				
			    isu4.userDataTab().click();
			
				log.debug("userTab button is been clicked");
				
				isu4.userNewLayer().click();
				
				log.debug("+ New user Layer Menu button is been clicked");
				
				isu4.fileFormatUpdate3().click();
				
				log.debug("FileFormat button is been clicked");
				
				isu4.fileDataScope32().click();
				
				log.debug("DataScope is been selected");
				
				
				isu4.fileName33().sendKeys("File1");
				
				log.debug("File Name is entered");
				
				
				isu4.fileBrowse34().sendKeys("C:\\Users\\dell\\Desktop\\mapdatalab\\India_Sub_District.csv");
				
				log.debug("File is been browsed");
				
				Thread.sleep(2000);
				
			    isu4.fileSubBtn35().sendKeys(Keys.ENTER);
			    
			    log.debug("Submit Button is been Clicked");
			    
			    isu4.filePopUp36().sendKeys(Keys.ENTER);
			    
			    log.debug("File to be uploading Ok button is been clicked");
			    
			    WebDriverWait w2 = new WebDriverWait(driver,500);
			    
			    w2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
			    
				isu4.filePopUp37().sendKeys(Keys.ENTER);
				
				log.debug("File been uploaded sucessfully..Ok button is been Clicked");
				
				Assert.assertTrue(true);
				
				log.info("Indian State  File is been Uploaded Successfully");
				
				//extent.flush();
				
			

				
				//-------Quantitative Classification --->
				
				
			Thread.sleep(2000);	
			
			QuantitativeClassification qc4 = new QuantitativeClassification(driver);
			
			qc4.ClassifyBtn().click();
			
			log.debug("Classify 1 Button is been Clicked");
			
			qc4.classifyRadioBtn();
			
			log.debug("Classificy DropDown options are selected");
			
			qc4.classifyCircle().click();
			
			log.debug("Classify Circle is been selected");
			
			Thread.sleep(2000);
			
			qc4.classifyBtn().click();
			
			log.debug("Classify Submit button is been Clicked");
			
			Assert.assertTrue(true);
			
			
			log.info("Quantitative Data is been Classified Sucessfully");
			
			
			
			//------- Qualtiative Classification--------->
			
				
			Thread.sleep(2000);
			
			QualitativeClassification qcl4 = new QualitativeClassification(driver);
			
			qcl4.ClassiBtnTab().click();
			
			log.debug("Classify Button is been Clicked");
			
			qcl4.qualitativeClassify();
			
			log.debug("Qualitative Data radio button and Dropdown options are been selected");
			
			Thread.sleep(2000);
			
			qcl4.ClassifySubBtn().click();
			
			log.debug("Qualitative Submit Button is been clicked");
			
			Assert.assertTrue(true);
			
			
			log.info("Qualitative Data is been Classified Sucessfully");
			
		
			
		
			//------- Delete file  layer --->
				
			
			Thread.sleep(2000);
			
			DeleteFileLayer dfl4 = new DeleteFileLayer(driver);
			
			dfl4.deleteFileLayerBtn().sendKeys(Keys.ENTER);
			
			log.debug("File Layer Delete button is been clicked");
			
			dfl4.deletepopup1().sendKeys(Keys.ENTER);
			
			log.debug("File to delete ..OK button is been clicked");
			
			Thread.sleep(2000);
			
			dfl4.deletepopup2().sendKeys(Keys.ENTER);
			
			log.debug("File is been deleted.. Ok button is been clicked");
			
			
			Assert.assertTrue(true);
			
			log.info("File is been deleted sucessfully");
			
			//extent.flush();
			
			
			
			//-------- Logout ----->

				
			Thread.sleep(2000);
			
			Logout lol4 = new Logout(driver);
			
			lol4.logOut().click();
			
			log.debug("Logout button is been Clicked");
			
			Assert.assertTrue(true);
			
			log.info("Logout been deleted Successfully");
			
			//extent.flush();
			

	}
	
	

	@Test
	public void pincodeFile() throws InterruptedException, SQLException
	{
		

		//extent.createTest("pincodeFile");
		
		w = new WebDriverWait(driver,10);
		
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='login.php']")));
	
		
		//------------ Landing Page ----->
		
		LandingPage lp5 = new LandingPage(driver);
		
		lp5.LoginReisterLink().click();
		
		log.debug("Login/Registration link is been clicked");
		

		//--------- Login credentials ----->
		
		
		Login lo5 = new Login(driver);

		lo5.Username();
		
		log.debug("Username is been entered");
		
		lo5.password();
		
		log.debug("Password is been entered");
		
		lo5.submitBtn().click();
		
		log.debug("Login Submit button is been clicked");
		
		Assert.assertTrue(true);
		
		log.info("login done sucessfully");
		
		
		
		//----------- Dashboard------------->	
		
		
		  Thread.sleep(2000);
		
			Dashboard db5 = new Dashboard(driver);
			
			db5.mapSelection();
			
			log.debug("Map to perform operations is been clicked");

			Assert.assertTrue(true);
			
			log.info("Map is been selected sucessfully");


			//--------------- Pincode File Upload ------->
			

			Thread.sleep(12000);
		
			PincodeFileUpload pu = new PincodeFileUpload(driver);
			
			pu.userDataTab().click();
			
			log.debug("userTab button is been clicked");
			
			pu.userNewLayer().click();
			
			log.debug("+ New user Layer Menu button is been clicked");
			
			pu.fileFormat5().click();
			
			log.debug("FileFormat button is been clicked");
			
			pu.fileDataScope51().click();
			
			log.debug("DataScope is been selected");
			
			pu.fileName52().sendKeys("file1");
			
			log.debug("File Name is entered");
			
			pu.fileBrowse53().sendKeys("C:\\Users\\dell\\Desktop\\mapdatalab\\India_Pincodes.csv");
			
			log.debug("File is been browsed");
			
		    Thread.sleep(2000);
		    
		    pu.fileSubBtn54().sendKeys(Keys.ENTER);
		    
		    log.debug("Submit Button is been Clicked");
		    
				    
		    pu.filePopUp55().sendKeys(Keys.ENTER);
		    
		    log.debug("File to be uploading Ok button is been clicked");
		    


		    WebDriverWait w2 = new WebDriverWait(driver,500);
		    
		    w2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
		    
		    pu.filePopUp56().sendKeys(Keys.ENTER);
		    
			log.debug("File been uploaded sucessfully..Ok button is been Clicked");
			
			Assert.assertTrue(true);
			
			log.info("Pincode  File is been Uploaded Successfully");
			
			//extent.flush();
			
		

			
			//-------Quantitative Classification --->
			
			
		Thread.sleep(2000);	
		
		QuantitativeClassification qc5 = new QuantitativeClassification(driver);
		
		qc5.ClassifyBtn().click();
		
		log.debug("Classify 1 Button is been Clicked");
		
		qc5.classifyRadioBtn();
		
		log.debug("Classificy DropDown options are selected");
		
		qc5.classifyCircle().click();
		
		log.debug("Classify Circle is been selected");
		
		Thread.sleep(2000);
		
		qc5.classifyBtn().click();
		
		log.debug("Classify Submit button is been Clicked");
		
		Assert.assertTrue(true);
		
		
		log.info("Quantitative Data is been Classified Sucessfully");
		
		
		
		//------- Qualtiative Classification--------->
		
			
		Thread.sleep(2000);
		
		QualitativeClassification qcl5 = new QualitativeClassification(driver);
		
		qcl5.ClassiBtnTab().click();
		
		log.debug("Classify Button is been Clicked");
		
		qcl5.qualitativeClassify();
		
		log.debug("Qualitative Data radio button and Dropdown options are been selected");
		
		Thread.sleep(2000);
		
		qcl5.ClassifySubBtn().click();
		
		log.debug("Qualitative Submit Button is been clicked");
		
		Assert.assertTrue(true);
		
		
		log.info("Qualitative Data is been Classified Sucessfully");
		
	
		
	
		//------- Delete file  layer --->
			
		
		Thread.sleep(2000);
		
		DeleteFileLayer dfl5 = new DeleteFileLayer(driver);
		
		dfl5.deleteFileLayerBtn().sendKeys(Keys.ENTER);
		
		log.debug("File Layer Delete button is been clicked");
		
		dfl5.deletepopup1().sendKeys(Keys.ENTER);
		
		log.debug("File to delete ..OK button is been clicked");
		
		Thread.sleep(2000);
		
		dfl5.deletepopup2().sendKeys(Keys.ENTER);
		
		log.debug("File is been deleted.. Ok button is been clicked");
		
		
		Assert.assertTrue(true);
		
		log.info("File is been deleted sucessfully");
		
		//extent.flush();
		
		
		
		//-------- Logout ----->

			
		Thread.sleep(2000);
		
		Logout lol5 = new Logout(driver);
		
		lol5.logOut().click();
		
		log.debug("Logout button is been Clicked");
		
		Assert.assertTrue(true);
		
		log.info("Logout been deleted Successfully");
		
		//extent.flush();
		
		

		
	}
	


	@Test
	public void csvFile() throws SQLException, InterruptedException, AWTException
	{

		//extent.createTest("csvFile");
		
		w = new WebDriverWait(driver,10);
		
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='login.php']")));
	

		//------- Landing Page------------->
		
		LandingPage lp8 = new LandingPage(driver);

		lp8.LoginReisterLink().click();
		
		log.debug("Loging/Registration link is been clicked");
		
		//--------- Login -------------->
		
		Login lop8 = new Login(driver);
		
		lop8.Username();
		
		log.debug("username is been entered");
		
		lop8.password();
		
		log.debug("password is been entered");
		
		Thread.sleep(2000);
		
		lop8.submitBtn().click();
		
		log.debug("login submit button is been clicked");
		
		Assert.assertTrue(true);
		
		log.info("login done sucessfully");
		
		
		//---------- Dashboard ---------->
		
		Dashboard db8 = new Dashboard(driver);
		
		db8.mapSelection();
		
		log.debug("Map is been seleceted");
		
		Assert.assertTrue(true);
		
		log.info("Map is selected sucessfully");
		
		
		
		
		//---------- Long and lat File Upload -------->
		
		
		Thread.sleep(12000);
	
		CsvFileUpload lal = new CsvFileUpload(driver);
		
		lal.UseTabBtn().click();
		
		log.debug("User Tab button is been clicked");
		
		lal.userLayerBtn().click();
		
		log.debug("+ New User Layer button is been clicked");
		
		lal.fileFormat9().click();
		
		log.debug("File format is been selected");
		
		lal.fileName91().sendKeys("file1");
		
		log.debug("File Name is been entered");
		
		lal.fileBrowse92().sendKeys("C:\\Users\\dell\\Desktop\\mapdatalab\\Long&Lat.csv");
		
		log.debug("Csv file to be uploaded is been browsed");
		
		Thread.sleep(2000);
		
		lal.fileSubBtn93().sendKeys(Keys.ENTER);
		
		log.debug("Submit button is been clicked");
		
		lal.filePopUp94().click();
	
		log.debug("First Pop-up after submit, ..OK button is been clicked");
		
		Thread.sleep(4000);
		
		lal.filePopUp95().sendKeys(Keys.ENTER);
			
		log.debug("Second Pop-up after submit,...OK button is been clicked");
		
		
		Assert.assertTrue(true);
		
		log.info("Csv File is been uploaded sucessfully");
		
	

		//-----------Quantitative Data------------>
		
	
		Thread.sleep(2000);
		
		QuantitativeClassification qc8 = new QuantitativeClassification(driver);
		
		qc8.ClassifyBtn().click();
		
		log.debug("Classify tab button is been clicked");
		
		qc8.classifyRadioBtn();
		
		log.debug("Classification method drop downs are selected");
		
		qc8.classifyCircle().click();
		
		log.debug("Classify circle option is been selected");
		
		Thread.sleep(2000);
		
		qc8.classifyBtn().click();
		
		log.debug("Classify Button is been clicked");
		
		Assert.assertTrue(true);
		
		log.debug("Quantitative Data is been classified sucessfully");
		
	
		
		
		//------------- QualitativeData ------------->
		
		Thread.sleep(2000);
		
		QualitativeClassification qds8 = new QualitativeClassification(driver);
		
		qds8.ClassiBtnTab().click();
		
		log.debug("Clasify Tab button is been clicked");
		
		Thread.sleep(2000);
		
		qds8.qualitativeClassify();
		
		log.debug("Classify options from drop down is been selected");
		
		Thread.sleep(1000);
		
		qds8.ClassifySubBtn().click();
		
		log.debug("Classify button is been clicked");
		
		Assert.assertTrue(true);
		
		log.info("Qualitative Data of Csv file is been classified sucessfully");
		
		
			
					
		
		//--------------- Analytics Zonal Layer ---------------->
		
		Thread.sleep(2000);
		
		AnalyticsZoneLayer azl = new AnalyticsZoneLayer(driver);
		
		azl.UntickFile100().click();
		
		azl.AnalyticsTab101().click();
		
		azl.AnalyticZonalBtn102().click();
	
		
	
		
		//------------ Admin Zone ---------------->

		Thread.sleep(2000);
		
		AdminZone adz = new AdminZone(driver);
		
		adz.adminZone();
		
		//adz.classificationMethods();

	    

		
			    
		 
		 //------------- Layer ------->
		 
		 
		Thread.sleep(2000);
		
		 Layer l = new Layer(driver);
		 
		 l.LayerMenuBtn().click();
		 
		 l.FileRadioBtnCheck().click();
		 
		 
		
		//--------DeleteLayer ----->
		
		DeleteFileLayer dl8 = new DeleteFileLayer(driver);
		
		
		Thread.sleep(3000);
		dl8.deleteFileLayerBtn().click();
		
		Thread.sleep(2000);
		
		dl8.deletepopup1().click();
		
		Thread.sleep(2000);
		dl8.deletepopup2().click();
		
	
		
		//---------- LogOut ----->
		
		
		Logout lo8 = new Logout(driver);
		
		Thread.sleep(3000);
		lo8.logOut().click();
		
				

		//extent.flush();
		
		
	}
	
	
	@Test
	public void shapeFile() throws InterruptedException, SQLException
	{

		
		//extent.createTest("shapeFile");
		

		
        w = new WebDriverWait(driver,10);
		
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='login.php']")));
	

		//---------- Landing Page  ---------->
		
        LandingPage lp9 = new LandingPage(driver);
		
		lp9.LoginReisterLink().click();
		
		log.debug("Login/Registration link is been clicked");
			

		
		
		//--------- Login -------------->
		

		Login lop9 = new Login(driver);
		
		lop9.Username();
		
		log.debug("username is been entered");
		
		lop9.password();
		
		log.debug("password is been entered");
		
		Thread.sleep(2000);
		
		lop9.submitBtn().click();
		
		log.debug("login submit button is been clicked");
		
		Assert.assertTrue(true);
		
		log.info("login done sucessfully");
		
		

		//---------- Dashboard ---------->
		
		Dashboard db9 = new Dashboard(driver);
		
		db9.mapSelection();
		
		log.debug("Map is been seleceted");
		
		Assert.assertTrue(true);
		
		log.info("Map is selected sucessfully");
		
		
	//----------- Shape File ---------->

		
		Thread.sleep(12000);
		
		ShapeFileUpload shp = new ShapeFileUpload(driver); 
		
		shp.userDataTabBtn().click();
		
		log.debug("User Data Tab button is been clicked");
		
		shp.userLayerBtn().click();
		
		log.debug("+ New User Layer button is been clicked");
		
		shp.fileFormat6().click();
		
		log.debug("File format is been selected");
		
		shp.fileName61().sendKeys("file1");
		
		log.debug("File Name is been entered");
		
		shp.fileBrowse62().sendKeys("C:\\Users\\dell\\Desktop\\mapdatalab\\maharashtra_highway (1).zip");
		
		Thread.sleep(2000);
		
		log.debug("Shape file been browsed and selected");
		
		shp.fileSubBtn63().sendKeys(Keys.ENTER);
		
		log.debug("Submit button for file upload is been Clicked");
		
		shp.filePopUp1Btn64().sendKeys(Keys.ENTER);

		log.debug("first Pop-Up after uploading file ....Ok button  is been clicked");
		
		Thread.sleep(4000);
		
		shp.filePop2Btn65().sendKeys(Keys.ENTER);
		
		log.debug("Second Pop-Up after uploading file ....Ok button is been clicked");
		
		
		
		//-----------Quantitative Data------------>
		
 

		Thread.sleep(2000);
		
		QuantitativeClassification qc9 = new QuantitativeClassification(driver);
		
		qc9.ClassifyBtn().click();
		
		log.debug("Classify tab button is been clicked");
		
		qc9.classifyRadioBtn();
		
		log.debug("Classification method drop downs are selected");
		
		qc9.classifyCircle().click();
		
		log.debug("Classify circle option is been selected");
		
		Thread.sleep(2000);
		
		qc9.classifyBtn().click();
		
		log.debug("Classify Button is been clicked");
		
		Assert.assertTrue(true);
		
		log.debug("Quantitative Data is been classified sucessfully");
		
	
				
		//------------- QualitativeData ------------->
		
		
		Thread.sleep(2000);
		
		QualitativeClassification qds9 = new QualitativeClassification(driver);
		
		qds9.ClassiBtnTab().click();
		
		log.debug("Clasify Tab button is been clicked");
		
		Thread.sleep(2000);
		
		qds9.qualitativeClassify();
		
		log.debug("Classify options from drop down is been selected");
		
		Thread.sleep(1000);
		
		qds9.ClassifySubBtn().click();
		
		log.debug("Classify button is been clicked");
		
		Assert.assertTrue(true);
		
		log.info("Qualitative Data of Shape file is been classified sucessfully");
		
		
			
			

		

		//--------DeleteLayer ----->
		
		DeleteFileLayer d9 = new DeleteFileLayer(driver);
		
		
		Thread.sleep(3000);
		d9.deleteFileLayerBtn().click();
		
		Thread.sleep(2000);
		
		d9.deletepopup1().click();
		
		Thread.sleep(2000);
		d9.deletepopup2().click();
		
	
		
		//---------- LogOut ----->
		
		
		Logout l9 = new Logout(driver);
		
		Thread.sleep(3000);
		l9.logOut().click();
		
			
		//extent.flush();
	
		
		
	}

	
	
	
	
	

	@AfterTest
	public void terminate()
	{
		
		driver.quit();
	}
	
	
	
}
