package Student.Allen_plus;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Student_Lib.UtilityClass;
//QA
public class Recordedcontentpage {
	
	@FindBy(xpath = "(//span[text()='Recorded Content'])[1]") 
	private WebElement revisionB;
	@FindBy(xpath = "//*[@id=\"dialog1\"]/div[1]/div/div/div[1]/div[2]") 
	private WebElement firstvideoplay;	
	@FindBy(xpath = "(//div[@class='car-wrapper ng-star-inserted']//img)[2]") 
	private WebElement videoplay;
	@FindBy(xpath = "/html/body/app-root/section/app-result/div/div[1]/div[1]/span[1]/img")
	private WebElement videoback;
	@FindBy(xpath = "//*[@id=\"dialog1\"]/p-tabview/div/div/div[1]/p-dropdown/div/span") 
	private WebElement selectsubject;
	@FindBy(xpath = "//*[@id=\"dialog1\"]/p-tabview/div/div/div[2]/p-dropdown/div/span") 
	private WebElement selecttopic;
	@FindBy(xpath = "//*[@id=\"dialog1\"]/p-tabview/div/div/button") 
	private WebElement Applybtn;
	@FindBy(xpath = "//span[text()='Mathematics']") 
	private WebElement maths;
	@FindBy(xpath = "//span[text()='Differential Equation']") 
	private WebElement Differential_Equation;
	@FindBy(xpath = "//span[text()='Recorded Content ']") 
	private WebElement recordedcontentmaintitle;
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
		Thread.sleep(1500);
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
	
	maths.click();
	Thread.sleep(1000);
}

public void validateorgchemnomenclature() throws InterruptedException {
	
	Differential_Equation.click();
	Thread.sleep(1000);
}

public void validateapplybtn() throws InterruptedException {
	
	Applybtn.click();
	Thread.sleep(6000);
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
