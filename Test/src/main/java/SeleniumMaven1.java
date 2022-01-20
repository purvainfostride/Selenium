import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;
import java.io.File;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class SeleniumMaven1 {
    public static void main(String[] args)  throws InterruptedException {
        //.........................................WEBDRIVER
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        String userName = "Cassidy Dope";

       //................................................... ........LOGIN....................
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); //to get to this page
        driver.manage().window().maximize();
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
        //................................................... ..................................
        /*  WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        actions.moveToElement(admin).perform();
        WebElement users= driver.findElement(By.id("menu_admin_UserManagement"));
        actions.moveToElement(users).perform();
        WebElement userButton= driver.findElement(By.id("menu_admin_viewSystemUsers"));
        userButton.click();
       //.........................................................Adding user
        driver.findElement(By.name("btnAdd")).click();
        driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Cassidy Dope");
        driver.findElement(By.id("systemUser_userName")).sendKeys(userName);
        driver.findElement(By.name("systemUser[password]")).sendKeys("Hello*#@1234");
        driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys("Hello*#@1234");
        WebElement saveButton = driver.findElement(By.xpath("//input[@value='Save']"));
        Thread.sleep(2000);
        saveButton.click();
    //  Thread.sleep(2000);
      //  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("searchSystemUser[userName]")));
        //..........................................................Searching user
        driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("demo1");
        driver.findElement(By.id("searchBtn")).click();
   String searchedUsernameXpath = "//a[contains(text(),'%s')]";
       WebElement searchedUsername = driver.findElement(By.xpath(String.format(searchedUsernameXpath, userName)));
        Assert.isTrue(searchedUsername.getText().equals(userName),"Username Not found");  */
        //................................................... ........LOGOUT....................
         /*   driver.findElement(By.id("welcome")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Logout")).click();

       // Thread.sleep(2000);
       // driver.close();
        //................................................... ........DELETE....................
        driver.findElement(By.id("ohrmList_chkSelectRecord_54")).click();
        driver.findElement(By.name("btnDelete")).click();
        driver.findElement(By.id("dialogDeleteBtn")).click(); */
        //.....................................................................................
        WebElement recruit= driver.findElement(By.xpath("//*[contains(@id,'menu_pim_viewMyDetails')]"));
        recruit.click();
        WebElement recruit1= driver.findElement(By.xpath("//*[contains(@id,'empPic')]"));
        recruit1.click();

        //driver.findElement(By.id("candidateSearch_fromDate")).click();
       // driver.findElement(By.id("candidateSearch_fromDate")).sendKeys("2022-01-13");
      //  driver.findElement(By.id("candidateSearch_fromDate")).sendKeys(Keys.ENTER);





    }
}

