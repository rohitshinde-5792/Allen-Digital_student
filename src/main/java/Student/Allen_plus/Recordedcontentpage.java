package Student.Allen_plus;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Student_Lib.UtilityClass;

public class Recordedcontentpage {
	
	@FindBy(xpath = "(//span[text()='Recorded Content'])[1]") private WebElement revisionB;
	@FindBy(xpath = "(//div[@class='cap'])[1]") 
	private WebElement firstvideoplay;	
	@FindBy(xpath = "(//img[@src='assets/images/test-play1.png'])[1]") 
	private WebElement videoplay;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/left-arrow.png']")
	private WebElement videoback;
	@FindBy(xpath = "//span[text()='Select Subject']") 
	private WebElement selectsubject;
	@FindBy(xpath = "//span[text()='Select Topic']") 
	private WebElement selecttopic;
	@FindBy(xpath = "//button[text()='Apply']") 
	private WebElement Applybtn;
	@FindBy(xpath = "//span[text()='Organic Chemistry']") 
	private WebElement orgchemistry;
	@FindBy(xpath = "//span[text()='Nomenclature']") 
	private WebElement nomenclature;
//	@FindBy(xpath = "//button[text()='Apply']") 
//	private WebElement apply;
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
	
	public void validateselectsubject() throws InterruptedException {
		//revisionB.click();
		selectsubject.click();
		
//		Applybtn.click();
//		Thread.sleep(5000);
//		boolean selecttop = selecttopic.isEnabled();
//		return selecttop;
	}
	
	public void validatetopic() throws InterruptedException {
		Thread.sleep(1500);
		selecttopic.click();
	}
public void validatefirstvideo() throws InterruptedException {
	
	firstvideoplay.click();
	
	Thread.sleep(5000);
}
	
public void validatefinalplay() throws InterruptedException {
	
	videoplay.click();
	Thread.sleep(5000);
}
	
public void validatevideoback() {
	
	videoback.click();
}

public void validateorgchemistry() throws InterruptedException {
	
	orgchemistry.click();
	Thread.sleep(1000);
}

public void validateorgchemnomenclature() throws InterruptedException {
	
	nomenclature.click();
	Thread.sleep(1000);
}

public void validateapplybtn() {
	
	Applybtn.click();
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
