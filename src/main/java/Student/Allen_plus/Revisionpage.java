package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Revisionpage {
	
	@FindBy(xpath = "//span[text()='Revision']") private WebElement revisionB;
	@FindBy(xpath = "//span[text()='Digital Material']") private WebElement selectsubject;
	@FindBy(xpath = "//span[text()='Select Topic']") private WebElement selecttopic;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
	
	//span[@class='p-dropdown-trigger-icon ng-tns-c42-11 pi pi-chevron-down']
	public Revisionpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean revisionButtonenablednot() 
	{	
		revisionB.click();
		boolean aaaa = revisionB.isEnabled();
		return aaaa; 	
	}
	
	public void validateselectsubjectd() {
		revisionB.click();
		selectsubject.click();
//		boolean selectsub = selectsubject.isEnabled();
//	       return selectsub;
	}
	
	public boolean validateselecttopic() {
		selecttopic.click();
		boolean selecttop = selecttopic.isEnabled();
		return selecttop;
	}
}
