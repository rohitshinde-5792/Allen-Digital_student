package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
//QA
public class myassetpage 

{
	@FindBy(xpath = "//*[text()='My Assets ']")
	private WebElement MyAssets; 
	@FindBy(xpath = "/html/body/app-root/app-header/nav/a[2]/span/img")
	private WebElement MyAssetsibtn;
	@FindBy(xpath = "//*[@id=\"rate-wrapper\"]/div/div/div[2]/div[1]")
	private WebElement MyAssetsibtnclose;
	@FindBy(xpath = "//a[@class='bg-white mr-0 filter-box']")
	private WebElement mynotesfilter;
	@FindBy(xpath = "//a[@id='12']")
	private WebElement mynotessubjectwisefilter;
	@FindBy(xpath = "(//a[@id='987654'])[2]")
	private WebElement mynotesfacultywisefilter;
	@FindBy(xpath = "//a[text()='Apply']")
	private WebElement mynotesfilterapply;
	@FindBy(xpath = "//a[text()='Clear']")
	private WebElement mynotesfiltercancel;
	@FindBy(xpath = "//img[@class='close-icon']")
	private WebElement mynotesfilterclose;
	@FindBy(xpath = "(//li[@class='nav-item dropdown ng-star-inserted active']//span[@class='fadeInRight animated nav-link-name name-hide tax-show'])[3]")
	private WebElement myhw;  // xpth change
	@FindBy(xpath = "/html/body/app-root/app-header/nav/a[2]/span/img")
	private WebElement myhwibtn;
	@FindBy(xpath = "//*[@id=\"rate-wrapper\"]/div/div/div[2]/div[1]")
	private WebElement myhwibtnclose;
	@FindBy(xpath = "(//li[@class='nav-item dropdown ng-star-inserted active']//span[@class='fadeInRight animated nav-link-name name-hide tax-show'])[4]")
	private WebElement mymentor;
//	@FindBy(xpath = "//*[text()='My Assets ']")private WebElement MyAssets;
	
	
	public myassetpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public boolean validMyAssets() throws InterruptedException 
	
	{
		MyAssets.click();
		Thread.sleep(1000);
		boolean MA = MyAssets.isEnabled(); 
		return MA;
	}
	
	public void validatemynotesibtn() throws InterruptedException {
		
		MyAssetsibtn.click();
		Thread.sleep(1000);
	}
	
	public void validatemynotesibtnclose() {
		MyAssetsibtnclose.click();
	}
	
	public void validateHW() {
		myhw.click();
	}
	
	public void validatehwibtn() throws InterruptedException {
		myhwibtn.click();
		Thread.sleep(1000);
	}
	
	public void validatehwibtnclose() {
		myhwibtnclose.click();
	}
	
	public void validatenotefilter() throws InterruptedException {
		mynotesfilter.click();
		Thread.sleep(1000);
	}
	
	public void validatemynotesfiltersunjectwise() throws InterruptedException {
		
		mynotessubjectwisefilter.click();
		Thread.sleep(1500);
	}
	
	public void validatemynotesfiltercancel() throws InterruptedException {
		
		mynotesfiltercancel.click();
		Thread.sleep(1500);
	}
	public void validatemynotesfilterfacultywise() throws InterruptedException {
		
		mynotesfacultywisefilter.click();
		Thread.sleep(1500);
		
	}
	
	public void validatemynotesfilterapply() throws InterruptedException {
		
		mynotesfilterapply.click();
		Thread.sleep(2500);
	}
	public void validatenotefilterclose() {
		mynotesfilterclose.click();
	}
	
	public void validatemymentor() {
		
		boolean abc = mymentor.isEnabled();     
		if(abc==true)
		{
			mymentor.click();
		}
		else
		{
			Reporter.log("button is not clickable",true);
		}
		
	//	mymentor.click();
		
	}
}
