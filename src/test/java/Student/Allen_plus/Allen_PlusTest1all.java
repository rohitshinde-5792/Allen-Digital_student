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

public class Allen_PlusTest1all extends BaseClass 

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	blogpage blog;
	bulletinboardpage bulletin;
	digitalmaterialpage digitalmtl;
	doubtandsolutionpage doubtsolution;
	feedbackpage feedback;
	myassetpage myasset;
	quizpage quiz;
	rateuspage rateus;
	recreationroompage recreation;
	Revisionpage revision;
	supportpage support;
	testandreportpage testreport;
	
	@BeforeClass
	public void Setup() throws IOException 
	
	{
		
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    blog=new blogpage(driver);
	    bulletin=new bulletinboardpage(driver);
	    digitalmtl=new digitalmaterialpage(driver);
	    doubtsolution=new doubtandsolutionpage(driver);
	    feedback=new feedbackpage(driver);
	    myasset=new myassetpage(driver);
	    quiz=new quizpage(driver);
	    rateus=new rateuspage(driver);
	    recreation=new recreationroompage(driver);
	    revision=new Revisionpage(driver);
	    support=new supportpage(driver);
	    testreport=new testandreportpage(driver);
	    
	   
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
	
	@Test(priority=1)
	public void Verifyprofilename() throws IOException, InterruptedException 
	
	{
		TCID =101;	

		String actusername = home.getprofilename();
		String expusername = UtilityClass.getexceldata(0, 0);
		Assert.assertEquals(actusername, expusername,"Failed: Both User Names are different.");
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void verifyrevisionbtn() throws EncryptedDocumentException, IOException 
	{
		TCID =102;
	    boolean act = revision.revisionButtonenabled_not();
		Assert.assertTrue(act);
		
	}
	
	@Test(priority=3)
	public void verifydigiButtonenabled_or_not() throws InterruptedException 
	
	{
		TCID=103;
		boolean act = digitalmtl.digitalmtlButtonenabled_or_not();
		Assert.assertTrue(act);
		 Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void verifymonthisenable_or_not() 
	
	{
		TCID=104;
		boolean act = home.verifymonth();
		Assert.assertTrue(act);
	
	}
	
	@Test(enabled = false)
	public void verifylogoisdisplyed_or_not() 
	{
		TCID=105;
		boolean act = home.verifylogo();
		Assert.assertTrue(act);
	}
	
	@Test(priority=4)
	public void verifyTestreport() throws InterruptedException 
	
	{
		TCID=106;
		boolean act = testreport.verifytestreport();
		Assert.assertTrue(act);
		Thread.sleep(2000);
	}
	@Test(priority=5)
	public void verifydoubtsolution() throws InterruptedException 
	
	{
		TCID=107;
		boolean acta = doubtsolution.verifydoubtsolution();
		Assert.assertTrue(acta);
		Thread.sleep(2000);
	}
	
	@Test(priority=6)
	public void verifybuletinboard() 
	
	{
		TCID=108;
		boolean act = bulletin.verifybuletinboard();
		Assert.assertTrue(act);
	}
	
	@Test(priority=7)
	public void verifyfeedback() 
	
	{
		TCID=109;
		boolean act = feedback.verifyfeedback();
		Assert.assertTrue(act);
	}
	
	@Test(priority=8)
	public void verifyquiz() 
	
	{
		TCID=110;
		boolean act = quiz.verifyquiz();
		Assert.assertTrue(act);
	}
	
	@Test(priority=9)
	public void verifyMyAssets() 
	
	{
		TCID=111;
		boolean act = myasset.validMyAssets();
		Assert.assertTrue(act);
	}
	
	@Test(priority=10)
	public void verifySupport() throws InterruptedException 
	
	{
		TCID=112;
		boolean act = support.veriftSupport();
		Assert.assertTrue(act);
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
	}
	
	@Test(priority=11)
	public void verifyRecreationRoom() 
	
	{
		TCID=113;
		boolean act = recreation.verifyRecreationRoom();
		Assert.assertTrue(act);
		driver.navigate().back();
	}
	
	@Test(priority=12)
	public void verifyBlogg() 
	
	{
		TCID=114;
		boolean act = blog.verifyBlogg();
		Assert.assertTrue(act);
		//driver.navigate().back();
	}
	
	@Test(priority=13)
	public void verifyRateUs() 
	
	{
		TCID=115;
		boolean aact = rateus.verifyRateUs();
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
		//home.logoutuser();
	     driver.quit();
	}

}
