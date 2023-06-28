package Student.Allen_plus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class create_digital_material {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
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
		//course
		driver.findElement(By.xpath("//*[@id=\"mainmenu_Courses\"]/a/span")).click();
		//DM
		driver.findElement(By.xpath("//*[@id=\"sm_Notes\"]/a/span")).click();
		//add
		driver.findElement(By.xpath("//*[@id=\"addPack\"]/a")).click();
		Thread.sleep(1000);
		
		WebElement DMtype = driver.findElement(By.xpath("//*[@id=\"notestype\"]"));
		
		Select s1=new Select(DMtype);
		
		s1.selectByIndex(4);
		
		Thread.sleep(1000);
		WebElement studenttype = driver.findElement(By.xpath("//*[@id=\"studenttype\"]"));
		
     Select s2=new Select(studenttype);
		
     s2.selectByIndex(2);
     Thread.sleep(1000);
     driver.findElement(By.xpath("//*[@id=\"noteName\"]")).sendKeys("DM by automation");
     //center dropdown
     driver.findElement(By.xpath("//*[@id=\"notice_subjectcenter\"]/div/div/span")).click();
     Thread.sleep(1000);
     // bhubaneshwar
     driver.findElement(By.xpath("//*[@id=\"notice_subjectcenter\"]/div/div/ul/li[4]/label/span")).click();
	//stream drop
     driver.findElement(By.xpath("//*[@id=\"note_subjectstream\"]/div/div/span")).click();
     Thread.sleep(1000);
     //jee main advance
     driver.findElement(By.xpath("//*[@id=\"note_subjectstream\"]/div/div/ul/li[5]/label/span")).click();
     //master cource
     driver.findElement(By.xpath("//*[@id=\"note_Mcourses\"]/div/div/span")).click();
     Thread.sleep(1000);
     //enthuse
     driver.findElement(By.xpath("//*[@id=\"note_Mcourses\"]/div/div/ul/li[3]/label/span")).click();
     //cource drop
     driver.findElement(By.xpath("//*[@id=\"note_courses\"]/div/div/span/span[1]")).click();
     Thread.sleep(1000);
     //101029
     driver.findElement(By.xpath("//*[@id=\"note_courses\"]/div/div/ul/li[3]/label/span")).click();
	//subject drop
     driver.findElement(By.xpath("//*[@id=\"note_subjectId\"]")).click();
     Thread.sleep(1000);
	//subject
     WebElement subject = driver.findElement(By.xpath("//select[@id=\"note_subjectId\"]"));
     Thread.sleep(1000);
     Select s3=new Select(subject);
		
     s3.selectByIndex(9);
		
     WebElement topic = driver.findElement(By.xpath("//select[@id=\"topicId_note\"]"));
	
    // Thread.sleep(1000);
     Select s4=new Select(subject);
		
     s4.selectByIndex(1);
     
   WebElement subtopic = driver.findElement(By.xpath("//select[@id=\"sub_topicId_note\"]"));
   
  // Thread.sleep(1000);
   Select s5=new Select(subject);
		
   s5.selectByIndex(2);
   //batch phase
   driver.findElement(By.xpath("//*[@id=\"note_batchPhase\"]/div/div/span")).click();
   
   driver.findElement(By.xpath("//*[@id=\"note_batchPhase\"]/div/div/ul/li[3]/label/span")).click();
   Thread.sleep(1000);
   //batch
   driver.findElement(By.xpath("//*[@id=\"noteBatch\"]/div/div/span")).click();
   
   driver.findElement(By.xpath("//*[@id=\"noteBatch\"]/div/div/ul/li[56]/label/span")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id='language_1']")).click();
   Thread.sleep(1000);
   //choose file
   driver.findElement(By.xpath("//*[@id=\"race_1\"]")).click();
   
   Thread.sleep(1000);
   
   Robot rb=new Robot();
	
	rb.delay(1000);
	
	// put 
	StringSelection ss=new StringSelection("C:\\selenium files\\sample pdff.pdf");
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
   
	driver.findElement(By.xpath("//*[@id=\"saveNote\"]")).click();
   
	}

}
