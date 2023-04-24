package Student.Allen_plus;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Student_Lib.BaseClass;
import Student_Lib.UtilityClass;

public class Allen_PlusTest1 extends BaseClass 

{
	int TCID;
	AllenLoginPage login1;
	AllenDashboardPage home;
	
	@BeforeClass
	public void Setup() throws IOException 
	
	{
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenDashboardPage(driver);
	}
	@BeforeMethod
	public void logintoapp() throws IOException, InterruptedException 
	
	{
		
		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
		Thread.sleep(3000);
	}
	
	
	
	
	@Test
	public void verifydigiButtonenabled_or_not() 
	
	{
		TCID=103;
		boolean aact = home.digitalmtlButtonenabled_or_not();
		Assert.assertTrue(aact);
	}
	
	
	@AfterMethod
	public void appLogout(ITestResult result) throws IOException, InterruptedException
	{


	if(result.getStatus()==ITestResult.FAILURE)

	{
	   UtilityClass.captureSS(driver, TCID);
	}
	
	home.logoutuser();

	Thread.sleep(2000);
	}
	
	@AfterClass
	public void logoutApp()
	{
	 driver.quit();
	}



}
