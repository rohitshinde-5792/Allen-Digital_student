package Student.Allen_plus;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
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

// QA
public class Allen_PlusscheduleTest extends BaseClass 

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	//selectsessionpage session;
	ChromeOptions op=new ChromeOptions();

	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		 inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
		//session = new selectsessionpage(driver);
	
	
		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		Thread.sleep(2000);
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);         //increase implicitly wait
	    
//	      session.clicksession();
//	      session.clickselectbtn();
//	  driver.navigate().refresh();
	   
	}

//	@Test(priority=-2)
//	public void verifyloginpopupclose() {
//		
//		home.popupclose();
//	}
	
	
	@Test(enabled=false)
	public void verifyschedulejoinclass() throws InterruptedException {
		
		home.validatejoinclassbtn();
		//ChromeOptions op=new ChromeOptions();
		op.addArguments("use-fake-ui-for-media-stream");
		driver=new ChromeDriver(op);
		//home.joinclassacc(driver);
		home.validatesecjoinclassbtn();
	}
	
	@Test(enabled=false)
	public void login1() throws IOException, InterruptedException {
		
		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("wpass"));
		login1.enterCpt(UtilityClass.getPFdata("wmaster_cpt"));
		Thread.sleep(2000);
		login1.clickOnLoginBtn();
		
	}
	@Test(priority=-1)
	public void Verifyscheduleprofilename() throws IOException, InterruptedException 
	
	{
		TCID =101;	
		String actusername = home.getprofilename();
		String expusername = UtilityClass.getexceldata(0, 3);
		Assert.assertEquals(actusername, expusername,"Failed: Both User Names are different.");
		Thread.sleep(1000);	
	}
	
	@Test(priority=0)
	public void verifyschedulelogoisdisplyed_or_not() 
	{
		TCID=102;
		boolean act = home.verifylogo();
		Assert.assertTrue(act);
		
	}
	@Test(priority=1)
	public void verifyschedulestreamename() throws EncryptedDocumentException, IOException, InterruptedException 
	
	{
		TCID=103;
		String actcourse = home.validatestreamname();
		String expcourse = UtilityClass.getexceldata(1, 1);
		Assert.assertEquals(actcourse, expcourse);	
		
    }
	@Test(priority=2)
	public void varifyscheduletext() throws EncryptedDocumentException, IOException 
	{
		TCID=104;
		String act = home.validatescheduletext();
		String exp = UtilityClass.getexceldata(3, 1);
		Assert.assertEquals(act, exp);
	}
	@Test(enabled=false)
	public void verifyschedulebatchnametext() throws EncryptedDocumentException, IOException 
	{
		TCID=105;
	   String act = home.validatebatchname();
	   String exp = UtilityClass.getexceldata(4, 1);
	   Assert.assertEquals(act, exp);
	   
	}
	
	@Test(priority=4)
	public void verifynoticationbelldisplyed_or_not() throws InterruptedException {
		TCID=106;
		boolean act = home.validatebell();
		Assert.assertTrue(act);
	}
	@Test(priority=5)
	public void verifyscheduleclassisScheduledORnot() throws EncryptedDocumentException, IOException {
		TCID=107;
		String act = home.validateclass();
		String exp = UtilityClass.getexceldata(6, 1);
		Assert.assertEquals(act, exp, "failed: class is scheduled");
		
	}
	@Test(priority=6)
	public void verifyscheduleNotificatontext() throws EncryptedDocumentException, IOException, InterruptedException {
		TCID=108;
		 boolean act = home.validatenotificationtext();
		Assert.assertTrue(act);
		Thread.sleep(1000);
		
	}
	@Test(priority=7)
	public void verifyschedule_i_button_and_popupname() throws EncryptedDocumentException, IOException {
		TCID=109;
		home.validate_I_btn();
		 String act = home.popupname();
		 String exp = UtilityClass.getexceldata(8, 1);
		Assert.assertEquals(act,exp,"pass:Schedule popup visible");
		home.popupclose();
		
	}
	@Test(priority=8)
	public void verifyschedulegreetingmsgdisplayed_or_not() {
		TCID=110;
		 boolean act = home.validategreetingmsg();
		Assert.assertTrue(act);
		
	}
	@Test(priority=9)
	public void verifyschedulecurrentdatedisplayed_or_not() {
		TCID=111;
		boolean act = home.validatecalenderdate();
		Assert.assertTrue(act);	
	}
	
	@Test(priority=10)
	public void verifyscheduleclassrecording() throws InterruptedException {
		TCID=112;
		boolean act = home.validateclassrecordingbtn();
		Assert.assertTrue(act);
		home.clickclassrecordingbtn();
		Thread.sleep(1500);
		home.validateselectsub();
		Thread.sleep(1000);
		home.validateselecttopic();
		Thread.sleep(1000);
		home.clickyourclassapply();
		Thread.sleep(7000);
		home.validateyourclassback();
	}
	@Test(priority=11)
	public void validatescheduleclassrecordingtext() throws EncryptedDocumentException, IOException {
		
		 String act = home.validateclassrecordingbtntext();
		 String exp = UtilityClass.getexceldata(10, 1);
		 Assert.assertEquals(act, exp);
	}
	@Test(priority=12)
	public void verifyscheduletodaybtn() throws InterruptedException {
		TCID=113;
		boolean act = home.validatetodaybutton();
		Assert.assertTrue(act);
	}
	@Test(priority=13)
	public void verifyscheduletodaybuttontext() throws EncryptedDocumentException, IOException {
		
		String abc = home.validatetodaybtntext();
		String exp = UtilityClass.getexceldata(9, 1);
		Assert.assertEquals(abc, exp);
	}
	@Test(priority=14)
	public void verifyscheduleaccesreq() throws InterruptedException {
		TCID=114;
		boolean act = home.validateaccessrequest();
		Assert.assertTrue(act);
		home.validateaccessreqcancel();
		
	}
	@Test//(enabled=false)
	public void verifyscheduleaccesreqpage() throws InterruptedException {
		 home.clickonaccessreq();
		String act = home.validateaccessrequestpage();
		String exp="Select max four expired dates";
				Assert.assertEquals(act, exp);
				home.validateaccessreqcancel();
	}
	
	@Test(priority=15)
	public void verifyscheduleaccessreqbtntext() throws EncryptedDocumentException, IOException {
		
		String abc = home.validateaccessreqtext();
		String exp = UtilityClass.getexceldata(11, 1);
		Assert.assertEquals(abc, exp);
	}
	@Test(priority=16)
	public void validatescheduleappversiondisplayed_or_not() {
		TCID=115;
		boolean act = home.validateversion();
		Assert.assertTrue(act);
		
	}
	
	@Test(priority=17)
	public void verifycalendervisible_or_not() {
		TCID=116;
		boolean act = home.validatecalender();
		Assert.assertTrue(act);
		
	}
	@Test(priority=18)
	public void verifyhschedulepageimagedisplayed_or_not() {
		TCID=117;
		boolean act = home.validatehomepageimage();
		Assert.assertTrue(act, "failed: class is scheduled");
		
	}
	@Test(enabled=false)
	public void verifyschedulesettingdropdown() throws InterruptedException {
		TCID=118;
		boolean act = home.validatesettingbtn();
		Assert.assertTrue(act);
	}
	
	@Test(enabled=false)
	public void verifyschedulechangepasstext() throws EncryptedDocumentException, IOException {
		
		String act = home.validatechangepass();
		String exp = UtilityClass.getexceldata(17, 1);
		Assert.assertEquals(act, exp);
	}
	
	@Test(enabled=false)
	public void verifyschedulestudydroptext() throws EncryptedDocumentException, IOException {
		
		String act = home.validatestudydrop();
		String exp = UtilityClass.getexceldata(18, 1);
		Assert.assertEquals(act, exp);
	}
	@Test(priority=22)
	public void verifyschedulesidepanelclosebtn() throws InterruptedException {
		TCID=119;
		boolean act = home.validatebackbtn();
		Assert.assertTrue(act);
	}
	
	@Test(priority=23)
	public void verifynotification9pluscountdisplayed_or_not() throws InterruptedException {
		TCID=119;
		boolean act = home.validateNotificationcount9();
		Assert.assertTrue(act);
	}
	@Test(enabled=false)
	public void verifyschedulerdeempoint() throws InterruptedException {
		TCID=120;
		boolean act = home.validateredeempoint();
		Assert.assertTrue(act);
		
	}
//	@Test(priority=18)
//	public void verifyearnedpointtext() throws InterruptedException, EncryptedDocumentException, IOException {
//		
//		home.validateredeempoint();
//		String actearn = home.validateearnedpointtext();
//		String expearn = UtilityClass.getexceldata(13, 1);
//		Assert.assertEquals(actearn, expearn);
//}	
	
	
//	@Test(priority=19)
//	public void verifyusedtext() throws EncryptedDocumentException, IOException {
//		
//	
//		String actused = home.validateusedtext();
//		String expused = UtilityClass.getexceldata(14, 1);
//		Assert.assertEquals(actused, expused);
//}	
	
	@Test(enabled=false)
	public void verifyschedulehistorytext() throws EncryptedDocumentException, IOException {
		
	
		String acthistory = home.validatehistorytext();
		String exphistory = UtilityClass.getexceldata(15, 1);
		Assert.assertEquals(acthistory, exphistory);
	}
	@Test(enabled=false)
	public void verifyscheduleleave() {
		
		home.validateleave();
		home.validateleaveback();
		home.validateapplyleave();
		home.validateleavereason();
		home.validateleaveclose();
	}
	
//	@Test(priority=18)
//	public void verifycurrentnotificationcount() throws InterruptedException {
//		TCID=121;
//		 String act = home.validatecurrentnotificationcount();
//		System.out.println(act);
//	}
	
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
