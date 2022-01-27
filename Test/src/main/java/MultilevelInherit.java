import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.Random;

class parent{
     WebDriver driver = new ChromeDriver();
     Random random = new Random();
     int x = random.nextInt(60);
     String userName = "userno"+x;

    void login() {
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); //to get to this page
        driver.manage().window().maximize();
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
    }
    void test() {
        SoftAssert softAssert= new SoftAssert();
        driver.get(driver.getCurrentUrl());
        String expectedTitle ="OraangeHRM";
        String actualTitle =driver.getTitle();
        softAssert.assertEquals(actualTitle,expectedTitle,"Title" );
        softAssert.assertNotEquals(actualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        //softAssert.assertNull(expectedTitle);  Always fails
        softAssert.assertNotNull(expectedTitle);
      //  softAssert.assertAll();// to display in console that which test cases failed
    }
    void menuAdmin(){
        WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        admin.click();
        WebElement users = driver.findElement(By.id("menu_admin_UserManagement"));
        users.click();
        WebElement userButton = driver.findElement(By.id("menu_admin_viewSystemUsers"));
        userButton.click();
    }
   void addUser() throws InterruptedException{
        driver.findElement(By.name("btnAdd")).click();
        driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Ananya Dash");
        driver.findElement(By.id("systemUser_userName")).sendKeys(userName);
        driver.findElement(By.name("systemUser[password]")).sendKeys("Hello*#@1234");
        driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys("Hello*#@1234");
        WebElement saveButton = driver.findElement(By.xpath("//input[@value='Save']"));
        Thread.sleep(2000);
        saveButton.click();
      }
    void searchUser() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.name("searchSystemUser[userName]")).sendKeys(userName);
        driver.findElement(By.id("searchBtn")).click();
    }
    void deleteUser()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.name("chkSelectRow[]")).click();
        driver.findElement(By.name("btnDelete")).click();
        driver.findElement(By.id("dialogDeleteBtn")).click();
    }
    void menuRecruit(){
        WebElement recruit= driver.findElement(By.xpath("//*[contains(@id,'menu_recruitment_viewRecruitmentModule')]"));
        recruit.click();
        //..........................................DROP DOWN MENU- Job TITLE
        Select jobTitle= new Select(driver.findElement(By.id("candidateSearch_jobTitle")));
        jobTitle.selectByVisibleText("BTest");
        //..........................................DROP DOWN MENU- Status
        Select status= new Select(driver.findElement(By.id("candidateSearch_status")));
        status.selectByValue("SHORTLISTED");
        //.........................................Calender-Date of Application
        driver.findElement(By.id("candidateSearch_fromDate")).click();
        driver.findElement(By.id("candidateSearch_fromDate")).sendKeys("2022-01-13");
        driver.findElement(By.id("candidateSearch_fromDate")).sendKeys(Keys.ENTER);
        //.........................................Calender-To
        driver.findElement(By.id("candidateSearch_toDate")).click();
        driver.findElement(By.id("candidateSearch_toDate")).sendKeys("2022-02-13");
        driver.findElement(By.id("candidateSearch_toDate")).sendKeys(Keys.ENTER);
    }
    void menuPim(){
        WebElement pim= driver.findElement(By.xpath("//*[contains(@id,'menu_pim_viewPimModule')]"));
        pim.click();
        driver.findElement(By.id("menu_pim_addEmployee")).click();
        WebElement photograph= driver.findElement(By.xpath("//*[contains(@id,'photofile')]"));
        photograph.sendKeys("C:\\Users\\Purva\\Downloads\\download.png");
        photograph.click();
    }

  void logoutUser () throws InterruptedException{
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Logout")).click();
    }
}

public class MultilevelInherit extends parent{
    public static void main(String[] args)  throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        MultilevelInherit I = new MultilevelInherit ();
        I.login();
        I.test();
        I.menuAdmin();
        I.addUser();
        I.searchUser();
        I.deleteUser();
        I.menuRecruit();
        I.menuPim();
        I.logoutUser();


    }
}
