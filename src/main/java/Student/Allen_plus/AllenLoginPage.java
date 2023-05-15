package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllenLoginPage{
	
	@FindBy(xpath = "(//input[@name='user'])[1]")
	private WebElement FN;
	
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement FPWD;
	
	@FindBy(xpath = "//input[@id='reg-code']")
	private WebElement CPC;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement LBTN;
	
	
	
	public AllenLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpAllenFormNumber(String fnumber) 
	
	{
		FN.clear();
		FN.sendKeys(fnumber);
	}
	public void inpAllenPassword(String pass) 
	{
		FPWD.clear();
		FPWD.sendKeys(pass);
	}
	public void enterCpt(String master_cpt) 
	{
		CPC.clear();
		CPC.sendKeys(master_cpt);
	}
	public void clickOnLoginBtn() 
	{
		LBTN.click();
	}
	
}
