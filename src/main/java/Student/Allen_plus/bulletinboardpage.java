package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bulletinboardpage {

	@FindBy(xpath = "//span[normalize-space()='Bulletin Board']")private WebElement BulletinBoard; 
	@FindBy(xpath = "//span[@class='sidebar-icon assets bulletin']")private WebElement BulletinBoardicon;
	
	
	//span[@class='sidebar-icon assets bulletin'] <---icon
	public bulletinboardpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifybuletinboard() 
	{
		
		BulletinBoard.click();
		boolean BB = BulletinBoard.isEnabled(); 
		return BB;
	}
	
	public boolean validatebulletinicon() {
		
		boolean Bulletinicon = BulletinBoardicon.isDisplayed();
		return Bulletinicon;
	}
}
