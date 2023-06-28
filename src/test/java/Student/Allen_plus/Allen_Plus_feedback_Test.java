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
public class Allen_Plus_feedback_Test extends BaseClass {

	int TCID;
	AllenLoginPage login1;
	feedbackpage feedback;
	AllenschedulePage home;
	
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		inilializebrowser();
		feedback=new feedbackpage(driver);
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
		
		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);
	}
	
	
	
	@Test(priority=0)
	public void verifyfeedback() throws InterruptedException 
	
	{
		TCID=701;
		boolean act = feedback.verifyfeedback();
		Assert.assertTrue(act);
	}
	
	@Test(enabled =false)
	public void verifyfeedbackibtn() throws InterruptedException 
	
	{
		TCID=702;
		feedback.validatefeedbaclibtn();
		feedback.validatefeedbaclibtnclose();
		
	}
	@Test (enabled =false)
	public void verifyfeedbackopen() {
		
		feedback.validatefeedbackopen();
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
