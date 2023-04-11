package Student.Allen_plus;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Student_Lib.BaseClass;
import Student_Lib.UtilityClass;

public class Allen_PlusTest extends BaseClass {
	int TCID;
	AllenLoginPage login1;
	AllenDashboardPage home;
	
	@BeforeClass
	public void Setup() throws IOException {
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenDashboardPage(driver);
	}
	@BeforeMethod
	public void BeforeMethod() {
		Reporter.log("Running Login TC");
	}
	@Test(priority = 1)
	public void LoginWebApp() throws IOException, InterruptedException {
		TCID =101;	
		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		//Thread.sleep(10000);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
		Thread.sleep(3000);
		
		String actusername = home.getprofilename();
		String expusername = UtilityClass.getexceldata(0, 0);
		Assert.assertEquals(actusername, expusername,"Failed: Both User Names are different.");
		Reporter.log("running verifyUserName TC",true);
		
	}	
//	@Test(priority = 2)
//	public void verifyUsername() throws EncryptedDocumentException, IOException {
//		TCID =102;
//		String actusername = home.getprofilename();
//		String expusername = UtilityClass.getexceldata(0, 0);
//		Assert.assertEquals(actusername, expusername,"Failed: Both User Names are different.");
//		Reporter.log("running verifyUserName TC",true);
//		
//		
//	}
	@AfterMethod
	public void appLogout(ITestResult result) throws IOException, InterruptedException
	{


	if(result.getStatus()==ITestResult.FAILURE)

	{
	UtilityClass.captureSS(driver, TCID);
	}

	Thread.sleep(2000);
	}
	@AfterClass
	public void logoutApp()
	{
	 driver.quit();
	}

}
