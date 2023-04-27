package Student.Allen_plus;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Student_Lib.UtilityClass;

public class Recordedcontentpage {
	
	@FindBy(xpath = "//span[text()='Recorded Content']") private WebElement revisionB;
	@FindBy(xpath = "//span[text()='Select Subject']") private WebElement selectsubject;
	@FindBy(xpath = "//span[text()='Select Topic']") private WebElement selecttopic;
	@FindBy(xpath = "//button[text()='Apply']") private WebElement Applybtn;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
	
	public Recordedcontentpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean revisionButtonenablednot() 
	{	
		revisionB.click();
		boolean aaaa = revisionB.isEnabled();
		return aaaa; 	
	}
	
	public void validateselectsubjectdtopic() throws InterruptedException {
		revisionB.click();
		selectsubject.click();
		Thread.sleep(1500);
		selecttopic.click();
		Applybtn.click();
		Thread.sleep(5000);
//		boolean selecttop = selecttopic.isEnabled();
//		return selecttop;
	}
	

	
	
//	public void handlesubjectdropdown() {
//		
//		
//		UtilityClass.perform_action(Keys.ARROW_DOWN, selectsubject);
//	}
	
//	public void selectdummycode() {
//		revisionB.click();
//		UtilityClass.selectoption(selectsubject, 2);
//		NOTE---> NOT WORKING SELECT TAGNAME IS NOT PRESENT SO USE ACTIONS CLASS
//	}
}
