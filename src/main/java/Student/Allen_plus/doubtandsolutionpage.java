package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class doubtandsolutionpage {
	
	@FindBy(xpath = "//span[normalize-space()='Doubt & Solution']")private WebElement Doubtsol; 
	
	
	public doubtandsolutionpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public boolean verifydoubtsolution() 
	{
		Doubtsol.click();
		boolean DS = Doubtsol.isEnabled();
		return DS ;
	}
}
