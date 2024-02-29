package Orange.HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class EmergencyContact extends login1 {
	@AfterMethod
	public void addContact(){
		
		WebElement myInfoTab = driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']"));
        myInfoTab.click();
        
		WebElement emergency = driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewEmergencyContacts/empNumber/7']"));
        emergency.click();
        WebElement adde = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button"));
        adde.click();
        WebElement name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"));
        name.sendKeys("Naveen");
        WebElement relation = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"));
        relation.sendKeys("Brother");
        WebElement mobile = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input"));
        mobile.sendKeys("1234567890");
        WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]"));
        save.click();
		

}
}