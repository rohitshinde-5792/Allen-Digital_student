package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testandreportpage {
	
	@FindBy(xpath = "//span[text()='Test and Reports ']")private WebElement TR;


	public testandreportpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
    public boolean verifytestreport() 
	
	{ 
    	//TR.click();
    	boolean testReport = TR.isEnabled(); 
    	return testReport;
    	
    }
}
