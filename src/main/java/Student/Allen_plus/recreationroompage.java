package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class recreationroompage {
	
	@FindBy(xpath = "//*[text()='Recreation Room']")private WebElement RecreationRoom; 


	
	public recreationroompage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	

	public boolean verifyRecreationRoom() 
	{
		
		RecreationRoom.click();
		
		boolean RR = RecreationRoom.isEnabled(); 
		return RR;
	}
}
