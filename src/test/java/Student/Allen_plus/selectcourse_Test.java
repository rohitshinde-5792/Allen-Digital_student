package Student.Allen_plus;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import Student_Lib.BaseClass;
import Student_Lib.UtilityClass;

public class selectcourse_Test extends BaseClass {

	int TCID;
	AllenLoginPage login1;
	selectsessionpage session;
	@BeforeClass
	public void Setup() throws IOException 
	
	{
		inilializebrowser();
		session = new selectsessionpage(driver);
	}

	public void verifylogin() throws IOException, InterruptedException {
		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
		
		
		session.clicksession();
		Thread.sleep(1000);
		session.clickselectbtn();
	}
	
	
}
