package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class quizpage {
	
	@FindBy(xpath = "//*[text()='Quiz']")private WebElement Quiz; 
	
	
	public quizpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyquiz() 
	{
		Quiz.click();
		boolean QZ = Quiz.isEnabled();
		return QZ;
		
	}

}
