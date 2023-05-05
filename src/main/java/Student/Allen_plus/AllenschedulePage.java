package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllenschedulePage 
{
	@FindBy(xpath = "//li[@class='nav-item profile mr-2 ml-2']//a")private WebElement profilename;
	@FindBy(xpath = "(//div[@class='btn'])[2]") private WebElement month;
	@FindBy(xpath = "//a[@class='navbar-brand main-logo mr-sm-3 ml-4 ml-sm-0']") private WebElement ADlogo;
	@FindBy(xpath = "//a[normalize-space()='Logout']") private WebElement logout;
	@FindBy(xpath = "//div[@class='stream-name']") private WebElement stream;
	//@FindBy(xpath = "//span[@class='p-dialog-header-close-icon ng-tns-c83-15 pi pi-times']") private WebElement reclecerrorclose;
	//@FindBy(xpath = "//span[@class='ml-2 ng-star-inserted']//img") private WebElement reclec;
	//@FindBy(xpath = "//b[normalize-space()='The videos are available only on the Mobile App.']") private WebElement errormsg;
	@FindBy(xpath = "//span[text()='Schedule']") private WebElement schedule;
	@FindBy(xpath = "//a[@class='nav-link text-center ng-star-inserted']") private WebElement batch;
	@FindBy(xpath = "//img[@class='bell-icons']") private WebElement bell;
	@FindBy(xpath = "//h4[text()='No schedule available']") private WebElement noclass;
	@FindBy(xpath = "//span[text()='View All Notification']") private WebElement Notification;
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']") private WebElement ibtn;
	@FindBy(xpath = "//h3[text()='Schedule']") private WebElement schedulepop;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']") private WebElement popclose;
	@FindBy(xpath = "//div[@class='float-left cal-message-text']") private WebElement greetingmsg;
	@FindBy(xpath = "//div[@class='float-right cal-date']") private WebElement date;
	@FindBy(xpath = "(//a[@class='today-btn'])[1]") private WebElement yourclass;
	@FindBy(xpath = "(//a[@class='today-btn'])[2]") private WebElement accessreq;
	@FindBy(xpath = "//div[text()=' Today ']") private WebElement today;
	@FindBy(xpath = "//img[@class='image-nofile ng-star-inserted']") private WebElement noscheduleimg;
	@FindBy(xpath = "//div[@class='col-lg-3 short-cal bor pt-2']") private WebElement calender;
	@FindBy(xpath = "//p[@class='pad-tb-small text-center p-0 m-0']") private WebElement version;
	@FindBy(xpath = "//span[text()='Select Subject']") private WebElement selectsub;
	@FindBy(xpath = "//span[text()='Select Topic']") private WebElement selecttopic;
	@FindBy(xpath = "//button[text()='Apply']") private WebElement yourclassapply;
    @FindBy(xpath = "//img[@class='image-nofile ng-star-inserted']") private WebElement homepageimage;
    @FindBy(xpath = "//a[@class='dropdown-item ng-star-inserted']") private WebElement Redeempoint;
    @FindBy(xpath = "//p[text()='Earned ']") private WebElement earnedpoint;
	@FindBy(xpath = "//a[text()=' Change Password']") private WebElement changepass;  
	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]") private WebElement setting;
	@FindBy(xpath = "//button[text()='Cancel']") private WebElement accesreqcancel;
	 @FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/hemb-icon.png']") private WebElement backbtn;	 
	 @FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/left-arrow.png']") private WebElement yourclassbackbtn;
//	 @FindBy(xpath = "//p[text()='Earned ']") private WebElement earnedpoint;
	
	public AllenschedulePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getprofilename()
	{
		String actprofilename = profilename.getText();
		return actprofilename;   
	}
	
	public void logoutuser() 
	
	{
		profilename.click(); 
		logout.click();
	}
	
	public boolean verifylogo() 
	
	{
		boolean logo = ADlogo.isDisplayed();	
		return logo;
	}
	
	public String validatestreamname() 
	{
		String streamname = stream.getText();
		return streamname;
	}
	
	public boolean validatebackbtn() throws InterruptedException {
		backbtn.click();
		Thread.sleep(2000);
		backbtn.click();
		boolean bckbtn = backbtn.isEnabled();
		return bckbtn;
	}
	public String validatescheduletext() 
	{
		String scheduletext = schedule.getText();
		return scheduletext;
	}
	
	public String validatebatchname() 
	{
		String batchname = batch.getText();
		return batchname;	
	}
	
	public boolean validatebell() {
		boolean bellicon = bell.isDisplayed();
		return bellicon;
		
	}

	public String validateclass() {
		
		String noclassmsg = noclass.getText();
				return noclassmsg; 
	}
	
	public boolean validatenotificationtext() {
		bell.click();
		 boolean notfn = Notification.isDisplayed();
		return notfn;
	}
	
	public void validate_I_btn() 
	{
		ibtn.click();	
	}
	public String popupname() {
		 String pop = schedulepop.getText();
		return pop;
		
	}
	public void popupclose() {
		popclose.click();
	}
	public boolean validategreetingmsg() {
		
		 boolean greetmsg = greetingmsg.isDisplayed();
				return greetmsg;
	}
	
	public boolean validatecalenderdate() {
		boolean currentdate = date.isDisplayed();
		return currentdate; 	
	}
	
	public boolean validatecalender() {
		
		boolean cal = calender.isDisplayed();
		return cal;
	}
	
	public boolean validateversion() {
		
		boolean appversion = version.isDisplayed();
		return appversion;
	}
	
	public boolean validatetodaybutton() {
		//today.click();
		boolean todaybtn = today.isEnabled();
		return todaybtn;
	}
	
	public boolean validateaccessrequest() throws InterruptedException {
		accessreq.click();
		Thread.sleep(2000);
		boolean accessreqbtn = accessreq.isEnabled();
		return accessreqbtn;
		
	}
	
	public void validateaccessreqcancel() {
		accesreqcancel.click();
	}
	public boolean validateyourclassbtn() {
		
		boolean yourclassbtn = yourclass.isEnabled();
		return yourclassbtn;	
	}
	
	public void clickyourclassbtn() {
		
		yourclass.click();
		
	}
	
	public void validateselectsub() {
		selectsub.click();
	}
	
	public void validateselecttopic() {
		selecttopic.click();
	}
	
	public boolean validateredeempoint() throws InterruptedException {
		profilename.click();
		Redeempoint.click();
		Thread.sleep(1500);
		boolean earn = earnedpoint.isDisplayed();
		return earn;
		
	}
	
	public boolean validatehomepageimage() {
		boolean homeimage = homepageimage.isDisplayed();
		return homeimage;
		
	}
	
	public boolean validatesettingbtn() throws InterruptedException {
		profilename.click();
		setting.click();
		Thread.sleep(2000);
		boolean pass = changepass.isDisplayed();
		return pass;
	}
	public void clickyourclassapply() throws InterruptedException {
		yourclassapply.click();
		yourclassbackbtn.click();
		
	}
}
