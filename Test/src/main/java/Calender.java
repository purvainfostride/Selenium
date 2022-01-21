import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Calender {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        driver.manage().window().maximize();
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();

        WebElement recruit = driver.findElement(By.xpath("//*[contains(@id,'menu_recruitment_viewRecruitmentModule')]"));
        recruit.click();
        driver.findElement(By.xpath("//*[contains(@id,'candidateSearch_fromDate')]")).click();
        Select calMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
        calMonth.selectByValue("1");
        Select calYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
        calYear.selectByValue("2022");
        while (!(calMonth.equals("Jun") && calYear.equals("2022"))) {
            driver.findElement(By.xpath("//a[@title='Next']")).click();
            calMonth.selectByValue("1");
            calYear.selectByValue("2022");
        }
        driver.findElement(By.xpath("//a[text()='23']")).click();


    }
}
