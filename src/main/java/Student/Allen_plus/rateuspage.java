package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rateuspage {

	
	@FindBy(xpath = "//*[text()='Rate us']")private WebElement RateUs;


	public rateuspage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyRateUs() 
	{
		//RateUs.click();
		boolean RU = RateUs.isEnabled();
		return RU;
	}
}
