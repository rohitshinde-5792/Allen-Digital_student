package Student_Lib;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

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
	

//		FirefoxOptions op=new FirefoxOptions();
//		op.addArguments("--remote-allow-origins=*");
//		op.addArguments("--disable-notifications");
//		driver= new FirefoxDriver();
	

	
	driver.get(UtilityClass.getPFdata("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	}
	
	

}
