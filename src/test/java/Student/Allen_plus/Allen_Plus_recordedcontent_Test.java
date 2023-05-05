package Student.Allen_plus;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Student_Lib.BaseClass;
import Student_Lib.UtilityClass;

public class Allen_Plus_recordedcontent_Test extends BaseClass 

{
	
	//NOTE--- Scrolling pending
	
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	Recordedcontentpage revision;
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    revision=new Recordedcontentpage(driver);
	    
	    login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);
	}

	
	@Test(priority=0)
	public void verifyrevisionbtn() throws EncryptedDocumentException, IOException 
	{
		TCID =201;
	    boolean act = revision.revisionButtonenablednot();
		Assert.assertTrue(act);
		
	}
	@Test(priority=1)
	public void verifyvideo() throws InterruptedException {
		
		revision.validatefirstvideo();
		revision.validatevideoback();
	}
//	@Test(priority=2)
//	public void verifyfinalplay() throws InterruptedException {
//		
//		//revision.validatefinalplay();
//		//revision.validatevideoback();
//		revision.validateorgchemistry();
//	}
	@Test(priority=3)
	public void verifyselectsubjectandtopic() throws EncryptedDocumentException, IOException, InterruptedException {
		  
		  revision.validateselectsubject();
		  revision.validateorgchemistry();
		  revision.validatetopic();
		  revision.validateorgchemnomenclature();
		  revision.validateapplybtn();
	}
	
//	@Test
//	public void scrollpage() throws InterruptedException {
//		revision.revisionButtonenablednot();
//		Thread.sleep(2000);
//	    UtilityClass.scrollDown(driver);
//		Thread.sleep(2000);
//	}
//	@Test
//	public void name() {
//		// not working bcz select tagname is not present
//		revision.selectdummycode();
//		
//	}
	
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
