package admintestclasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import Admin_library.adminBaseClass;
import Admin_library.adminUtilityClass;
import Student.Allen_plus.AllenLoginPage;
import Student_Lib.UtilityClass;
import admin_page.Adminloginpage;

public class logintest extends adminBaseClass{

	
	//int TCID
	Adminloginpage login;
	
	@BeforeClass
	public void Setup() throws IOException 
	
	{
		inilializebrowser();
		login = new Adminloginpage(driver);
	}

	public void verifylogin() throws IOException {
		
		login.inpaddminusername(adminUtilityClass.getadminPFdata("username"));
		login.inpaddmipassword(adminUtilityClass.getadminPFdata("pass"));
		login.clickloginbtn();
	
		
	}
}
