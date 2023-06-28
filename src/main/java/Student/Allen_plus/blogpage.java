package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//QA
public class blogpage {
	
	@FindBy(xpath = "//*[text()='Blog']")private WebElement Blog;  
	
	
	public blogpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyBlogg() 
	
	{
		//Blog.click();
		boolean BG = Blog.isEnabled(); 
		return BG;
	}

}
