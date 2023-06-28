package admin_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class integration_of_DP {

	@Test(dataProvider="LoginData", dataProviderClass=student_login_exceldataprovider.class)
	public void LoginTest(String userName, String password,  String capcha) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://allenqa.thinkexam.com/login");
		driver.findElement(By.xpath("(//input[@name='user'])[1]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='reg-code']")).sendKeys(capcha);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		String exp_text="SUBHASISH TRIPATHY";
		String act_text=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).getText();
		System.out.println(act_text);
		
		SoftAssert  soft = new SoftAssert();
		soft.assertEquals(act_text, exp_text,"Failed: actual & expected text didn't matched");
		soft.assertAll();
		
		Thread.sleep(3000);
		driver.close();
	}

	
}
