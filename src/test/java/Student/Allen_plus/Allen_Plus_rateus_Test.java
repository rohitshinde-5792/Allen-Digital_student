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
//QA
public class Allen_Plus_rateus_Test extends BaseClass 

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	rateuspage rateus;
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    rateus=new rateuspage(driver);
	    
	    login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);
	    
	}
	
	
	@Test(priority=0)
	public void verifyRateUs() 
	
	{
		TCID=1301;
		boolean aact = rateus.verifyRateUs();
		Assert.assertTrue(aact);
	}
	
//	@Test(priority=1)
//	public void verifyRateUsstar() 
//	
//	{
//		TCID=1302;
//		 rateus.validatestars();
//		//Assert.assertTrue(aact);
//	}
	
	@Test(priority=2)
	public void verifyRateUsnotnowbtn() 
	
	{
		TCID=1303;
		 rateus.validateNotnow();
		//Assert.assertTrue(aact);
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
		home.logoutuser();
	     driver.quit();
	}
	

}
