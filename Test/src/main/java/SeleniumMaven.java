import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumMaven {
    public static void main(String[] args)  throws InterruptedException {
        //.........................................WEBDRIVER
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        //.........................................................BROWSER ACTIONS
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); //to get to this page


        System.out.println(driver.getTitle());
        //........................................................SWITCHTO
      /* String originalWindow = driver.getWindowHandle();
      driver.switchTo().newWindow(WindowType.WINDOW);
      driver.switchTo().newWindow(WindowType.TAB);
      driver.switchTo().window(originalWindow); // if this is not here the control will be at TAB and not at original window
      */ //driver.close(); it will close the current tab not complete session
        //driver.quit(); will quit the whole browser session

        //.................................................Window management-size
      /*   int width= driver.manage().window().getSize().getWidth();
        int height= driver.manage().window().getSize().getHeight();
        Dimension size= driver.manage().window().getSize();
        System.out.println("Width of the window is" + size.getWidth());
        System.out.println("height of the window is"+size.getHeight());
        driver.manage().window().setSize(new Dimension(900,1000));  */
        //.................................................Window management-position
        /* driver.manage().window().getPosition().getX();
        driver.manage().window().getPosition().getY();
        Point position= driver.manage().window().getPosition();
        System.out.println(position.getX());
        System.out.println(position.getX());
        driver.manage().window().setPosition(new Point(200,100)); */
        //.................................................Window management
      /*  driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        //...................................................for screenshot
        File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,new File("./image.png"));  */
        //.......................................................            JAVASCRIPT EXECUTOR
        JavascriptExecutor js = (JavascriptExecutor)driver;
      /*  ......................................Get return value from script
      WebElement button =driver.findElement(By.name("btnI"));
        String text = (String) js.executeScript("return arguments[0].innerText", button);
        //......................................JavaScript to click element
        js.executeScript("arguments[0].click();", button);
        execute JS directly
        js.executeScript("console.log('hello world')");*/




    }
}
