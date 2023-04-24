package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class digitalmaterialpage {
	
	
	@FindBy(xpath = "//span[normalize-space()='Digital Material']") private WebElement digmtl;
	
	public digitalmaterialpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	

	
public boolean digitalmtlButtonenabled_or_not() 
	
	{  
	digmtl.click();
	boolean DM = digmtl.isEnabled(); 
	return DM; 
	}
	
}
