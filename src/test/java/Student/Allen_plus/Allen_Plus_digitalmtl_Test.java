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

public class Allen_Plus_digitalmtl_Test extends BaseClass

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	digitalmaterialpage digitalmtl;
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    digitalmtl=new digitalmaterialpage(driver); 
	    
	    login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);
	}
	
	
	@Test
	public void verifydigiButtonenabled_or_not() throws InterruptedException 
	
	{
		TCID=301;
		boolean act = digitalmtl.digitalmtlButtonenabled_or_not();
		Assert.assertTrue(act);
		 Thread.sleep(3000);
	}
	@Test
	public void validate_i_btn() throws InterruptedException 
	{
		TCID=302;
		digitalmtl.validate_i_btn();
		
	}
	@Test
	public void verifysearchbox() {
		
		TCID=303;
		boolean act = digitalmtl.validatesearchbtn();
		Assert.assertTrue(act);
	}
	@Test
	public void verifyfilter() {
		TCID=304;
		digitalmtl.validatefilter();
	}
	@Test
	public void verifymaintitle() {
		boolean act = digitalmtl.validatemaintitle();
		Assert.assertTrue(act);
	}
	@Test
	public void verifyexersice() {
		
		boolean act = digitalmtl.validateexercise();
		Assert.assertTrue(act);
	}
	
	@AfterMethod
	public void appLogout(ITestResult result) throws IOException, InterruptedException
	{


	if(result.getStatus()==ITestResult.FAILURE)

	{
	   UtilityClass.captureSS(driver, TCID);
	}
	
	
	}
	
	@AfterClass
	public void logoutApp()
	{
		home.logoutuser();
	     driver.quit();
	}


}
