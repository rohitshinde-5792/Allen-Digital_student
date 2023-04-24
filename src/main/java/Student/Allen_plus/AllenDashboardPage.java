package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllenDashboardPage {
	@FindBy(xpath = "//*[@class='nav-link dropdown-toggle']")private WebElement profilename;
	
	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
	@FindBy(xpath = "//a[normalize-space()='Logout']") private WebElement logout;
	@FindBy(xpath = "//span[normalize-space()='Digital Material']") private WebElement digmtl;
	
	public AllenDashboardPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getprofilename() 
	
	{
		String actprofilename = profilename.getText();
		return actprofilename;
	}
	
	public boolean revisionButtonenabled_or_not() 
	
	{
		boolean aaaa = revisionB.isEnabled();
		return aaaa;
	}
	
	public boolean digitalmtlButtonenabled_or_not() 
	
	{
		boolean DM = digmtl.isEnabled();
		return DM;
		
	}
	public void logoutuser() 
	
	{
		profilename.click();
		logout.click();
	}
	
}
