package Orange.HRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginHRM {
@Test
    
    public void setUp() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

        // Open the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.manage().window().maximize();
         Thread.sleep(500);
        // Enter username
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        usernameField.sendKeys("Admin");

        // Enter password
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("admin123");

        // Click login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Wait
       Thread.sleep(500);
       Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login failed!");

      
    
}


    
		
    }


