package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//QA
public class quizpage {
	
	@FindBy(xpath = "//*[text()='Quiz']")
	private WebElement Quiz; 
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")
	private WebElement Quiz_ibtn; 
	@FindBy(xpath = "//*[@id=\"rate-wrapper\"]/div/div/div[2]/div[1]")
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
