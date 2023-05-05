package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bulletinboardpage {

	@FindBy(xpath = "//span[normalize-space()='Bulletin Board']")
	private WebElement BulletinBoard; 
	@FindBy(xpath = "//span[@class='sidebar-icon assets bulletin']")
	private WebElement BulletinBoardicon;
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")
	private WebElement BulletinB_ibtn;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")
	private WebElement BulletinB_closeibtn;
	@FindBy(xpath = "//input[@id='searcText']")
	private WebElement noticesearchbox;
	@FindBy(xpath = "(//span[@class='p-tabview-title ng-star-inserted'])[2]")
	private WebElement Archivednotice;
	@FindBy(xpath = "//a[@class='bg-white mr-0']")
	private WebElement noticefilter;
	@FindBy(xpath = "(//span[@class='inline-block'])[2]")
	private WebElement BulletinBoardifilter;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/close.png']")
	private WebElement BulletinBoardfilterclose;
	@FindBy(xpath = "//span[text()='Knowledge Base']")
	private WebElement KnowledgeBase;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/info-icon-new.png']")
	private WebElement KnowledgeBaseibtn;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")
	private WebElement KnowledgeBaseibtnclose;
	@FindBy(xpath = "//input[@id='src']")
	private WebElement KnowledgeBasesearch;
//	@FindBy(xpath = "//span[@tin']")private WebElement BulletinBoardicon;
//	@FindBy(xpath = "//span[@tin']")private WebElement BulletinBoardicon;
//	@FindBy(xpath = "//span[@tin']")private WebElement BulletinBoardicon;
//	@FindBy(xpath = "//span[@tin']")private WebElement BulletinBoardicon;
	
	public bulletinboardpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifybuletinboard() throws InterruptedException 
	{
		
		BulletinBoard.click();
		Thread.sleep(1500);
		boolean BB = BulletinBoard.isEnabled(); 
		return BB;
	}
	
	public boolean validatebulletinicon() {
		
		boolean Bulletinicon = BulletinBoardicon.isDisplayed();
		return Bulletinicon;
	}
	
	public void validateBulletin_ibtn() {
		
		BulletinB_ibtn.click();
	}
	public void validateBulletin_ibtnclose() throws InterruptedException {
		Thread.sleep(1500);
		BulletinB_closeibtn.click();
	}
	
	public void validateArchivednotice() {
		
		Archivednotice.click();
	}
	
	public boolean validatenoticesearchbox() {
		
		boolean searchbox = noticesearchbox.isEnabled();
		return searchbox;
	}
	
	public void validatefilter() throws InterruptedException {
		
		BulletinBoardifilter.click();
		Thread.sleep(1500);
	}
	
	public void validateclosefilter() throws InterruptedException {
		
		BulletinBoardfilterclose.click();
		Thread.sleep(1000);
	}
	
	public void validateKnowledgeBaseNotice() {
		
		KnowledgeBase.click();
	}
	
	public void validate_i_btn() {
		
		KnowledgeBaseibtn.click();
	}
	
	public void validate_i_close() throws InterruptedException {
		Thread.sleep(1000);
		KnowledgeBaseibtnclose.click();
	}
	
	public boolean validateKnowledgeBasesearch() {
		
		boolean search = KnowledgeBasesearch.isEnabled();
		return search;
	}
}
