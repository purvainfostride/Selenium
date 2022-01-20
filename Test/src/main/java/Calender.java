import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class Calender {
    public static void main(String[] args){
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        driver.manage().window().maximize();
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
        WebElement recruit= driver.findElement(By.xpath("//*[contains(@id,'menu_recruitment_viewRecruitmentModule')]"));
        recruit.click();
        driver.findElement(By.id("candidateSearch_fromDate")).click();


    }
}
