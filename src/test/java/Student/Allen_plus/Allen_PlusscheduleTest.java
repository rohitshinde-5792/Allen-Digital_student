package Student.Allen_plus;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Student_Lib.BaseClass;
import Student_Lib.UtilityClass;


public class Allen_PlusscheduleTest extends BaseClass 

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);

		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);
	}

//	@BeforeMethod
//	public void logintoapp() throws IOException, InterruptedException 
//	
//	{
//		
//		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
//		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
//		Thread.sleep(500);
//		//login1.enterCpt(null);
//		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
//		login1.clickOnLoginBtn();
//	    Thread.sleep(3000);
//	}
	
	@Test
	public void Verifyprofilename() throws IOException, InterruptedException 
	
	{
		TCID =101;	

		String actusername = home.getprofilename();
		String expusername = UtilityClass.getexceldata(0, 1);
		Assert.assertEquals(actusername, expusername,"Failed: Both User Names are different.");
		Thread.sleep(1000);
		
	}
	
	@Test
	public void verifylogoisdisplyed_or_not() 
	{
		TCID=102;
		boolean act = home.verifylogo();
		Assert.assertTrue(act);
		//
	}
	@Test
	public void verifystreamename() throws EncryptedDocumentException, IOException, InterruptedException 
	
	{
		TCID=103;
		String actcourse = home.validatestreamname();
		String expcourse = UtilityClass.getexceldata(1, 1);
		Assert.assertEquals(actcourse, expcourse);	
		//
    }
	@Test
	public void varifyschedule() throws EncryptedDocumentException, IOException 
	{
		TCID=104;
		String act = home.validatescheduletext();
		String exp = UtilityClass.getexceldata(3, 1);
		Assert.assertEquals(act, exp);
	}
	@Test
	public void verifybatchname() throws EncryptedDocumentException, IOException 
	{
		TCID=105;
	   String act = home.validatebatchname();
	   String exp = UtilityClass.getexceldata(4, 1);
	   Assert.assertEquals(act, exp);
	   
	}
	
	@Test
	public void verifynoticationbell() throws InterruptedException {
		TCID=106;
		boolean act = home.validatebell();
		Assert.assertTrue(act);
	}
	@Test
	public void verifyclassisScheduledORnot() throws EncryptedDocumentException, IOException {
		TCID=107;
		String act = home.validateclass();
		String exp = UtilityClass.getexceldata(6, 1);
		Assert.assertEquals(act, exp, "failed: class is scheduled");
		
	}
	@Test//(enabled =false)
	public void verifyNotificatontext() throws EncryptedDocumentException, IOException, InterruptedException {
		TCID=108;
		String act = home.validatenotificationtext();
		String exp = UtilityClass.getexceldata(7, 1);
		Assert.assertEquals(act, exp);
		Thread.sleep(1000);
		
	}
	@Test
	public void verify_i_button() throws EncryptedDocumentException, IOException {
		TCID=109;
		home.validate_I_btn();
		 String act = home.popupname();
		 String exp = UtilityClass.getexceldata(8, 1);
		Assert.assertEquals(act,exp,"pass:Schedule popup visible");
		home.popupclose();
		
	}
	@Test
	public void verifygreetingmsg() {
		TCID=110;
		 boolean act = home.validategreetingmsg();
		Assert.assertTrue(act);
		
	}
	@Test
	public void verifycurrentdate() {
		TCID=111;
		boolean act = home.validatecalenderdate();
		Assert.assertTrue(act);	
	}
	@Test
	public void verifyyourclass() throws InterruptedException {
		TCID=112;
		boolean act = home.validateyourclassbtn();
		Assert.assertTrue(act);
		home.clickyourclassbtn();
		Thread.sleep(1500);
		home.validateselectsub();
		Thread.sleep(1000);
		home.validateselecttopic();
		Thread.sleep(1000);
		home.clickyourclassapply();
		//Select s= new Select();
		Thread.sleep(4000);
	}
	@Test
	public void verifytodaybtn() throws InterruptedException {
		TCID=113;
		boolean act = home.validatetodaybutton();
		Assert.assertTrue(act);
		//Thread.sleep(1500);
	}
	@Test
	public void verifyaccesreq() throws InterruptedException {
		TCID=114;
		boolean act = home.validateaccessrequest();
		Assert.assertTrue(act);
		home.validateaccessreqcancel();
		
	}
	@Test
	public void validateappversion() {
		TCID=115;
		boolean act = home.validateversion();
		Assert.assertTrue(act);
		
	}
	@Test
	public void verifycalendervisible_or_not() {
		TCID=116;
		boolean act = home.validatecalender();
		Assert.assertTrue(act);
		
	}
	@Test
	public void verifyhomepageimage() {
		TCID=117;
		boolean act = home.validatehomepageimage();
		Assert.assertTrue(act, "failed: class is scheduled");
		
	}
	@Test
	public void verifysettingdropdown() throws InterruptedException {
		TCID=118;
		boolean act = home.validatesettingbtn();
		Assert.assertTrue(act);
	}
	@Test
	public void verifybackbtn() throws InterruptedException {
		TCID=119;
		boolean act = home.validatebackbtn();
		Assert.assertTrue(act);
	}
	@Test
	public void verifyrdeempoint() throws InterruptedException {
		TCID=120;
		boolean act = home.validateredeempoint();
		Assert.assertTrue(act);
	}
	
//	@Test
//	public void name() {
//		
//		UtilityClass.scrollDown(driver);
//	}
	@AfterMethod
	public void appLogout(ITestResult result) throws IOException, InterruptedException
	{
     if(result.getStatus()==ITestResult.FAILURE)

	{
	   UtilityClass.captureSS(driver, TCID);
	}
	
     // home.logoutuser();
	}
	
	@AfterClass
	public void logoutApp()
	{
		home.logoutuser();
	     driver.quit();
	}

}
