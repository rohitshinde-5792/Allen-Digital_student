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
		boolean Obje = doubtsolution.verifydoubtsolution();
		Assert.assertTrue(Obje);
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void verifydoubtsolution_i_btn() throws InterruptedException {
		TCID=502;
		doubtsolution.validate_i_btn();
	}
	
	@Test(priority=2)
	public void verifydoubtsolutionaksdoubtbtn() throws InterruptedException {
		TCID=503;
		doubtsolution.validateAskdoubtbtn();
	}
	
	@Test(priority=3)
	public void verifydoubtsolutionfilter() throws InterruptedException {
		TCID=504;
		doubtsolution.validatefilter();
	}
	
	@Test(priority=4)
	public void verifyunresolvedoubt() throws InterruptedException {
		TCID=505;
		boolean act = doubtsolution.validateunresolvedoubt();
		Assert.assertTrue(act);
		
	}
	@Test(priority=5)
	public void verifydoubtsolutionunresolvedwithsolution() throws InterruptedException {
		TCID=506;
		boolean act = doubtsolution.validateunresolvewithsolution();
		Assert.assertTrue(act);
	}
	
	@Test(priority=6)
	public void verifydoubtsolutionresolvddoubts() {
		TCID=507;
		 boolean act = doubtsolution.validateresolve();
		Assert.assertTrue(act);
	}
	@Test(priority=7)
	public void verifydoubtsolutionBrodcast() throws InterruptedException {
		TCID=508;
		boolean act = doubtsolution.validatebrodcast();
		Assert.assertTrue(act);
	}
	@Test(priority=8)
	public void verifydoubtsolutionBrodcast_i_btn() throws InterruptedException {
		TCID=509;
		doubtsolution.validatebrod_i_btn();
		
	}
	@Test(priority=9)
	public void verifydoubtsolutionsavedBrodcast() throws InterruptedException {
		TCID=510;
		boolean act = doubtsolution.validatesavedBrodcast();
		Assert.assertTrue(act);
		
	}
	
	@Test(priority=10)
	public void verifydoubtsolutionexercise() throws InterruptedException {
		TCID=511;
		boolean act = doubtsolution.validateexcercise();
		Assert.assertTrue(act);
	}
	
	@Test(priority=11)
	public void verifydoubtsolutionibtn() throws InterruptedException {
		TCID=512;
		doubtsolution.validate_exe_i_btn();
	}
	
	@Test(priority=12)
	public void verifydoubtsolutionexercisesubject() throws InterruptedException {
	//try {
		TCID=513;
		
		doubtsolution.validateexselectsubject();
		//doubtsolution.validateMathsubjectselect();
	}
	
//	catch (Exception e){
//		System.out.println("No such element tc 513");
//		//throw(e);
//		} 
//	}
	
	
	@Test(priority=13)
	public void verifydoubtsolutionexercisetopic() throws InterruptedException {
		TCID=512;
		doubtsolution.validateexselecttopic();
		//doubtsolution.validatemathtopic();
	}
	
	@Test(priority=14)
	public void verifydoubtsolutionexerciseapply() throws InterruptedException {
		TCID=513;
		doubtsolution.validateexapplybtn();
	}
	

	@Test(priority=15)
	public void verifydoubtsolutionrace() throws InterruptedException {
		
		TCID=514;
		boolean act = doubtsolution.validaterace();
		Assert.assertTrue(act);
		
	}
	
	@Test(priority=16)
	public void verifydoubtsolutionraceibtn() throws InterruptedException {
		
		
		doubtsolution.validaterace_ibtn();
		
	}
	
	@Test(priority=17)
	public void verifydoubtsolutionracesubject() throws InterruptedException {
		
		
		doubtsolution.validateracesubject();
		
	}
	
	@Test(priority=18)
	public void verifydoubtsolutionracetopic() throws InterruptedException {
		
		
		doubtsolution.validateexselecttopic();
		
	}
	
	@Test(priority=19)
	public void verifydoubtsolutionraceracevideo() throws InterruptedException {
		
		
		doubtsolution.validateracevideo();
		doubtsolution.validateraceapplybtn();
		Thread.sleep(5000);
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
