package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class quizpage {
	
	@FindBy(xpath = "//*[text()='Quiz']")
	private WebElement Quiz; 
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")
	private WebElement Quiz_ibtn; 
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")
	private WebElement Quiz_ibtnclose; 
//	@FindBy(xpath = "//*[text()='Quiz']")private WebElement Quiz; 
//	@FindBy(xpath = "//*[text()='Quiz']")private WebElement Quiz; 
//	@FindBy(xpath = "//*[text()='Quiz']")private WebElement Quiz; 
//	@FindBy(xpath = "//*[text()='Quiz']")private WebElement Quiz; 
//	
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
	
	public void validateIbtn() throws InterruptedException {
		
		Quiz_ibtn.click();
		Thread.sleep(1000);
	}
	
	public void validateIbtn_close() {
		
		Quiz_ibtnclose.click();
	}

}
