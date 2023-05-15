package admintestclasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import Admin_library.adminBaseClass;
import Admin_library.adminUtilityClass;
import admin_page.Adminloginpage;
import admin_page.admin_homepage;

public class hometset extends adminBaseClass {

	
	
	admin_homepage home;
	Adminloginpage login;
	
	@BeforeClass
	public void Setup() throws IOException 
	
	{
		inilializebrowser();
		login = new Adminloginpage(driver);
		
		login.inpaddminusername(adminUtilityClass.getadminPFdata("username"));
		login.inpaddmipassword(adminUtilityClass.getadminPFdata("pass"));
		login.clickloginbtn();
	
	}
}
