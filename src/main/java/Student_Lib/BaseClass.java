package Student_Lib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*@author : rohit shinde
 * 
 * */
public class BaseClass 

{
	public WebDriver driver;
	
	public void inilializebrowser() throws IOException
	{
		
//		if(BrowserName.equals("Chrome"))
//		{
//			driver=new ChromeDriver();
//		}
//		
//		else if(BrowserName.equals("Edge"))
//		{
//			driver=new EdgeDriver();
//		}
//		
//		else if(BrowserName.equals("Firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
		
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	op.addArguments("--disable-notifications");
	driver= new ChromeDriver(op);
	driver.get(UtilityClass.getPFdata("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().deleteAllCookies();
	
	}
	
	

}
