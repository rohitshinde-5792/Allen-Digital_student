package Student_Lib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*@author : rohit shinde
 * 
 * */
public class BaseClass {
	public WebDriver driver;
	public void inilializebrowser() throws IOException{
//	ChromeOptions op=new ChromeOptions();
//	op.addArguments("--remote-allow-origins=*");
//	op.addArguments("--disable-notifications");
	driver= new ChromeDriver();
	driver.get(UtilityClass.getPFdata("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	

}
