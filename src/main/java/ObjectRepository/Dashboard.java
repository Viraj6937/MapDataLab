package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	
	public WebDriver driver;
	
	private By mapS = By.xpath("//div[@class='col-md-2 mapCard']");
	
	
	


	public Dashboard(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		
	}





	public void mapSelection()
	{
		
		List<WebElement> maplist = driver.findElements(mapS);
		
		for(int i=0; i<maplist.size();i++)
		{
			
		    String s = maplist.get(i).getText();
			

			if(s.contains("TestCase1001"))
			{
				
				 driver.findElement(By.xpath("//img[@src='images/unavailable.png']")).click();
				 
				 System.out.println("Map is selected succesfully");
			}
			else
			{
			   System.out.println("No Map is been found");
				
			}
			
		}
		
		
	}
	
	

}
