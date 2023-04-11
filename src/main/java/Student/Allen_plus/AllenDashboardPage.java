package Student.Allen_plus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllenDashboardPage {
	@FindBy(xpath = "//*[@class='nav-link dropdown-toggle']")
	private WebElement profilename;
	
	public AllenDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getprofilename() {
		String actprofilename = profilename.getText();
		return actprofilename;
	}
	
}
