package admin_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class admin_homepage {

	@FindBy(xpath="//select[@id='filterField']")
	private WebElement homedrop;
	
	public admin_homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void name() {
		
		homedrop.click();
	}
}
