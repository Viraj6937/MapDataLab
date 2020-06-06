package ObjectRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login {
	
	public WebDriver driver;
	
	
	private By usern = By.xpath("//input[@id='loguser']");
	
	private By pass = By.xpath("//input[@id='logpass']");
	
	
	private By subbtn = By.xpath("//button[text()='LOG IN']");
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}


	public void Username() throws SQLException
	{
		
		String host = "localhost";
		
		String port = "3306";
		
       
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/MapDataLab", "root", "Viraj@1997");
		
		Statement s = con.createStatement();
		
		ResultSet rs = s.executeQuery("select * from login where employeeId='1'");
		
	   while(rs.next())
	   {
		  
		driver.findElement(usern).sendKeys(rs.getString("username"));
		  
		
	   }
	   
		
		
	}
	
	
	public void password() throws SQLException
	{
		
		
		
       String host = "localhost";
		
		String port = "3306";
		
       
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/MapDataLab", "root", "Viraj@1997");
		
		Statement s = con.createStatement();
		
		ResultSet rs = s.executeQuery("select * from login where employeeId='1'");
		
	   while(rs.next())
	   {
		   
		driver.findElement(pass).sendKeys(rs.getString("password"));
		  
		
		
	   }
	   
	  
	   
	}
	

	public WebElement submitBtn()
	{
		return driver.findElement(subbtn);
	}
		
		
			
			
}
