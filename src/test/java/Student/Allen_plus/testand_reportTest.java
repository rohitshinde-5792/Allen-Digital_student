package Student.Allen_plus;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Student_Lib.BaseClass;
import Student_Lib.UtilityClass;

public class testand_reportTest extends BaseClass 

{
	
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	testand_reportpage testandreport;
//	ChromeOptions op=new ChromeOptions();

	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		 inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
		testandreport=new testand_reportpage(driver);

		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		Thread.sleep(2000);
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);         //increase implicitly wait	

}
	
	@Test(priority=0)
	public void verifytestandreport() {
		
		testandreport.validatetestandreport();
	}
	
	@Test(priority=1)
	public void verifytestandreporttext() {
		
		testandreport.validatetestandreporttext();
	}
	
	@Test(priority=2)
	public void verifytestandreportibtn() {
		
		testandreport.validatetestibtn();
		testandreport.validateibtnclose();
	}
	
	@Test(priority=3)
	public void verifytestandreportimprove() {
		
		testandreport.validateimprove();
	}
	
	@Test(priority=4)
	public void verifytestandreportimprovetext() {
		
		testandreport.validateimprovetext();
	}
	
	@Test(priority=5)
	public void verifytestandreportchance() {
		
		testandreport.validatechance();
	}
	
	@Test(priority=6)
	public void verifytestandreportchancetext() {
		
		testandreport.validatechancetext();
	}
	
	@Test(priority=7)
	public void verifytestandreportmytest() {
		
		testandreport.validatemytest();
	}
	
	@Test(priority=8)
	public void verifytestandreportmytesttext() {
		
		testandreport.validatemytesttext();
	}
	
	
	@Test(priority=9)
	public void verifytestandreportreport() {
		
		testandreport.validateReports();
	}
	
	@Test(priority=10)
	public void verifytestandreportreporttext() {
		
		testandreport.validateReportstext();
	}
	
	@Test(priority=11)
	public void verifytestandreportreportfilter() throws InterruptedException {
		
		testandreport.validatefilter();
		testandreport.validatefilterclose();
	}
	
	@Test(priority=12)
	public void verifytestandreporttopicanalysis() throws InterruptedException {
		
		testandreport.validatatopicanalysis();	
	}
	
	@Test(priority=13)
	public void verifytestandreporttopicanalysistext() throws InterruptedException {
		
		testandreport.validatatopicanalysistext();	
	}
	
	@Test(priority=14)
	public void verifytestandreportreportcard() throws InterruptedException {
		
		testandreport.validateReportcard();	
	}
	
	@Test(priority=15)
	public void verifytestandreportreportcardtext() throws InterruptedException {
		
		testandreport.validateReportcardtext();	
	}
	
	@Test(priority=16)
	public void verifytestandreporttestreports() throws InterruptedException {
		
		testandreport.validatetestreports();	
	}
	
	@Test(priority=17)
	public void verifytestandreporttestreportstext() throws InterruptedException {
		
		testandreport.validatetestreportstext();	
	}
	
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