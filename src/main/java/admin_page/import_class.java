package admin_page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class import_class {

	public static void main(String[] args) throws InterruptedException, AWTException {
		

//		        WebDriver driver=new ChromeDriver(op);
//				ChromeOptions op=new ChromeOptions();
//		     	op.addArguments("--remote-allow-origins=*");
//		     	op.addArguments("--disable-notifications");
		
     	WebDriver driver=new ChromeDriver();
     	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://allenqa.thinkexam.com/admin");
		
		//"https://allenqa.thinkexam.com/admin"
		//https://allendigitaluat.thinkexam.com/admin
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginId")).sendKeys("rohit.katyayan@gingerwebs.in");
		
		driver.findElement(By.id("password")).sendKeys("@6m1n#123$");
		
		driver.findElement(By.id("loginSubmit")).click();
		
		Thread.sleep(4000); 
		
		driver.findElement(By.xpath("//body/div[@class='maincontainer']/div[@id='wrapper']/div[@id='mainMenuDiv']/div[@class='menu']/ul/li[@id='mainmenu_Courses']/a/span[1]")).click();
		
		Thread.sleep(3000); 
		
		driver.findElement(By.xpath("//span[@class='inrsbmenu CLASSES']")).click();// class
		
		driver.findElement(By.xpath("//a[normalize-space()='Import Class']")).click();// import class
		
		driver.findElement(By.xpath("//*[@id=\"sidelinkraw\"]/div[1]/a")).click(); // import
		
		WebElement classtype = driver.findElement(By.xpath("//select[@id='import_class_type']"));  // class type
		
		Select s= new Select(classtype);
		
		s.selectByIndex(1);
		
		WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[3]"));

		button.click();
		
		Robot rb=new Robot();
		
		rb.delay(1000);
		
		// put 
		StringSelection ss=new StringSelection("C:\\selenium files\\Live_Class_Import_Sample 31 may.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//CTRL + V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		String classname = driver.findElement(By.xpath("(//a[@style='word-break: break-word;'])[1]")).getText();
		
		System.out.println(classname);
		
		driver.navigate().to("https://allenqa.thinkexam.com/faculty");
		
		driver.findElement(By.xpath("//input[@id='loginId']")).sendKeys("sumit.choudhary1712@gmail.com");
		
		//driver.findElement(By.xpath("//input[@id='loginId']")).sendKeys("a.amit2212@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Me04b082@sumit");
		
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123456");
		
		driver.findElement(By.xpath("//input[@id='loginSubmit']")).click();
		

		
		
		//course
		driver.findElement(By.xpath("//*[@id=\"mainmenu_Courses\"]/a/span")).click();
		//class
		driver.findElement(By.xpath("(//span[@class='inrsbmenu'])[3]")).click();
		
		driver.navigate().refresh();
		//join
		driver.findElement(By.xpath("//input[@id='liveClass']")).click();
		
		Thread.sleep(6000);
		
		//String windowidd = driver.getWindowHandle();
		
		//System.out.println(windowidd);
		
		//driver.switchTo().alert().accept(); 
		
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--disable-notifications");
		//span[@class='tit-name']
		
		
		//String windowidd = driver.getWindowHandle();
		
		//System.out.println(windowidd);
		
		//driver.switchTo().alert().accept();
		
		
		
		driver.navigate().to("https://allenqa.thinkexam.com/login");
		
		//student login                    UAT 1002133114    QA  1000493232
		driver.findElement(By.xpath("(//input[@name='user'])[1]")).sendKeys("1000493232");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("dstd#123");
		
		driver.findElement(By.xpath("//input[@id='reg-code']")).sendKeys("susr");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	
		
		String classnamee = driver.findElement(By.xpath("//span[@class='tit-name']")).getText();
		
		System.out.println(classnamee);
		
		driver.findElement(By.xpath("//button[text()='Join']")).click();
		
			
	}

}
