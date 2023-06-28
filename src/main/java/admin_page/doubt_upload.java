package admin_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class doubt_upload {

	public static void main(String[] args) throws InterruptedException {
	

        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://allenqa.thinkexam.com/login");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@name='user'])[1]")).sendKeys("1000493232");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("dstd#123");
		
		driver.findElement(By.xpath("//input[@id='reg-code']")).sendKeys("susr");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);
		// Doubt & Solution
		driver.findElement(By.xpath("//span[normalize-space()='Doubt & Solution']")).click();
		// ask doubt
		driver.findElement(By.xpath("//button[@class='ask-doubt']")).click();
		// doubt yes
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		// write doubt animation
		driver.findElement(By.xpath("//lottie-player[@class='writing-text']")).click();
		//
		driver.findElement(By.xpath("//*[@id=\"float-input\"]")).sendKeys("Doubt by automation2");
		
		// select sub click
		driver.findElement(By.xpath("//*[text()=\"Select Subject\"]")).click();
		//physics
		driver.findElement(By.xpath("(//*[text()='Physics'])[1]")).click();
		//select topic
		driver.findElement(By.xpath("//*[text()='Select Topic']")).click();
		// vector
		driver.findElement(By.xpath("//*[text()='Vector']")).click();
		//apply
		driver.findElement(By.xpath("//*[text()=' Submit ']")).click();
		Thread.sleep(6000);
		
		String doubt = driver.findElement(By.xpath("//*[text()=' Doubt by automation2']")).getText();
		
		System.out.println(doubt);
		
		String actresult = doubt;
		String expresult="Doubt by automation2";
		
		//Assert.assertEquals(actresult, expresult);
		
		if(actresult.equals(expresult))
		{
			
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
		}
	}

}
