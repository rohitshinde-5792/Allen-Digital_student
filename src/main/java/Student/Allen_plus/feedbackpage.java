package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class feedbackpage
{
	@FindBy(xpath = "//*[text()='Feedback']")private WebElement Feedback;
	
	public feedbackpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyfeedback() 
	{
		Feedback.click();
		boolean FB = Feedback.isEnabled();	
		return FB;
	}
	
	
}
