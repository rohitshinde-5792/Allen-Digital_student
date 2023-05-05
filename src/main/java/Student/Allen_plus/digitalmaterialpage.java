package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class digitalmaterialpage {
	//span[text()='Exercise']
	
	@FindBy(xpath = "//span[text()='Digital Material']") private WebElement digmtl;
	@FindBy(xpath = "//input[@type='text']") private WebElement searchbox;
	@FindBy(xpath = "//a[@class='bg-white mr-0']") private WebElement filter;
	@FindBy(xpath = "//a[text()='Clear']") private WebElement filterclear;
	@FindBy(xpath = "//span[@class='main-title']") private WebElement maintitle;
	@FindBy(xpath = "//img[@class='info-icon ng-star-inserted']") private WebElement ibtn;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/closewhite.svg']") private WebElement ibtnclose;
	@FindBy(xpath = "//span[text()='Exercise']") private WebElement exercise;
	@FindBy(xpath = "//span[text()='Race']") private WebElement race;
	@FindBy(xpath = "//span[text()='Special Booklet']") private WebElement SpecialBooklet;
	@FindBy(xpath = "//span[text()='Class Notes']") private WebElement classnotes;
	@FindBy(xpath = "(//span[text()='Recorded Content'])[2]") private WebElement RecordedContent;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/allenplus3/assets/images/left-arrow.png']") private WebElement revisionback;
	@FindBy(xpath = "//span[text()='Race Video Solutions']") private WebElement racevideosolution;
	@FindBy(xpath = "//img[@style='width: 25px; cursor: pointer;']") private WebElement racevideoback;
	@FindBy(xpath = "//span[text()='Exercise Video Solutions']") private WebElement exercisevideo;
	@FindBy(xpath = "//img[@style='width: 25px; cursor: pointer;']") private WebElement exercisevideoback;
	@FindBy(xpath = "//span[text()='Class Recordings']") private WebElement ClassRecordings;
	@FindBy(xpath = "//img[@style='width: 25px; cursor: pointer;']") private WebElement Classerecordingback;
//	@FindBy(xpath = "(//th[text()='Description'])[1]") private WebElement Descriptiontbl;
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
	    //digmtl.click();
	boolean DM = digmtl.isEnabled(); 
	return DM; 
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
   
   public void validatefilter() {
	   digmtl.click();
	   filter.click();
	   filterclear.click();   
}
   
   public boolean validatemaintitle() {
	   
	   boolean title = maintitle.isDisplayed();
	   return title;
}
   
   public boolean validateexercise() {
	   digmtl.click();
	   exercise.click();
	   boolean exercisee = exercise.isDisplayed();
	   return exercisee;
}
   
   public boolean validaterace() {
	   digmtl.click();
	   race.click();
	   boolean racee = race.isDisplayed();
	   return racee;	
}
   
   public boolean validateSpecialBooklet() {
	   digmtl.click();
	   SpecialBooklet.click();
	   boolean booklet = SpecialBooklet.isDisplayed();
	   return booklet;
}
   
   public boolean validateclassnotes() {
	   digmtl.click();
	   classnotes.click();
	   boolean notes = classnotes.isDisplayed();
	   return notes;
}
   public boolean validateRecordedContent() {
	   digmtl.click();
	   RecordedContent.click();
	   boolean recordcon = RecordedContent.isDisplayed();
	   return recordcon;
	     
}
   
   public void validateRecordedContentback() {
	   
	   revisionback.click();
	
}
   public boolean validateracevideosolution() {
	   digmtl.click();
	   racevideosolution.click();
	   boolean racevideo = racevideosolution.isDisplayed();
	   return racevideo;
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
   
   public void validateexercisevideoback() {
	   
	   exercisevideoback.click();
}
 public boolean validateClassRecordings() {
	// digmtl.click();
	 ClassRecordings.click();
	 boolean classrecord = ClassRecordings.isDisplayed();
	 return classrecord;
	 
}
 
 public void validateClasserecordingback() {
	
	 Classerecordingback.click();
}
   
}
