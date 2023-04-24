package Student.Allen_plus;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import Student_Lib.BaseClass;
import Student_Lib.UtilityClass;

public class Alln_pluslogintest extends BaseClass
{
	int TCID;
	AllenLoginPage login1;

	@BeforeClass
	public void Setup() throws IOException 
	
	{
		inilializebrowser();
		login1 = new AllenLoginPage(driver);
	}

	public void verifylogin() throws IOException {
		login1.inpAllenFormNumber(UtilityClass.getPFdata("fnumber"));
		login1.inpAllenPassword(UtilityClass.getPFdata("pass"));
		login1.enterCpt(UtilityClass.getPFdata("master_cpt"));
		login1.clickOnLoginBtn();
		
	}
	
}
