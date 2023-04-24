package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage 

{
	@FindBy(xpath = "//a[normalize-space()='Logout']") private WebElement logout;
	@FindBy(xpath = "//li[@class='nav-item profile mr-2 ml-2']//a")private WebElement profilename;
	
	public logoutpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
public void logoutuser() 
	
	{
		profilename.click(); 
		logout.click();
	}

}
