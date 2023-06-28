package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//QA
public class AllenschedulePage   // 22012281 vishal singh  // 22684033 jayant kumar
{
	//  //span[@class='tit-name'] class name 
	//button[@class='btn btn-info mr-0 ng-star-inserted']  join button
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
	private WebElement profilename;
	@FindBy(xpath = "(//div[@class='btn'])[2]") 
	private WebElement month;
	@FindBy(xpath = "//a[@class='navbar-brand main-logo mr-sm-3 ml-4 ml-sm-0']")
	private WebElement ADlogo;
	@FindBy(xpath = "//a[normalize-space()='Logout']") 
	private WebElement logout;
	@FindBy(xpath = "//div[@class='stream-name']") 
	private WebElement stream;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']")
	private WebElement loginpopupclose;
	@FindBy(xpath = "//img[@src='https://dvvwf08ea9qan.cloudfront.net/allenplus3/assets/images/left-arrow.png']") 
	private WebElement classrecordingback;
//	@FindBy(xpath = "//span[text()=' Class Recordings ']") 
//	private WebElement classreco_page;
	@FindBy(xpath = "//span[text()='Schedule']") 
	private WebElement schedule;
	@FindBy(xpath = "//a[@class='nav-link text-center ng-star-inserted']")
	private WebElement batch;
	@FindBy(xpath = "//img[@class='bell-icons']") 
	private WebElement bell;
	@FindBy(xpath = "//h4[text()='No schedule available']") 
	private WebElement noclass;
	@FindBy(xpath = "//span[text()='View All Notification']") 
	private WebElement Notification;
	@FindBy(xpath = "//span[@class='badge']") 
	private WebElement Notificationcount9;
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']") 
	private WebElement ibtn;
	@FindBy(xpath = "//h3[text()='Schedule']") 
	private WebElement schedulepop;
	@FindBy(xpath = "//*[@id=\"rate-wrapper\"]/div/div/div[2]/div[1]") 
	private WebElement popclose;
	@FindBy(xpath = "//div[@class='float-left cal-message-text']") 
	private WebElement greetingmsg;
	@FindBy(xpath = "//div[@class='float-right cal-date']") 
	private WebElement date;
	@FindBy(xpath = "(//a[@class='today-btn'])[1]") 
	private WebElement classrecording;
	@FindBy(xpath = "//span[text()=' Class Recordings ']") 
	private WebElement classrecoOn_page;
	@FindBy(xpath = "(//a[@class='today-btn'])[2]") 
	private WebElement accessreq;
	@FindBy(xpath = "//div[text()='Select max four expired dates']") 
	private WebElement accessreqpage;
	@FindBy(xpath = "//div[text()=' Today ']") 
	private WebElement today;
	@FindBy(xpath = "//img[@class='image-nofile ng-star-inserted']") 
	private WebElement noscheduleimg;
	@FindBy(xpath = "//div[@class='col-lg-3 short-cal bor pt-2']") 
	private WebElement calender;
	@FindBy(xpath = "//p[@class='pad-tb-small text-center p-0 m-0']") 
	private WebElement version;
	@FindBy(xpath = "//span[text()='Select Subject']") 
	private WebElement selectsub;
	@FindBy(xpath = "//span[text()='Select Topic']") 
	private WebElement selecttopic;
	@FindBy(xpath = "//button[text()='Apply']") 
	private WebElement yourclassapply;
    @FindBy(xpath = "//img[@class='image-nofile ng-star-inserted']") 
    private WebElement homepageimage;
    @FindBy(xpath = "//span[@class='d-flex align-items-center pr-1']") 
    private WebElement Redeempoint;
    @FindBy(xpath = "//p[text()='Earned ']") 
    private WebElement earnedpoint;
    @FindBy(xpath = "//p[text()='Used ']") 
    private WebElement used;
    @FindBy(xpath = "//a[text()='History']")
    private WebElement history;
    @FindBy(xpath = "//a[text()='Leave']")
    private WebElement leave;
    @FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/hemb-icon.png']")
    private WebElement leaveback;
    @FindBy(xpath = "//a[text()=' Apply Leave']") 
    private WebElement applyleave;
    @FindBy(xpath = "//span[text()='Choose the reason for leave']") 
    private WebElement leavereason;
    @FindBy(xpath = "(//button[@type='button'])[1]") 
    private WebElement leaveclose;
    @FindBy(xpath = "//span[@class='tit-name']") 
    private WebElement classname;
    @FindBy(xpath = "//button[@class='btn btn-info mr-0 ng-star-inserted']")
    private WebElement joinclassbtn;
    @FindBy(xpath = "//button[@title='Join']") 
    private WebElement secjoinclassbtn;
	@FindBy(xpath = "//a[text()=' Change Password']") 
	private WebElement changepass;  
	@FindBy(xpath = "//a[text()='Study Drop']") 
	private WebElement studydrop;  
	@FindBy(xpath = "(//a[@class='dropdown-item d-flex align-items-center'])[2]") 
	private WebElement setting;
	@FindBy(xpath = "//button[text()='Cancel']") 
	private WebElement accesreqcancel;
	@FindBy(xpath = "/html/body/app-root/app-sidepanel/div/nav/div/div/div/img")
	private WebElement backbtn;	 
	@FindBy(xpath = "//span[text()=' Class Recordings ']")
	private WebElement classrecordingsubpage;
	@FindBy(xpath = "//div[@class='main-tit']//span[@class='badges']") 
	private WebElement currentnotificationcount;
	//div[@class='main-tit']//span[@class='badges'] notification count
	
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
	public String validatetodaybtntext() {
		
		String todaytext = today.getText();
		return todaytext;
	}
	
	public boolean validateaccessrequest() throws InterruptedException {
		accessreq.click();
		Thread.sleep(2000);
		boolean accessreqbtn = accessreq.isEnabled();
		return accessreqbtn;
		
	}
	
	public void clickonaccessreq() {
		
		accessreq.click();
	}
	public String validateaccessrequestpage() {
		//accessreq.click();
		String aact = accessreqpage.getText();
		return aact;
		
	}
	public String validateaccessreqtext() {
		
		String acessreq = accessreq.getText();
		return acessreq;
	}
	
	public void validateaccessreqcancel() throws InterruptedException {
		accesreqcancel.click();
		Thread.sleep(2000);
		
	}
	public boolean validateclassrecordingbtn() {
		
		boolean yourclassbtn = classrecording.isEnabled();
		return yourclassbtn;	
	}
	
	public void clickclassrecordingbtn() {
		
		classrecording.click();
		//classrecordingback.click();
	}
	
	public String validateclassrecordingbtntext() {
		String classtext = classrecording.getText();
		return classtext;
	}
	public void validateselectsub() {
		selectsub.click();
	}
	
	public void validateselecttopic() throws InterruptedException {
		selecttopic.click();
		Thread.sleep(1000);
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
		
		classrecordingback.click();
		
	}
	
	public String validatecurrentnotificationcount() {
		
		String notcount = currentnotificationcount.getText();
		return notcount;
	}
	
	public boolean validateNotificationcount9() {
		
		boolean act = Notificationcount9.isDisplayed();
		return act;
	}
	public void validateloginpopupclose() {
		
		loginpopupclose.click();
	}
	
	public void validateyourclassback() {
		
		classrecordingback.click();
	}
	
	public String validateRedeempointtext() {
		
		String redeem = Redeempoint.getText();
		return redeem;
	}
	
	public String validateearnedpointtext() {
		
		String earnpt = earnedpoint.getText();
		return earnpt;
	}
	
	public String validateusedtext() {
		
		String use = used.getText();
		return use;
	}
	
	public String validatehistorytext() {
		
		String hsty = history.getText();
		return hsty;
	}
	
	public String validatesettingtext() {
		
		String sett = setting.getText();
		return sett;
	}
	
	public String validatechangepass() {
		
		String chagpass = changepass.getText();
		return chagpass;
	}
	
	public String validatestudydrop() {
		String sd = studydrop.getText();
		return sd;
	}
	
	public void validateleave() {
		
		leave.click();
	}
	
	public void validateapplyleave() {
		applyleave.click();
	}
	
	public void validateleavereason() {
		
		leavereason.click();
	}
	public void validateleaveclose() {
		
		leaveclose.click();
	}
	
	public void validateleaveback() {
		
		leaveback.click();
	}
	
	public void validatejoinclassbtn() throws InterruptedException {
		
		joinclassbtn.click();
		Thread.sleep(3000);
		
	}
	
	public void validatesecjoinclassbtn() {
		
		secjoinclassbtn.click();
	}
	
	
}
