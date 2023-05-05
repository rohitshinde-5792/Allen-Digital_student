package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class doubtandsolutionpage {
	
	@FindBy(xpath = "//span[normalize-space()='Doubt & Solution']")private WebElement Doubtsol;
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")private WebElement ibtn;
	@FindBy(xpath = "//div[@class='float-right close ng-tns-c83-25']")private WebElement ibtnclose;
	@FindBy(xpath = "(//span[@class='p-tabview-title ng-star-inserted'])[1]")private WebElement Unresolved;
	@FindBy(xpath = "(//span[@class='p-tabview-title ng-star-inserted'])[2]")private WebElement unresolvewithsolution;
	@FindBy(xpath = "(//span[@class='p-tabview-title ng-star-inserted'])[3]")private WebElement resolve;
	@FindBy(xpath = "//button[@class='ask-doubt']")private WebElement Askdoubtbtn;
	@FindBy(xpath = "//button[@class='btn btn-primary']")private WebElement Doubtok;
	@FindBy(xpath = "//a[@class='bg-white mr-0']")private WebElement filter;
	@FindBy(xpath = "//img[@class='close-icon']")private WebElement filterclose;
	@FindBy(xpath = "(//span[@class='fadeInRight animated nav-link-name name-hide tax-show'])[6]")private WebElement brodcast;
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")private WebElement brod_ibtn;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")private WebElement closebrod_ibtn;
	@FindBy(xpath = "(//span[@class='p-tabview-title ng-star-inserted'])[2]")private WebElement savedBrodcast;
	@FindBy(xpath = "(//span[@class='fadeInRight animated nav-link-name name-hide tax-show'])[7]")private WebElement excercise;
    @FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")private WebElement exer_ibtn;
    @FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")private WebElement exer_closeibtn;
	@FindBy(xpath = "//span[text()='Select Subject']")private WebElement exselectsub;
	@FindBy(xpath = "//span[text()='Select Topic']")private WebElement exselecttopic;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-srch']")private WebElement applybtn;
	@FindBy(xpath = "(//span[@class='fadeInRight animated nav-link-name name-hide tax-show'])[8]")private WebElement Race;
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")private WebElement race_ibtn;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")private WebElement race_closeibtn;
	@FindBy(xpath = "//span[text()='Select Subject']")private WebElement raceselectsub;
	@FindBy(xpath = "//span[text()='Select Topic']")private WebElement raceselecttopic;
	@FindBy(xpath = "//span[text()='Select Race Videos']")private WebElement selectracevid;
 	@FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-srch']")private WebElement raceapply;
//  @FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")private WebElement race_closeibtn;
//	@FindBy(xpath = "//a[@class='bg-white mr-0']")private WebElement filter;
//	@FindBy(xpath = "//a[@class='bg-white mr-0']")private WebElement filter;
	
 	public doubtandsolutionpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public boolean verifydoubtsolution() throws InterruptedException 
	{
		Doubtsol.click();
		Thread.sleep(1000);
		boolean DS = Doubtsol.isEnabled();
		return DS ;
	}

	public void validate_i_btn() throws InterruptedException {
		ibtn.click();
		Thread.sleep(1500);
		ibtnclose.click();
		
	}
	public void validateunresolvedoubt() 
	{
		Unresolved.click();
		
	}
	
	public void validateunresolvewithsolution() 
	{
		unresolvewithsolution.click();
		
	}
	
	public void validateresolve() {
		resolve.click();
	}
	
	public void validateAskdoubtbtn() throws InterruptedException {
		
		Askdoubtbtn.click();
		Thread.sleep(4500);
		Doubtok.click();
	}
	
	public void validatefilter() {
		
		filter.click();
		filterclose.click();
	}
	
	public void validatebrodcast() {
		
		brodcast.click();
	}
	
	public void validatebrod_i_btn() throws InterruptedException {
		
		brod_ibtn.click();
		Thread.sleep(4500);
		closebrod_ibtn.click();
	}
	public void validatesavedBrodcast() {
		
		savedBrodcast.click();
	}
	
	public void validateexcercise() throws InterruptedException {
		
		
		Thread.sleep(1500);
		excercise.click();
		Thread.sleep(2500);	
	}
	
	public void validate_exe_i_btn() throws InterruptedException {
		
		exer_ibtn.click();
		Thread.sleep(1500);
		exer_closeibtn.click();
	}
	
 public void validateexselectsubject() throws InterruptedException {
			
		exselectsub.click();
		Thread.sleep(1500);
	}

 public void validateexselecttopic() throws InterruptedException {
	
	exselecttopic.click();
	Thread.sleep(1500);
	
}

  public void validateexapplybtn() throws InterruptedException {
	applybtn.click();
	Thread.sleep(7000);
}
  
  public void validaterace() throws InterruptedException {
	
	  Race.click();
	  Thread.sleep(1500);
}

  public void validaterace_ibtn() throws InterruptedException {
	
	  race_ibtn.click();
	  Thread.sleep(1500);
	  race_closeibtn.click();
}

  public void validateracesubject() throws InterruptedException {
	
	  raceselectsub.click();
	  Thread.sleep(1500);
}
  public void validateracetopic() {
	
	  raceselecttopic.click();
}
  
  public void validateracevideo() throws InterruptedException {
	
	  selectracevid.click();
	  Thread.sleep(1500);
}
  public void validateraceapplybtn() throws InterruptedException {
	
	  raceapply.click();
	  Thread.sleep(7500);
}
}
