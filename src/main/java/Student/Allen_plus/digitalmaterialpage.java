package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//QA
public class digitalmaterialpage {
	//span[text()='Exercise']
	
	@FindBy(xpath = "//span[text()='Digital Material']") 
	private WebElement digmtl;
	@FindBy(xpath = "//input[@type='text']") 
	private WebElement searchbox;
	@FindBy(xpath = "//a[@class='bg-white mr-0']") 
	private WebElement filter;
	@FindBy(xpath = "//img[@class='close-icon']") 
	private WebElement filterclear;
	@FindBy(xpath = "//span[text()='Digital Material ']") 
	private WebElement maintitle;
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']") 
	private WebElement ibtn;
	@FindBy(xpath = "//*[@id=\"rate-wrapper\"]/div/div/div[2]/div[1]") 
	private WebElement ibtnclose;
	@FindBy(xpath = "//span[text()='Study Material']") 
	private WebElement studymtl;
	@FindBy(xpath = "//span[text()='Exercise']") 
	private WebElement exercise;
	//@FindBy(xpath = "//a[@id='p-tabpanel-18-label']/span") private WebElement exercise;
	@FindBy(xpath = "//span[text()='Race']") 
	private WebElement race;
	@FindBy(xpath = "//a[@id='p-tabpanel-3-label']/span[@class='p-tabview-title ng-star-inserted']") 
	private WebElement SpecialBooklet;
	@FindBy(xpath = "//span[text()='Class Notes']") 
	private WebElement classnotes;
	@FindBy(xpath = "//span[text()='Recorded Content']")
	private WebElement RecordedContent;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/left-arrow.png']") 
	private WebElement revisionback;
	@FindBy(xpath = "//span[text()='Race Video Solutions']") 
	private WebElement racevideosolution;
	@FindBy(xpath = "//img[@style='width: 25px; cursor: pointer;']")
	private WebElement racevideoback;
	@FindBy(xpath = "//*[@id=\"p-tabpanel-25-label\"]/span") 
	private WebElement exercisevideo;
	@FindBy(xpath = "//img[@style='width: 25px; cursor: pointer;']") 
	private WebElement exercisevideoback;
	@FindBy(xpath = "//*[@id=\"p-tabpanel-26-label\"]/span") 
	private WebElement ClassRecordings;
	@FindBy(xpath = "//img[@style='width: 25px; cursor: pointer;']")
	private WebElement Classerecordingback;
	@FindBy(xpath = "(//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/pdf_icon.svg'])[1]") 
	private WebElement openstudymtlpdf;
//	@FindBy(xpath = "(//th[text()='S. No.'])[1]") private WebElement srNOtbl;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;
//	@FindBy(xpath = "//*[text()='Revision']") private WebElement revisionB;

	public digitalmaterialpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
		
   public boolean digitalmtlButtonenabled_or_not() 
	
	{  
	    digmtl.click();
	boolean DM = digmtl.isEnabled(); 
	return DM; 
	}
	
   public String validatedigitalmtltext() {
	
	   String digi = digmtl.getText();
	   return digi;
}
   
   public void validate_i_btn() throws InterruptedException 
  
   {
	   digmtl.click();
	   ibtn.click();
	   Thread.sleep(1500);
	   ibtnclose.click();
	   Thread.sleep(1000);
   }
  
   public boolean validatesearchbtn() 
   {
	   digmtl.click();
	   boolean search = searchbox.isEnabled();
	   return search;
	   
   }
   
   public void validatefilter() throws InterruptedException {
	 //  digmtl.click();
	   filter.click();
	   Thread.sleep(1000);
	   filterclear.click();   
}
   
   public boolean validatemaintitle() {
	   
	   boolean title = maintitle.isDisplayed();
	   return title;
}
   public String validatescheduletext() {
	
	   String mainschedule = maintitle.getText();
	   return mainschedule;
}
   
   public String validatestudymtltext() {
	
	   String study = studymtl.getText();
	   return study;
}
   public boolean validateexercise() {
	  // digmtl.click();
	   exercise.click();
	   boolean exercisee = exercise.isDisplayed();
	   return exercisee;
}
   public String validateexercise_text() {
	
	   String exe = exercise.getText();
	   return exe;
}
   
   public boolean validaterace() {
	   //digmtl.click();
	   race.click();
	   boolean racee = race.isDisplayed();
	   return racee;	
}
   
   public String validaterace_text() {
	
	   String rec = race.getText();
	   return rec;
}
   public boolean validateSpecialBooklet() {
	  // digmtl.click();
	   SpecialBooklet.click();
	   boolean booklet = SpecialBooklet.isDisplayed();
	   return booklet;
}
   public String validateSpecialBooklet_text() {
	
	   String Sbook = SpecialBooklet.getText();
	   return Sbook;
}
   
   public boolean validateclassnotes() {
	  //digmtl.click();
	   classnotes.click();
	   boolean notes = classnotes.isDisplayed();
	   return notes;
}
   public String validateclassnotes_text() {
	
	   String Cnotes = classnotes.getText();
	   return Cnotes;
}
   
   public boolean validateRecordedContent() throws InterruptedException {
	   //digmtl.click();
	   RecordedContent.click();
	   Thread.sleep(1000);
	   boolean recordcon = RecordedContent.isDisplayed();
	   return recordcon;
	     
}
   public String validateRecordedContent_text() {
	
	   String Rcontent = RecordedContent.getText();
	   return Rcontent;
}
   
   public void validateRecordedContentback() {
	   
	  // revisionback.click();
	   digmtl.click();
}
  
   public boolean validateracevideosolution() {
	   digmtl.click();
	   racevideosolution.click();
	   boolean racevideo = racevideosolution.isDisplayed();
	   return racevideo;
}
   
   public String validateracevideosolution_text() {
	
	   String rvsolution = racevideosolution.getText();
	   return rvsolution;
}
   public void validateracevideoback() {
	
	   racevideoback.click();
}
   
   public boolean validateexercisevideo() {
	   digmtl.click();
	   exercisevideo.click();
	   boolean exevideo = exercisevideo.isDisplayed();
	   return exevideo;
	  
}
   public String validateexercisevideo_text() {
	
	   String evideo = exercisevideo.getText();
	   return evideo;
}
   public void validateexercisevideoback() {
	   digmtl.click();
	 //  exercisevideoback.click();
}
 public boolean validateClassRecordings() {
	 digmtl.click();
	 ClassRecordings.click();
	 boolean classrecord = ClassRecordings.isDisplayed();
	 return classrecord;
	 
}
 
 public String validateClassRecordings_text() {
	
	 String crecord = ClassRecordings.getText();
	 return crecord;
}
 
 public void validateClasserecordingback() {
	
	 Classerecordingback.click();
}
   
 public void validatestudymaterial() {
	
	 studymtl.click();
}
 
 public String validatestudymaterialtext() {
	
	 String sm = studymtl.getText();
	 return sm;
}
 public void validateopenstudymtlpdf() {
	
	 openstudymtlpdf.click();
}
 
}
