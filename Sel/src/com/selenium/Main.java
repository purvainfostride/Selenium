package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        // chrome browser----------------> chromedriver
        //1. Open the chrome browser
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
        WebDriver cdriver= new ChromeDriver();
        //2. Navigate to the URL
        cdriver.navigate().to("http://www.google.com");  //.refresh(); .back(); .forward();
        //3. close the browser
        cdriver.close();
        // firefox browser---------------> firefoxdriver
        //1. Open the chrome browser
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\drivers\\geckodriver.exe");
        WebDriver fdriver= new FirefoxDriver();
        //2. Navigate to the URL
        fdriver.get("http://www.google.com");

        //3. close the browser
        fdriver.close();

    }
}
