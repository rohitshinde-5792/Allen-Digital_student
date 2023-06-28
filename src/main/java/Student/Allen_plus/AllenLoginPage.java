package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//QA
public class AllenLoginPage{
	
	@FindBy(xpath = "(//input[@name='user'])[1]")
	private WebElement FN;
	
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement FPWD;
	
	@FindBy(xpath = "//input[@id='reg-code']")
	private WebElement CPC;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement LBTN;
	
	@FindBy(xpath = "//a[@class='Forget-Password-']")
	private WebElement forgotpass;
	
	@FindBy(xpath = "(//img[@src='https://dvvwf08ea9qan.cloudfront.net/allenplus3/assets/images/AllenLogo.png'])[1]")
	private WebElement loginpagelogo;
	
	
	
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
	
	public boolean validateforgotpass() {
		
		boolean act = forgotpass.isEnabled();
		return act;
	}
	
	public boolean validateloginpagelogo() {
		
		boolean act = loginpagelogo.isDisplayed();
		return act;
	}
	
	public boolean validateloginbtn() {
		boolean act = LBTN.isEnabled();
		return act;
	}
}
