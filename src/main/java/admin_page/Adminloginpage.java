package admin_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminloginpage {

	@FindBy(xpath="//input[@id='loginId']")
	private WebElement UN;
	@FindBy(xpath="//input[@id='password']")
	private WebElement PWD;
	@FindBy(xpath="//input[@id='loginSubmit']")
	private WebElement lgnbtn;
	
	public Adminloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpaddminusername(String Username) {
		
		UN.sendKeys(Username);
	}
	
	public void inpaddmipassword(String password) {
		
		UN.sendKeys(password);
	}
	
	public void clickloginbtn() {
		
		lgnbtn.click();
	}
}

