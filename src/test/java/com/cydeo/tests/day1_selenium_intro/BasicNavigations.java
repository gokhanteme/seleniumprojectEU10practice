package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        // 1- Set up the browser driver

        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium WebDriver
        // This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //This line will maximize the browser size
        driver.manage().window().maximize();

        //This line will maximize the browser size
        //driver.manage().window().fullscreen();

        //3- Go to "https:www.tesla.com"

        driver.get("https://www.tesla.com");

        // use selenium to navigate back

        //stop code execution for 3 seconds

        Thread.sleep(3000);

        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();


        String currenTitle = driver.getTitle();

        System.out.println("currenTitle = " + currenTitle);

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to:
        driver.navigate().to("https://www.google.com");

        // use getTitle():
        //System.out.println("driver.getTitle() = " + driver.getTitle());



    currenTitle = driver.getTitle();

        System.out.println("currenTitle = " + currenTitle);

        //Get the current URL using Selenium
        String currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        // this will close the current opened window
        driver.close();

        // this will close all opened windows
        driver.quit();



    }






}
