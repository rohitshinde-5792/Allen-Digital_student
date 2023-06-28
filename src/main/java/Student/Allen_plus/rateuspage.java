package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//QA
public class rateuspage {

	
	@FindBy(xpath = "//span[text()='Rate us']")
	private WebElement RateUs;
	@FindBy(xpath ="(//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/blank_star.png'])[3]")
	private WebElement rateusstar;
	@FindBy(xpath = "//div//button[@class='btn btn-cancel not-now-btn']")
	private WebElement notnow;
	
	public rateuspage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyRateUs() 
	{
		RateUs.click();
		boolean RU = RateUs.isEnabled();
		return RU;
	}
	
	public void validatestars() {
		
		rateusstar.click();
	}
	
	public void validateNotnow() {
		
		notnow.click();
	}
}
