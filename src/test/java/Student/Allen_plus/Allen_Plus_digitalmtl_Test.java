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
	doubtandsolutionpage doubtsolution;
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
	
	
	@Test(priority = 0)
	public void verifydigiButtonenabled_or_not() throws InterruptedException 
	
	{
		TCID=301;
		boolean act = digitalmtl.digitalmtlButtonenabled_or_not();
		Assert.assertTrue(act);
		 Thread.sleep(3000);
	}
	@Test(priority = 1)
	public void validate_i_btn() throws InterruptedException 
	{
		TCID=302;
		digitalmtl.validate_i_btn();
		Thread.sleep(1000);
	}
	@Test(priority = 2)
	public void verifysearchbox() throws InterruptedException {
		
		TCID=303;
		boolean act = digitalmtl.validatesearchbtn();
		Assert.assertTrue(act);
		Thread.sleep(1000);
	}
	@Test(priority = 3)
	public void verifyfilter() {
		TCID=304;
		digitalmtl.validatefilter();
	}
	@Test(priority = 4)
	public void verifymaintitle() throws InterruptedException {
		boolean act = digitalmtl.validatemaintitle();
		Assert.assertTrue(act);
		Thread.sleep(1000);
	}
	@Test(priority = 5)
	public void verifyexersice() throws InterruptedException {
		
		boolean act = digitalmtl.validateexercise();
		Assert.assertTrue(act);
		Thread.sleep(1000);
	}
    @Test(priority = 6)
	public void verifyrace() throws InterruptedException {
		
		digitalmtl.validaterace();
		Thread.sleep(1000);
	
	}
    @Test(priority = 7)
    public void verifyspacialbooklet() throws InterruptedException {
    	
    	digitalmtl.validateSpecialBooklet();
    	Thread.sleep(1000);
		
	}
    @Test(priority = 8)
    public void verifyclassnote() throws InterruptedException {
    	
    	digitalmtl.validateclassnotes();
    	Thread.sleep(1000);
		
	}
    @Test(priority = 9)
    public void verifyrecordedcon() throws InterruptedException {
		
    	digitalmtl.validateRecordedContent();
    	digitalmtl.validateRecordedContentback();
    	Thread.sleep(1000);
	}
    @Test(priority = 10)
    public void verifyracevideosol() throws InterruptedException {
		
    	boolean act = digitalmtl.validateracevideosolution();
    	Thread.sleep(1000);
    	digitalmtl.validateracevideoback();
    	Assert.assertTrue(act);
    	Thread.sleep(1000);
    	//digitalmtl.validateracevideoback();
    	Thread.sleep(1000);
    	
	}
    @Test(priority = 11)
    public void verifyexercisevidsol() throws InterruptedException {
		
    	digitalmtl.validateexercisevideo();
    	digitalmtl.validateexercisevideoback();
    	Thread.sleep(1000);
	}
    @Test(priority = 12)
    public void verifyclassrecording() throws InterruptedException {
		
    	digitalmtl.validateClassRecordings();
    	Thread.sleep(1000);
    	digitalmtl.validateClasserecordingback();
    	Thread.sleep(1000);
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
