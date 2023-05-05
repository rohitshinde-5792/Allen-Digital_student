package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myassetpage 

{
	@FindBy(xpath = "//*[text()='My Assets ']")
	private WebElement MyAssets; 
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/info-icon-new.png']")
	private WebElement MyAssetsibtn;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")
	private WebElement MyAssetsibtnclose;
	@FindBy(xpath = "//a[@class='bg-white mr-0 filter-box']")
	private WebElement mynotesfilter;
	@FindBy(xpath = "//img[@class='close-icon']")
	private WebElement mynotesfilterclose;
	@FindBy(xpath = "//span[text()='My Homework']")
	private WebElement myhw;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/info-icon-new.png']")
	private WebElement myhwibtn;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")
	private WebElement myhwibtnclose;
	
//	@FindBy(xpath = "//*[text()='My Assets ']")private WebElement MyAssets;
	public myassetpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public boolean validMyAssets() 
	
	{
		MyAssets.click();
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
	
	public void validatenotefilterclose() {
		mynotesfilterclose.click();
	}
}
