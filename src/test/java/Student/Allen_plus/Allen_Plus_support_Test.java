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

public class Allen_Plus_support_Test extends BaseClass

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	supportpage support;
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    support=new supportpage(driver);
	    
	    login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);
	}
	
	
	@Test(priority=0)
	public void verifySupport() throws InterruptedException 
	
	{
		TCID=1001;
		boolean act = support.veriftSupport();
		Assert.assertTrue(act);
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();	
	}
	
	@Test(priority=1)
	public void verifySupportibtn() throws InterruptedException 
	
	{
		TCID=1002;
		support.validatesupportibtn();
		support.validatesupportibtnclose();
	}
	
	@Test(priority=2)
	public void verifySupportAccessReqReward() throws InterruptedException 
	
	{
		TCID=1003;
		support.validateSupportAccessReqReward();
	}
	
	@Test(priority=3)
	public void verifySupportAskDoubt() throws InterruptedException 
	
	{
		TCID=1004;
		support.validateSupportAskDoubt();
	}
	
	@Test(priority=4)
	public void verifySupportAskMentor() throws InterruptedException 
	
	{
		TCID=1005;
		support.validateSupportAskMentor();
	}
	
	@Test(priority=5)
	public void verifySupportBroadcast() throws InterruptedException 
	
	{
		TCID=1006;
		support.validateSupportBroadcast();
	}
	
	@Test(priority=6)
	public void verifySupportDigitalMaterial() throws InterruptedException 
	
	{
		TCID=1007;
		support.validateSupportDigitalMaterial();
	}
	
	@Test(priority=7)
	public void verifySupportExerciseSolution() throws InterruptedException 
	
	{
		TCID=1008;
		support.validateSupportExerciseSolution();
	}
	
	@Test(priority=8)
	public void verifySupportFeedback() throws InterruptedException 
	
	{
		TCID=1009;
		support.validateSupportFeedback();
	}
	
	@Test(priority=9)
	public void verifySupportHomeWork() throws InterruptedException 
	
	{
		TCID=1010;
		support.validateSupportHomeWork();
	}
	
	@Test(priority=10)
	public void verifySupportLiveClass() throws InterruptedException 
	
	{
		TCID=1011;
		support.validateSupportLiveClass();
	}
	
	@Test(priority=11)
	public void verifySupportMyNotes() throws InterruptedException 
	
	{
		TCID=1012;
		support.validateSupportMyNotes();
	}
	
	@Test(priority=12)
	public void verifySupportOther() throws InterruptedException 
	
	{
		TCID=1013;
		support.validateSupportOther();
	}
	
	@Test(priority=13)
	public void verifySupportTestReports() throws InterruptedException 
	
	{
		TCID=1014;
		support.validateSupportTestReports();
	}
	
	@Test(priority=14)
	public void verifySupportsearcText() throws InterruptedException 
	
	{
		TCID=1015;
		boolean act = support.validateSupportsearcText();
		Assert.assertTrue(act);
	}
	
	@Test(priority=15)
	public void verifyclickSupportMyPreviousIssues() throws InterruptedException 
	
	{
		TCID=1016;
		 support.clickSupportMyPreviousIssues();	
	}
	
	@Test(priority=16)
	public void verifySupportclosedpreviousissue() throws InterruptedException 
	
	{
		TCID=1017;
		 support.validateSupportclosedpreviousissue();	
	}
	
	@Test(priority=17)
	public void verifySupportfilter() throws InterruptedException 
	
	{
		TCID=1018;
		 support.validateSupportfilter();
		 support.validateSupportfilterclose();
	}
	
	@Test(priority=18)
	public void verifySupportnewissue() throws InterruptedException 
	
	{
		TCID=1019;
		 support.validateSupportnewissue();
		 support.validateSupportissuecancel();
	}
	
	@Test(priority=19)
	public void verifySupportissuepageback() throws InterruptedException 
	
	{
		TCID=1020;
		 support.validateSupportissuepageback();
	}
	
	@Test(priority=20)
	public void verifySupportAksyourissueonmainpage() throws InterruptedException 
	
	{
		TCID=1021;
		 support.validateAksyourissueonmain();
		 support.validateSupportissuecancel();
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
