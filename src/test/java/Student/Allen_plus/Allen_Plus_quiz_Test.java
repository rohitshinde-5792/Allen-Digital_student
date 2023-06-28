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
public class Allen_Plus_quiz_Test extends BaseClass 

{
	int TCID;
	AllenLoginPage login1;
	AllenschedulePage home;
	quizpage quiz;
	
	@BeforeClass
	public void Setup() throws IOException, InterruptedException 
	
	{
		
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
		home = new AllenschedulePage(driver);
	    quiz=new quizpage(driver);
	   
	    login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		Thread.sleep(500);
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
	    Thread.sleep(3000);
	   
	}
	
	@Test(priority=0)
	public void verifyquiz() 
	
	{
		TCID=801;
		boolean act = quiz.verifyquiz();
		Assert.assertTrue(act);
	}
	
	@Test(priority=1)
	public void verifyquizibtn() throws InterruptedException 
	{
		TCID=802;

		quiz.validateIbtn();
		quiz.validateIbtn_close();
		
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
