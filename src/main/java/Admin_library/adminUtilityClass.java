package Admin_library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class adminUtilityClass {

	public static String getexceldata(int row, int col) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\ginger\\eclipse-workspace\\AllenCode-master\\AllenCode-master\\Testdata\\Allen_plus_Testdata.xlsx");
		Sheet datasheet = WorkbookFactory.create(file).getSheet("Student");
		String exdata = datasheet.getRow(row).getCell(col).getStringCellValue();
		return exdata;
	}
	public static void captureSS(WebDriver driver,int TCID) throws IOException

	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\ginger\\eclipse-workspace\\AllenCode-master\\AllenCode-master\\Screenshots\\"+TCID+".jpg");
	// FileUtils.copyFile(src, dest);
	FileHandler.copy(src, dest);
	}

	public static String getadminPFdata(String key) throws IOException
	{
	   FileInputStream file=new FileInputStream("C:\\Users\\ginger\\eclipse-workspace\\AllenCode-master\\AllenCode-master\\Admin.properties");
	   Properties pp=new Properties();
	   pp.load(file);
	   String value = pp.getProperty(key);
	   return value;
	}

	public static void scrollDown(WebDriver driver)
	{
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,6000)");
	}

	public static void refreshPage(WebDriver driver)
	{
	driver.navigate().refresh();
	}
	
	public static void selectoption(WebElement ele,int index) 
	{
		
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	
    public static void selectoptiontext(WebElement ele,String visibleText) 
    {
		
		Select s=new Select(ele);
		s.selectByVisibleText(visibleText);
	}
    
    public static void selectoptionvalue(WebElement ele, String value) 
    {
    	
		Select s=new Select(ele);
		s.selectByValue(value);
	}
    
	@SuppressWarnings("deprecation")
	public static void implicitlyWait(WebDriver driver)
	{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	public static void switchToChildWindow(WebDriver driver)
	{
	Set<String> allIds = driver.getWindowHandles();

	ArrayList<String> al=new ArrayList<String>(allIds);
	//String childWindowID = al.get(1);
	driver.switchTo().window(al.get(1));
	}

	public static void switchToMainPage(WebDriver driver)

	{
	Set<String> allIDsss = driver.getWindowHandles();

	ArrayList<String> al=new ArrayList<String>(allIDsss);
	// String mainPageID = al.get(0);
	driver.switchTo().window(al.get(0));
	}
	
//	public static void perform_action(WebDriver driver,Keys, WebElement value) {
//		
//		Actions ele=new Actions(driver);
//		
//		//ele.moveToElement(value).perform();
//		
//		ele.sendKeys(Keys.ARROW_DOWN, value);
//	}
	
}
