package Orange.HRM;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.Test;
	
	
	
	public class AddImmigration extends login1 {

	
		@AfterMethod
		public void add(){

				WebElement myinfo =  driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
				myinfo.click();
				
				
				WebElement immigration = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
				immigration.click();
				
				WebElement addinfo = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
				addinfo.click();
				
				WebElement radio1 = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]"));
				radio1.click();

				
				WebElement passnumber = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
				passnumber.click();
				passnumber.sendKeys("nav356");
				
				WebElement issuedate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
				issuedate.click();
				issuedate.sendKeys("18-07-2015");
				
				WebElement expirydate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
				expirydate.click();
				expirydate.sendKeys("ELIGIBLE");

				WebElement eligiblestatus = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]"));
				eligiblestatus.click();
				eligiblestatus.sendKeys("28-02-2033");


			
				
				
				WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
				comments.click();
				comments.sendKeys("All Selected Details are Valid");
				
				WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
				save.click();

			
			
	  }
		}     



