package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        // do set up for browser driver
        WebDriverManager.chromedriver().setup();
        //1. open Chrome browser

        WebDriver driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // Go to "https:// www.yahoo.com
        driver.get("https://www.yahoo.com");

        // 3. Verify title
        driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());


    }

}
