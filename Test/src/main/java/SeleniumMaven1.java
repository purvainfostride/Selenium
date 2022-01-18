import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.io.File;

public class SeleniumMaven1 {
    public static void main(String[] args)  throws InterruptedException {
        //.........................................WEBDRIVER
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        String userName = "Cassidy Hope";

       //................................................... ........LOGIN....................
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); //to get to this page
        driver.manage().window().maximize();
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
        //................................................... ..................................
        WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        actions.moveToElement(admin).perform();
        WebElement users= driver.findElement(By.id("menu_admin_UserManagement"));
        actions.moveToElement(users).perform();
        WebElement userButton= driver.findElement(By.id("menu_admin_viewSystemUsers"));
        userButton.click();
          driver.findElement(By.name("btnAdd")).click();
        driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Cassidy Hope");
        driver.findElement(By.id("systemUser_userName")).sendKeys(userName);
        driver.findElement(By.name("systemUser[password]")).sendKeys("Hello*#@1234");
        driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys("Hello*#@1234");
        WebElement saveButton = driver.findElement(By.xpath("//input[@value='Save']"));
        Thread.sleep(2000);
        saveButton.click();
        driver.findElement(By.name("searchSystemUser[userName]")).sendKeys(userName);
        driver.findElement(By.id("searchBtn")).click();
       /*   String searchedUsernameXpath = "//a[contains(text(),'%s')]";
       WebElement searchedUsername = driver.findElement(By.xpath(String.format(searchedUsernameXpath, userName)));
        Assert.isTrue(searchedUsername.getText().equals(userName),"Username Not found");  */
        //................................................... ........LOGOUT....................
         /*   driver.findElement(By.id("welcome")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Logout")).click(); */
      //  driver.findElement(By.id("btnDelete")).sendKeys("Aatim9");






    }
}

