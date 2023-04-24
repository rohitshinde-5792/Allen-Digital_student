package Student_Lib;

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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {

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

	public static String getPFdata(String key) throws IOException
	{
	   FileInputStream file=new FileInputStream("C:\\Users\\ginger\\eclipse-workspace\\AllenCode-master\\AllenCode-master\\properties files\\Allen_plus.properties");
	   Properties p=new Properties();
	   p.load(file);
	   String value = p.getProperty(key);
	   return value;
	}

	public static void scrollDown(WebDriver driver)
	{
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)");
	}

	public static void refreshPage(WebDriver driver)
	{
	driver.navigate().refresh();
	}
	
//	public void sele() {
//		Select s= new Select();
//		
//	}

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
}
