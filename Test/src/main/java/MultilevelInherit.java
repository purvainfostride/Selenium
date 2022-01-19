import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 class parent{
     WebDriver driver = new ChromeDriver();
     String userName = "Cassidy Dope5";
    void login() {
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); //to get to this page
        driver.manage().window().maximize();
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
    }
    void addUser() throws InterruptedException{
        WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        admin.click();
        WebElement users = driver.findElement(By.id("menu_admin_UserManagement"));
        users.click();
        WebElement userButton = driver.findElement(By.id("menu_admin_viewSystemUsers"));
        userButton.click();
        driver.findElement(By.name("btnAdd")).click();
        driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Cassidy Hope");
        driver.findElement(By.id("systemUser_userName")).sendKeys(userName);
        driver.findElement(By.name("systemUser[password]")).sendKeys("Hello*#@1234");
        driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys("Hello*#@1234");
        WebElement saveButton = driver.findElement(By.xpath("//input[@value='Save']"));
        Thread.sleep(2000);
        saveButton.click();
    }
    void searchUser() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("Cassidy Dope2");
        driver.findElement(By.id("searchBtn")).click();
    }
    void deleteUser()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.name("chkSelectRow[]")).click();
        driver.findElement(By.name("btnDelete")).click();
        driver.findElement(By.id("dialogDeleteBtn")).click();
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
        I.addUser();
        I.searchUser();
        I.deleteUser();
        I.logoutUser();

    }
}
