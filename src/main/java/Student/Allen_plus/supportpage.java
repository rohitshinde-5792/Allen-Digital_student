package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class supportpage {
	
	@FindBy(xpath = "//*[text()='Support ']")
	private WebElement Support; 
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/info-icon-new.png']")
	private WebElement Supportibtn; 
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")
	private WebElement Supportibtnclose; 
	@FindBy(xpath = "//li[text()='Access Request & Reward Points']")
	private WebElement SupportAccessReqReward; 
	@FindBy(xpath = "//li[text()='Ask Doubt']")
	private WebElement SupportAskDoubt; 
	@FindBy(xpath = "//li[text()='Ask Mentor']")
	private WebElement SupportAskMentor; 
	@FindBy(xpath = "//li[text()='Broadcast']")
	private WebElement SupportBroadcast; 
	@FindBy(xpath = "//li[text()='Digital Material']")
	private WebElement SupportDigitalMaterial; 
	@FindBy(xpath = "//li[text()='Exercise Solution']")
	private WebElement SupportExerciseSolution; 
	@FindBy(xpath = "//li[text()='Feedback']")
	private WebElement SupportFeedback; 
	@FindBy(xpath = "//li[text()='Home Work']")
	private WebElement SupportHomeWork; 
	@FindBy(xpath = "//li[text()='Live Class']")
	private WebElement SupportLiveClass; 
	@FindBy(xpath = "//li[text()='My Notes']")
	private WebElement SupportMyNotes; 
	@FindBy(xpath = "//li[text()='Other']")
	private WebElement SupportOther; 
	@FindBy(xpath = "//li[text()='Test & Reports']")
	private WebElement SupportTestReports; 
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/ask-tech.png']")
	private WebElement SupportAksyourissue;
	@FindBy(xpath = "//input[@id='searcText']")
	private WebElement SupportsearcText; 
	@FindBy(xpath = "//a[text()=' My Previous Issues ']")
	private WebElement SupportMyPreviousIssues; 
	@FindBy(xpath = "//span[text()='Closed']")
	private WebElement Supportclosedpreviousissue; 
	@FindBy(xpath = "//a[@class='bg-white mr-0']")
	private WebElement Supportfilter; 	
	@FindBy(xpath = "//img[@class='close-icon']")
	private WebElement Supportfilterclose; 
	@FindBy(xpath = "//button[@class='ask-doubt']")
	private WebElement Supportnewissue; 
	@FindBy(xpath = "(//button[text()=' Cancel '])[2]")
	private WebElement Supportissuecancel; 
	@FindBy(xpath = "//img[@class='hand-icon back-button-cis ng-star-inserted']")
	private WebElement Supportissuepageback; 
//	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/ask-tech.png']")
//	private WebElement SupportAksyourissue; 
	public supportpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public boolean veriftSupport() 
	{
		Support.click();
		boolean ST = Support.isEnabled(); return ST;		
	}
	
	public void validatesupportibtn() throws InterruptedException {
		
		Supportibtn.click();
		Thread.sleep(1000);
	}
	
	public void validatesupportibtnclose() {
		
		Supportibtnclose.click();
	}
	
	public void validateSupportAccessReqReward() throws InterruptedException {
		
		SupportAccessReqReward.click();
		Thread.sleep(1000);
	}
	
	public void validateSupportAskDoubt() throws InterruptedException {
		
		SupportAskDoubt.click();
		Thread.sleep(1000);
	}
	
	public void validateSupportAskMentor() throws InterruptedException {
		
		SupportAskMentor.click();
		Thread.sleep(1000);
	}
	
	public void validateSupportBroadcast() throws InterruptedException {
		
		SupportBroadcast.click();
		Thread.sleep(1000);
	}
	
	public void validateSupportDigitalMaterial() throws InterruptedException {
		
		SupportDigitalMaterial.click();
		Thread.sleep(1000);
	}
	
	public void validateSupportExerciseSolution() throws InterruptedException {
		
		SupportExerciseSolution.click();
		Thread.sleep(1500);
	}
	
	public void validateSupportFeedback() throws InterruptedException {
		
		SupportFeedback.click();
		Thread.sleep(2500);
	}
	
	public void validateSupportHomeWork() throws InterruptedException {
		
		SupportHomeWork.click();
		Thread.sleep(1000);
	}
	
	public void validateSupportLiveClass() throws InterruptedException {
		
		SupportLiveClass.click();
		Thread.sleep(1000);
	}
	
	public void validateSupportMyNotes() throws InterruptedException {
		
		SupportMyNotes.click();
		Thread.sleep(1000);
	}
	
	public void validateSupportOther() throws InterruptedException {
		
		SupportOther.click();
		Thread.sleep(1000);
	}
	
	public void validateSupportTestReports() throws InterruptedException {
		
		SupportTestReports.click();
		Thread.sleep(1000);
	}
	
	public boolean validateSupportsearcText() {
		
		boolean searchbox = SupportsearcText.isEnabled();
		return searchbox;
	}
	
	public void clickSupportMyPreviousIssues() throws InterruptedException {
		
		SupportMyPreviousIssues.click();
		Thread.sleep(1500);
	}
	
	public void validateSupportclosedpreviousissue() {
		
		Supportclosedpreviousissue.click();
	}
	
	public void validateSupportfilter() {
		
		Supportfilter.click();
	}
	
	public void validateSupportfilterclose() {
		
		Supportfilterclose.click();
	}
	
	public void validateSupportnewissue() throws InterruptedException {
		
		Supportnewissue.click();
		Thread.sleep(1500);
	}
	
	public void validateSupportissuecancel() {
		
		Supportissuecancel.click();
	}
	
	public void validateSupportissuepageback() throws InterruptedException {
		
		Supportissuepageback.click();
		Thread.sleep(1000);
	}
	
	public void validateAksyourissueonmain() throws InterruptedException {
		
		 SupportAksyourissue.click();
		 Thread.sleep(1000);
	}
	
	
}
