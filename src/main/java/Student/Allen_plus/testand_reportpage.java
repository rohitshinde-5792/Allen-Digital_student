package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testand_reportpage {

	@FindBy(xpath = "//*[text()='Test and Reports ']")
	private WebElement testandreport; 
	@FindBy(xpath = "(//img[@src='https://d1sc0s0nb5z771.cloudfront.net/student/assets/image/info-icon-new.png'])[2]")
	private WebElement testandreportibtn;
	@FindBy(xpath = "(//img[@src='https://d1sc0s0nb5z771.cloudfront.net/student/assets/image/graycross.svg'])[1]")
	private WebElement testandreportibtnclose;
	@FindBy(xpath = "//ul//a[text()=' IMPROVE ']")
	private WebElement improve;
	@FindBy(xpath = "//ul//a[text()=' CHANCE   ']")
	private WebElement chance;
	@FindBy(xpath = "//a[text()=' MY TEST ']")
	private WebElement mytest;
	@FindBy(xpath = "//img[@src='https://d1sc0s0nb5z771.cloudfront.net/student/assets/image/Group 199557.png']")
	private WebElement filterclick;
	@FindBy(xpath = "//span[@style='float:right;font-size: 22px;']")
	private WebElement filterclose;
	@FindBy(xpath = "//a[text()='Reports']")
	private WebElement Reports;
	@FindBy(xpath = "(//img[@src='https://d1sc0s0nb5z771.cloudfront.net/student/assets/image/info-icon-new.png'])[1]")
	private WebElement Reportsibtn;
	@FindBy(xpath = "(//img[@src='https://d1sc0s0nb5z771.cloudfront.net/student/assets/image/graycross.svg'])[1]")
	private WebElement Reportsibtnclose;
	@FindBy(xpath = "//a[text()=' TOPIC ANALYSIS ']")
	private WebElement topicanalysis;
	@FindBy(xpath = "(//a[text()=' REPORT CARD '])[1]")
	private WebElement reportcard;
	@FindBy(xpath = "(//a[text()=' TEST REPORTS '])[1]")
	private WebElement testreports;
//	@FindBy(xpath = "//a[text()=' MY TEST ']")
//	private WebElement mytest;
//	@FindBy(xpath = "//a[text()=' MY TEST ']")
//	private WebElement mytest;


public testand_reportpage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public void validatetestandreport() {
	
	testandreport.click();
}

public String validatetestandreporttext() {
	
	String testreport = testandreport.getText();
	return testreport;
}

public void validatetestibtn() {
	testandreportibtn.click();
	
}

public void validateibtnclose() {
	testandreportibtnclose.click();
}

public void validateimprove() {
	
	improve.click();
}

public void validateimprovetext() {
	
	improve.getText();
}

public void validatechance() {
	
	chance.click();
}


public String validatechancetext() {
	
	String chanc = chance.getText();
	return chanc;
}
public void validatemytest() {
	
	mytest.click();
}

public String validatemytesttext() {
	
	String mytes = mytest.getText();
	return mytes;
}
public void validateReports() {
	
	Reports.click();
}

public String validateReportstext() {
	
	String rep = Reports.getText();
	return rep;
}
public void validatefilter() throws InterruptedException {
	
	filterclick.click();
	Thread.sleep(1500);
}

public void validatefilterclose() {
	
	filterclose.click();
}

public void validatatopicanalysis() {
	
	topicanalysis.click();
}

public String validatatopicanalysistext() {
	
	String topicanaly = topicanalysis.getText();
	return topicanaly;
}

public void validateReportcard() {
	
	reportcard.click();
}

public String validateReportcardtext() {
	
	String reportcar = reportcard.getText();
	return reportcar;
}
public void validatetestreports() {
	
	testreports.click();
}

public void validatetestreportstext() {
	
	testreports.getText();
}

}
