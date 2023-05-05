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

public class Allen_Plus_bulletinboard_Test extends BaseClass 

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	bulletinboardpage bulletin;
	
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    bulletin=new bulletinboardpage(driver);  
	    login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);
	}

	
	
	@Test(priority=0)
	public void verifybuletinboard() throws InterruptedException 
	
	{
		TCID=601;
		boolean act = bulletin.verifybuletinboard();
		Assert.assertTrue(act);
	}
	@Test(enabled = false)
	public void verifybulletinicon() {
		TCID=602;
		boolean act = bulletin.validatebulletinicon();
		Assert.assertTrue(act);
	}
	
	@Test(priority=2)
	public void verifybulletin_i_btn() throws InterruptedException {
		TCID=603;
		bulletin.validateBulletin_ibtn();
		bulletin.validateBulletin_ibtnclose();
	}
	
	@Test(priority=3)
	public void verifybulletinarchivednotice() throws InterruptedException {
		TCID=604;
		bulletin.validateArchivednotice();
	}
	
	@Test(priority=4)
	public void verifybulletinsearch() throws InterruptedException {
		TCID=605;
		boolean act = bulletin.validatenoticesearchbox();
		Assert.assertTrue(act);
	}
	
	@Test(priority=5)
	public void verifybulletinfilter() throws InterruptedException {
		TCID=606;
		bulletin.validatefilter();
		bulletin.validateclosefilter();
	}
	
	@Test(priority=6)
	public void verifybulletinknoledgebase() throws InterruptedException {
		TCID=607;
		bulletin.validateKnowledgeBaseNotice();
	
	}
	
	@Test(priority=7)
	public void verifyknoledgebase_ibtn() throws InterruptedException {
		TCID=607;
		bulletin.validateBulletin_ibtn();
		bulletin.validateBulletin_ibtnclose();
	
	}
	
	@Test(priority=8)
	public void verifyknoledgebasesearchbox() throws InterruptedException {
		TCID=607;
		boolean act = bulletin.validateKnowledgeBasesearch();
        Assert.assertTrue(act);
	}
	
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
		//home.logoutuser();
	     //driver.quit();
	}

}
