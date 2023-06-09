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
public class Allen_Plus_myassets_Test extends BaseClass 

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	myassetpage myasset;
	
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    myasset=new myassetpage(driver);  
	    
	    login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);
	}
	
	
	
	
	@Test(priority=0)
	public void verifyMyAssets() throws InterruptedException 
	
	{
		TCID=901;
		boolean act = myasset.validMyAssets();
		Assert.assertTrue(act);
	}
	
	@Test(priority=1)
	public void verifyMyAssetsMynotesibtn() throws InterruptedException 
	
	{
		TCID=902;
		myasset.validatemynotesibtn();
		myasset.validatemynotesibtnclose();
	}
	
	@Test(priority=2)
	public void verifyMyAssetsMynotesfilter() throws InterruptedException 
	
	{
		TCID=903;
		myasset.validatenotefilter();
		//myasset.validatemynotesfiltersunjectwise();
		//myasset.validatemynotesfilterfacultywise();
		//myasset.validatemynotesfilterapply();
		//myasset.validatemynotesfiltercancel();
		myasset.validatenotefilterclose();
	}
	@Test(priority=3)
	public void verifyMyAssetsMyHomework() throws InterruptedException 
	
	{
		TCID=903;
		myasset.validateHW();
		
	}
	@Test(priority=4)
	public void verifymyhwibtn() throws InterruptedException {
		
		myasset.validatehwibtn();
		myasset.validatehwibtnclose();
	}
	@Test(priority=5)
	public void verifyMyassermymentor() {
		
		myasset.validatemymentor();
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
