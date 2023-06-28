package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectsessionpage {

	
	@FindBy(xpath = "//p[@id='4']")
	private WebElement session2223;
	
	@FindBy(xpath = "//p[@id='5']")
	private WebElement session2324;
	
	@FindBy(xpath = "//button[text()='Select']")
	private WebElement selectbtn;
	
	public selectsessionpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	 public void clicksession() throws InterruptedException {
			
//		session2223.click();
//		Thread.sleep(1000);
		session2324.click();
	}
	
	 public void clickselectbtn() {
		
		 selectbtn.click();
	}
	
}
