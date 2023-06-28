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
public class Alln_pluslogintest extends BaseClass
{
	int TCID;
	AllenLoginPage login1;
//	selectsessionpage session;
	AllenschedulePage home;
	
	@BeforeClass
	public void Setup() throws IOException 
	
	{
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		//session = new selectsessionpage(driver);
	//	home = new AllenschedulePage(driver);
		
//		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
//		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
//		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
//		login1.clickOnLoginBtn();
	}

	
	@Test
	public void verifyloginpageforgotpassword() {
		
		boolean act = login1.validateforgotpass();
		
		Assert.assertTrue(act);
	}
	
	@Test
	public void verifyloginpageADlogo() {
		
		boolean act = login1.validateloginpagelogo();
		Assert.assertTrue(act);
	}
	
	@Test
	public void verifyloginbtn_enabled_or_notwithoutcredentials() {
		
		boolean act = login1.validateloginbtn();
		Assert.assertFalse(act);
	}
	
	@AfterMethod
	public void appLogout(ITestResult result) throws IOException, InterruptedException
	{
      if(result.getStatus()==ITestResult.FAILURE)

	{
	   UtilityClass.captureSS(driver, TCID);
	}
     // home.logoutuser();
     // driver.close();
	}
	
	@AfterClass
	public void logoutApp()
	{
		//home.logoutuser();
	     driver.quit();
	}

}
