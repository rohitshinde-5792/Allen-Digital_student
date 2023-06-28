package Student.Allen_plus;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Student_Lib.BaseClass;
import Student_Lib.UtilityClass;


public class dataprovider_login_test extends BaseClass {
	
	AllenLoginPage login1;
	AllenschedulePage home;
	
	@AfterMethod
	public void applogout() {
		
		driver.quit();
	}
	
	@Test(dataProvider="datasupplier")
	public void testLogin(String formnumber, String Password, String capcha) throws IOException, InterruptedException {
		
			inilializebrowser();
			login1 = new AllenLoginPage(driver);
			home = new AllenschedulePage(driver);
			
			login1.inpAllenFormNumber(formnumber);
			login1.inpAllenPassword(Password);
			login1.enterCpt(capcha);
			  Thread.sleep(1000);
			login1.clickOnLoginBtn();
				
		   String act = home.validatescheduletext();
			String exp = UtilityClass.getexceldata(3, 1);
			Assert.assertEquals(act, exp);
	}
	
	@DataProvider
	public Object[][] datasupplier() {
		
		Object[][] data= {{"dumst15","dstd#123","susr"},  //2 valid
				          {"dust15","dstd#123","susr"},
				          {"dumst15","dstd123","sus"},
				          {"dumst17","dstd#123","susr"},
				          {"","dstd#123","susr"},
				          {"dumst17","","susr"},
				          {"dumst17","dstd#123",""},
				          {"","",""}};
		
		return data;
	}
	
	
}
