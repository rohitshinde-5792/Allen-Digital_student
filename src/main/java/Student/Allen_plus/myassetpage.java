package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myassetpage 

{
	@FindBy(xpath = "//*[text()='My Assets ']")private WebElement MyAssets; 
	
	public myassetpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public boolean validMyAssets() 
	
	{
		MyAssets.click();
		boolean MA = MyAssets.isEnabled(); 
		return MA;
	}
}
