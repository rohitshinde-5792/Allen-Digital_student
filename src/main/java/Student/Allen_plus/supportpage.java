package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class supportpage {
	
	@FindBy(xpath = "//*[text()='Support ']")private WebElement Support; 


	
	public supportpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public boolean veriftSupport() 
	{
		Support.click();
		boolean ST = Support.isEnabled(); return ST;		
	}
	
}
