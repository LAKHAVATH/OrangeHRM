package Orange.HRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DELETEimmi {
	@Test

	public void set1Up() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

        // Open the URL
         driver.manage().window().maximize();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

         Thread.sleep(500);
    }

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
       WebDriver driver1 = new ChromeDriver();
    // Enter username
       WebElement usernameField = driver1.findElement(By.xpath("//input[@name='username']"));
       usernameField.sendKeys("Admin");

       // Enter password
       WebElement passwordField = driver1.findElement(By.xpath("//input[@name='password']"));
       passwordField.sendKeys("admin123");

       // Click login button
       WebElement loginButton = driver1.findElement(By.xpath("//button[@type='submit']"));
       loginButton.click();
       
      Thread.sleep(1000);
		}

    @Test(priority = 2)

    public void deletelmmigrationDetails() throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
    // Navigate to My Info section
    	WebElement myInfoTab = driver.findElement(By.xpath("// a[@href='/web/index.php/pim /viewMyDetails']"));

    myInfoTab.click();

    // Navigate to Immigration section

    WebElement immigrationTab = driver.findElement(By.xpath("// a[@href='/web/index.php/pim /viewImmigration/empNumber/7']"));
    immigrationTab.click();
    
    // Click Delete button
    WebElement deleteButton = driver.findElement(By.xpath("//i[@xpath='1']"));
    deleteButton.click();

    Thread.sleep(1000);

    

        
    }

    
}