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

public class Allen_Plus_doubtsolution_Test extends BaseClass 

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	doubtandsolutionpage doubtsolution;
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    doubtsolution=new doubtandsolutionpage(driver);  
	    login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
		
		Thread.sleep(1500);
	}
	
	
	
	@Test(priority=0)
	public void verifydoubtsolution() throws InterruptedException 
	
	{
		TCID=501;
		boolean acta = doubtsolution.verifydoubtsolution();
		Assert.assertTrue(acta);
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void verify_i_btn() throws InterruptedException {
		TCID=502;
		doubtsolution.validate_i_btn();
	}
	@Test(priority=2)
	public void verifyaksdoubtbtn() throws InterruptedException {
		TCID=503;
		doubtsolution.validateAskdoubtbtn();
	}
	
	@Test(priority=3)
	public void verifyfilter() {
		TCID=504;
		doubtsolution.validatefilter();
	}
	
	@Test(priority=4)
	public void verifyunresolvedoubt() {
		TCID=505;
		doubtsolution.validateunresolvedoubt();
	}
	@Test(priority=5)
	public void verifyunresolvedwithsolution() {
		TCID=506;
		doubtsolution.validateunresolvewithsolution();
	}
	@Test(priority=6)
	public void verifyresolvddoubts() {
		TCID=507;
		doubtsolution.validateresolve();
	}
	@Test(priority=7)
	public void verifyBrodcast() {
		TCID=508;
		doubtsolution.validatebrodcast();
		
	}
	@Test(priority=8)
	public void verifyBrodcast_i_btn() throws InterruptedException {
		TCID=509;
		doubtsolution.validatebrod_i_btn();
		
	}
	@Test(priority=9)
	public void verifysavedBrodcast() throws InterruptedException {
		TCID=510;
		doubtsolution.validatesavedBrodcast();
		
	}
	
	@Test(priority=10)
	public void verifyexercise() throws InterruptedException {
		TCID=511;
		doubtsolution.validateexcercise();
		
	}
	@Test(priority=11)
	public void verifyibtn() throws InterruptedException {
		TCID=512;
		doubtsolution.validate_exe_i_btn();
	}
	@Test(priority=12)
	public void verifyexercisesubject() throws InterruptedException {
		TCID=513;
		
		doubtsolution.validateexselectsubject();
	}
	
	@Test(priority=13)
	public void verifyexercisetopic() throws InterruptedException {
		TCID=512;
		doubtsolution.validateexselecttopic();
		
	}
	
	@Test(priority=14)
	public void verifyexerciseapply() throws InterruptedException {
		TCID=513;
		doubtsolution.validateexapplybtn();
	}
	

	@Test(priority=15)
	public void verifyrace() throws InterruptedException {
		TCID=514;
		doubtsolution.validaterace();
		doubtsolution.validaterace_ibtn();
		doubtsolution.validateracesubject();
		doubtsolution.validateexselecttopic();
		doubtsolution.validateracevideo();
		doubtsolution.validateraceapplybtn();
	
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
