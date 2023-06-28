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
//QA
public class Allen_Plus_digitalmtl_Test extends BaseClass

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	digitalmaterialpage digitalmtl;
	doubtandsolutionpage doubtsolution;
	//selectsessionpage session;
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    digitalmtl=new digitalmaterialpage(driver); 
	    doubtsolution=new doubtandsolutionpage(driver); 
	   // session = new selectsessionpage(driver);
	    
	    login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(2000);
	    
//	      session.clicksession();
//		  session.clickselectbtn();
	}
	
	
	@Test(priority = 1)
	public void verifydigitalmtlButtonenabled_or_not() throws InterruptedException 
	
	{
		TCID=301;
		boolean act = digitalmtl.digitalmtlButtonenabled_or_not();
		Assert.assertTrue(act);
		 Thread.sleep(2000);
		// digitalmtl.validateopenstudymtlpdf();
	}
	@Test(priority = 2)
	public void verifydigitalmtltext() throws EncryptedDocumentException, IOException {
		
		String act = digitalmtl.validatedigitalmtltext();
		String exp = UtilityClass.getexceldata(22, 1);
		Assert.assertEquals(act, exp);
	}
	@Test(priority = 3)
	public void validatedigitalmtl_i_btn() throws InterruptedException 
	{
		TCID=302;
		digitalmtl.validate_i_btn();
		Thread.sleep(1000);
	}
	@Test(priority =4)
	public void verifydigitalmtlsearchbox() throws InterruptedException {
		
		TCID=303;
		boolean act = digitalmtl.validatesearchbtn();
		Assert.assertTrue(act);
		Thread.sleep(1000);
	}
	@Test(priority = 5)
	public void verifydigitalmtlfilter() throws InterruptedException {
		TCID=304;
		digitalmtl.validatefilter();
	}
	@Test(priority = 6)
	public void verifydigitalmtlmaintitle() throws InterruptedException {
		boolean act = digitalmtl.validatemaintitle();
		Assert.assertTrue(act);
		Thread.sleep(1000);
	}
	@Test(priority = 7)
	public void verifydigitalmtlexersice() throws InterruptedException {
		
		boolean act = digitalmtl.validateexercise();
		Assert.assertTrue(act);
		Thread.sleep(1000);
		
	}
	@Test(priority = 8)
	public void verifydigitalmtlexersicetext() throws EncryptedDocumentException, IOException {
		
		String act = digitalmtl.validateexercise_text();
		String exp = UtilityClass.getexceldata(24, 1);
		Assert.assertEquals(act, exp);
	}
	
    @Test(priority = 9)
	public void verifydigitalmtlrace() throws InterruptedException {
		
		digitalmtl.validaterace();
		Thread.sleep(1000);
	
	}
    @Test(priority = 10)
    public void verifydigitalmtlracetext() throws EncryptedDocumentException, IOException {
		
    	String act = digitalmtl.validaterace_text();
    	String exp = UtilityClass.getexceldata(25, 1);
    	Assert.assertEquals(act, exp);
	}
    
    @Test(priority = 11)
    public void verifydigitalmtlspacialbooklet() throws InterruptedException {
    	
    	digitalmtl.validateSpecialBooklet();
    	Thread.sleep(1000);
		
	}
    @Test(priority = 12)
    public void verifydigitalmtlspacialbooklettext() throws EncryptedDocumentException, IOException {
		
    	String act = digitalmtl.validateSpecialBooklet_text();
    	String exp = UtilityClass.getexceldata(26, 1);
    	Assert.assertEquals(act, exp);
    	
	}
    
    @Test(priority = 13)
    public void verifydigitalmtlclassnote() throws InterruptedException {
    	
    	digitalmtl.validateclassnotes();
    	Thread.sleep(1000);
		
	}
    @Test(priority = 14)
    public void verifydigitalmtlclassnotetext() throws EncryptedDocumentException, IOException {
		
    	String act = digitalmtl.validateclassnotes_text();
    	String exp = UtilityClass.getexceldata(27, 1);
    	Assert.assertEquals(act, exp);
	}
    @Test(priority = 15)
    public void verifydigitalmtlrecordedcon() throws InterruptedException {
		
    	digitalmtl.validateRecordedContent();
    	digitalmtl.validateRecordedContentback();
    	Thread.sleep(1000);
	}
    @Test(priority = 16)
    public void verifydigitalmtlrecordedcontext() throws EncryptedDocumentException, IOException {
		
    	String act = digitalmtl.validateRecordedContent_text();
    	String exp = UtilityClass.getexceldata(28, 1);
    	Assert.assertEquals(act, exp);
	}
    @Test(priority = 17)
    public void verifydigitalmtlracevideosol() throws InterruptedException {
		
    	boolean act = digitalmtl.validateracevideosolution();
    	Thread.sleep(1000);
    	digitalmtl.validateracevideoback();
    	Assert.assertTrue(act);
    	Thread.sleep(1000);
    	//digitalmtl.validateracevideoback();
    	Thread.sleep(1000);
    	
	}
  
    @Test(priority = 18) 
    public void verifydigitalmtlracevideosoltext() throws EncryptedDocumentException, IOException {
		
    	String act = digitalmtl.validateracevideosolution_text();
    	String exp = UtilityClass.getexceldata(29, 1);
    	Assert.assertEquals(act, exp);
	}
   
    @Test(priority = 19)
    public void verifydigitalmtlexercisevidsol() throws InterruptedException {
		
    	digitalmtl.validateexercisevideo();
    	Thread.sleep(1000);
    	digitalmtl.validateexercisevideoback();
    	//Thread.sleep(1000);
    	//doubtsolution.validateexercisevideoback();   for exercise video back from digi mtl page
	}
    @Test(priority = 20)
    public void verifydigitalmtlexercisevidsoltext() throws EncryptedDocumentException, IOException {
		
    	String act = digitalmtl.validateexercisevideo_text();
    	String exp = UtilityClass.getexceldata(30, 1);
    	Assert.assertEquals(act, exp);
	}
    @Test(priority = 21)
    public void verifydigitalmtlclassrecording() throws InterruptedException {
		
    	digitalmtl.validateClassRecordings();
    	Thread.sleep(1000);
    	digitalmtl.validateClasserecordingback();
    	Thread.sleep(1000);
	}
    @Test(priority = 22)
    public void verifydigitalmtlclassrecordingtext() throws EncryptedDocumentException, IOException {
		
    	String act = digitalmtl.validateClassRecordings_text();
    	String exp = UtilityClass.getexceldata(31, 1);
    	Assert.assertEquals(act, exp);
	}
    @Test(priority = 23)
    public void verifydigitalmtlstudymaterial() throws InterruptedException, EncryptedDocumentException, IOException {
    	
		
    	digitalmtl.validatestudymaterial();
    	
    	String act = digitalmtl.validatestudymaterialtext();
    	String exp = UtilityClass.getexceldata(23, 1);
    	Assert.assertEquals(act, exp);
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
