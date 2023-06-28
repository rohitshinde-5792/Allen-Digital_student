package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
//QA
public class doubtandsolutionpage {
	
	@FindBy(xpath = "(//ul[@class='navbar-nav']//span[@class='fadeInRight animated nav-link-name name-hide tax-show'])[4]")
	private WebElement Doubtsol;  // change xpath for live
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")
	private WebElement ibtn;
	@FindBy(xpath = "//*[@id=\"rate-wrapper\"]/div/div/div[2]/div[1]")
	private WebElement ibtnclose;
	@FindBy(xpath = "(//span[@class='p-tabview-title ng-star-inserted'])[1]")
	private WebElement Unresolved;
	@FindBy(xpath = "(//span[@class='p-tabview-title ng-star-inserted'])[2]")
	private WebElement unresolvewithsolution;
	@FindBy(xpath = "(//span[@class='p-tabview-title ng-star-inserted'])[3]")
	private WebElement resolve;
	@FindBy(xpath = "//button[@class='ask-doubt']")
	private WebElement Askdoubtbtn;
	@FindBy(xpath = "/html/body/app-root/section/app-doubt-solution/div/div[1]/app-ask-doubt-popup/p-dialog/div/div/div[2]/div[2]/div/div[2]/div[7]/div/button[2]")
	private WebElement Doubtyes;
	@FindBy(xpath = "/html/body/app-root/section/app-doubt-solution/div/div[1]/app-ask-doubt-popup/p-dialog/div/div/div[2]/div[2]/div[4]/button")
	private WebElement doubtcancel;
	@FindBy(xpath = "//a[@class='bg-white mr-0']")
	private WebElement filter;
	@FindBy(xpath = "/html/body/app-root/section/app-doubt-solution/div/div[1]/app-filter/div/div/div/h3/span/img")
	private WebElement filterclose;
	@FindBy(xpath = "(//li[@class='nav-item dropdown d-s ng-star-inserted active']//span)[4]")
	private WebElement brodcast;
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")
	private WebElement brod_ibtn;
	@FindBy(xpath = "//*[@id=\"rate-wrapper\"]/div/div/div[2]/div[1]")
	private WebElement closebrod_ibtn;
	@FindBy(xpath = "//li[@class='ng-star-inserted']//span")
	private WebElement savedBrodcast;
	@FindBy(xpath = "//span[text()='Exercise']")
	//@FindBy(xpath = "/html/body/app-root/app-sidepanel/div/nav/ul/li[4]/ul/li[3]/a/span")
	private WebElement excercise;
    @FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")
    private WebElement exer_ibtn;
    @FindBy(xpath = "//*[@id=\"rate-wrapper\"]/div/div/div[2]/div[1]")
    private WebElement exer_closeibtn;
	@FindBy(xpath = "//*[@id=\"dialog1\"]/p-tabview/div/div/div[1]/p-dropdown/div/span")
	private WebElement exselectsub;
	@FindBy(xpath = "//*[@id=\"dialog1\"]/p-tabview/div/div/div[2]/p-dropdown/div/span")
	private WebElement exselecttopic;
	@FindBy(xpath = "//*[@id=\"dialog1\"]/p-tabview/div/div/button")
	private WebElement applybtn;
//	@FindBy(xpath = "/html/body/app-root/app-sidepanel/div/nav/ul/li[4]/ul/li[4]/a/span")  for live
	@FindBy(xpath = "//span[text()='Race']")
	private WebElement Race;
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']")
	private WebElement race_ibtn;
	@FindBy(xpath = "//*[@id=\"rate-wrapper\"]/div/div/div[2]/div[1]")
	private WebElement race_closeibtn;
	@FindBy(xpath = "//*[@id=\"dialog1\"]/p-tabview/div/div/div[1]/p-dropdown/div/span")
	private WebElement raceselectsub;
	@FindBy(xpath = "//span[@class='ng-tns-c43-49 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']")
	private WebElement raceselecttopic;
	@FindBy(xpath = "//*[@id=\"dialog1\"]/p-tabview/div/div/div[3]/p-dropdown/div/span")
	private WebElement selectracevid;
 	@FindBy(xpath = "//*[@id=\"dialog1\"]/p-tabview/div/div/button")
 	private WebElement raceapply;
 	@FindBy(xpath = "//span[text()='Mathematics (ENTHUSE)']")
 	private WebElement Mathsubjectselect;
	@FindBy(xpath = "//span[text()='Differentiability']")
 	private WebElement mathtopic;
//	@FindBy(xpath = "//a[@class='bg-white mr-0']")private WebElement filter;
	@FindBy(xpath = "//img[@style='width: 25px; cursor: pointer;']") 
	private WebElement exercisevideoback;//for exercise video back from digi mtl page
	@FindBy(xpath = "//lottie-player[@class='writing-text']")
	private WebElement Akstextdoubt;
	@FindBy(xpath = "//*[@id=\"float-input\"]")
	private WebElement Akstextdoubtwrite;
	@FindBy(xpath = "/html/body/app-root/section/app-doubt-solution/div/div[1]/app-ask-doubt-popup/p-dialog/div/div/div[2]/div[2]/div[2]/div/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]/li")
	private WebElement aksdoubtselectsub;
	@FindBy(xpath = "/html/body/app-root/section/app-doubt-solution/div/div[1]/app-ask-doubt-popup/p-dialog/div/div/div[2]/div[2]/div[2]/div/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[4]/li")
	private WebElement aksdoubtselecttopic;
	@FindBy(xpath = "/html/body/app-root/section/app-doubt-solution/div/div[1]/app-ask-doubt-popup/p-dialog/div/div/div[2]/div[2]/div[3]/button[2]")
	private WebElement aksdoubtsubmit;
	@FindBy(xpath = "/html/body/app-root/section/app-doubt-solution/div/div[1]/app-ask-doubt-popup/p-dialog/div/div/div[2]/div[2]/div[3]/button[1]")
	private WebElement aksdoubtcancel;
//	@FindBy(xpath = "//a[@class='bg-white mr-0']")private WebElement filter;
	public doubtandsolutionpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public boolean verifydoubtsolution() throws InterruptedException 
	{
		
		boolean abc = Doubtsol.isEnabled();    //Askdoubtbtn.click(); 
		if(abc==true)
		{
			Doubtsol.click();
		}
		else
		{
			Reporter.log("button is not clickable",true);
		}
		
		//Doubtsol.click();
		Thread.sleep(1000);
//		boolean DS = Doubtsol.isEnabled();
		return abc ;
	}

	public void validate_i_btn() throws InterruptedException {
		ibtn.click();
		Thread.sleep(1500);
		ibtnclose.click();
		
	}
	public boolean validateunresolvedoubt() throws InterruptedException 
	{
		boolean abc = Unresolved.isEnabled();    //Askdoubtbtn.click(); 
		if(abc==true)
		{
			Unresolved.click();
		}
		else
		{
			Reporter.log("button is not clickable",true);
		}
		
	//	Unresolved.click();
		Thread.sleep(1000);
		return abc;
	}
	
	public boolean validateunresolvewithsolution() throws InterruptedException 
	{
		boolean abc = unresolvewithsolution.isEnabled();    //Askdoubtbtn.click(); 
		if(abc==true)
		{
			unresolvewithsolution.click();
		}
		else
		{
			Reporter.log("button is not clickable",true);
		}
		
		//unresolvewithsolution.click();
		Thread.sleep(1000);
		return abc;
	}
	
	public boolean validateresolve() {

		boolean abc = resolve.isEnabled();    //Askdoubtbtn.click(); 
		if(abc==true)
		{
			resolve.click();
		}
		else
		{
			Reporter.log("button is not clickable",true);
		}
		
		//resolve.click();
		return abc;
	}
	
	public boolean validateAskdoubtbtn() throws InterruptedException {
	
		boolean abc = Askdoubtbtn.isEnabled();    //Askdoubtbtn.click(); 
		if(abc==true)
		{
			Askdoubtbtn.click();
		}
		else
		{
			Reporter.log("button is not clickable",true);
		}
		
		//Askdoubtbtn.click();
		Thread.sleep(4500);
		Doubtyes.click();
		Thread.sleep(1500);
		Akstextdoubt.click();
		Akstextdoubtwrite.sendKeys("doubt 21 june");
		//aksdoubtselectsub.click();
		//aksdoubtselecttopic.click();
		aksdoubtcancel.click();
		//doubtcancel.click();
		return abc;
	}
	
	public void validatefilter() throws InterruptedException {
		
		filter.click();
		Thread.sleep(1500);
		filterclose.click();
	}
	
	public boolean validatebrodcast() throws InterruptedException {
		
		boolean brod = brodcast.isEnabled();
		
		if(brod==true)
		{
			brodcast.click();
		}
		else
		{
			Reporter.log("button is not clickable",true);
		}
	//	brodcast.click();
		Thread.sleep(1500);
		return brod;
	}
	
	public void validatebrod_i_btn() throws InterruptedException {
		
		brod_ibtn.click();
		Thread.sleep(4500);
		closebrod_ibtn.click();
	}
	public boolean validatesavedBrodcast() {
		
		boolean brod = savedBrodcast.isEnabled();
		
		if(brod==true)
		{
			savedBrodcast.click();
		}
		else
		{
			Reporter.log("button is not clickable",true);
		}
		//savedBrodcast.click();
		return brod;
		
	}
	
	public boolean validateexcercise() throws InterruptedException {
		
		boolean brod = excercise.isEnabled();
		
		if(brod==true)
		{
			excercise.click();
		}
		else
		{
			Reporter.log("button is not clickable",true);
		}
	
		//excercise.click();
		Thread.sleep(2500);	
		return brod;
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
	Thread.sleep(9500);
}
  
  public boolean validaterace() throws InterruptedException {
	
	   boolean rc = Race.isEnabled();
	  
	   if(rc==true)
		{
		   Race.click();
		}
		else
		{
			Reporter.log("button is not clickable",true);
		}
	  //Race.click();
	  Thread.sleep(1500);
	  return rc;
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
	  Thread.sleep(4500);
}
  
  // for exercise video back from digi mtl page
  public void validateexercisevideoback() {
	   
	   exercisevideoback.click();
}
  
  public void validateMathsubjectselect() {
	
	  Mathsubjectselect.click();
	  
}
  
  public void validatemathtopic() {
	  mathtopic.click();
}
}
