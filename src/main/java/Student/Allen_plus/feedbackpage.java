package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class feedbackpage
{
	@FindBy(xpath = "//span[text()='Feedback']")
	private WebElement Feedback;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/info-icon-new.png']")
	private WebElement Feedbackibtn;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")
	private WebElement Feedbackibtnclose;
//	@FindBy(xpath = "//span[text()='Feedback']")private WebElement Feedback;
//	@FindBy(xpath = "//span[text()='Feedback']")private WebElement Feedback;
//	@FindBy(xpath = "//span[text()='Feedback']")private WebElement Feedback;
	
	public feedbackpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyfeedback() throws InterruptedException 
	{
		Feedback.click();
		Thread.sleep(2000);
		boolean FB = Feedback.isEnabled();	
		return FB;
	}
	
	public void validatefeedbaclibtn() throws InterruptedException {
		Feedbackibtn.click();
		Thread.sleep(1000);
	}
	
	public void validatefeedbaclibtnclose() {
		Feedbackibtnclose.click();
	}
	
}
