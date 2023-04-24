package Student.Allen_plus;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Student_Lib.BaseClass;
import Student_Lib.UtilityClass;

public class Allen_Plus_testreport_Test extends BaseClass 

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	testandreportpage testreport;
	
	@BeforeClass
	public void Setup() throws IOException 
	
	{
		
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    testreport=new testandreportpage(driver);
	    
	   
	}
	@BeforeMethod
	public void logintoapp() throws IOException, InterruptedException 
	
	{
		
		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);
	}
	
	@Test
	public void verifyTestreport() throws InterruptedException 
	
	{
		TCID=401;
		boolean act = testreport.verifytestreport();
		Assert.assertTrue(act);
		Thread.sleep(2000);
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
		//home.logoutuser();
	     driver.quit();
	}


}
