package Orange.HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Deleteimmigration extends login1 {
	@AfterMethod
		public void first() throws InterruptedException {
	       

	        
	         // Go to My Info section
	         WebElement myInfoTab = driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']"));
	         myInfoTab.click();
	         
	         
	         // Navigate to Immigration section
	         WebElement immigrationTab = driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewImmigration/empNumber/7']"));
	         immigrationTab.click();
	         Thread.sleep(500);
	         // Click Delete button
	         WebElement deleteButton = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-trash'])[2]"));
	         deleteButton.click();
	         WebElement deleteOK = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']"));
	         deleteOK.click();

	         
	     }
	}     


