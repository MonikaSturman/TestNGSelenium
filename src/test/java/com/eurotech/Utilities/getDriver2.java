package com.eurotech.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class getDriver2 {

    public static WebDriver getDriverPractise(String browserType){

        WebDriver driver = null;

        if (browserType == "Firefox"){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserType == "Chrome") {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }
}

class getDriverTest{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = getDriver2.getDriverPractise("Firefox");

        driver.get("https://github.com/login");
        System.out.println("driver.getTitle() = " + driver.getTitle());

        String expectedResult = "Sign in to GitHub · GitHub";
        String actualResult = driver.getTitle();

        if (expectedResult.equals(actualResult)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        Thread.sleep(3000);

        driver.navigate().to("http://www.amazon.co.uk");
        //driver.close();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        String expectedAmazonTitle = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";
        String actualAmazonTitle = driver.getTitle();

        if (expectedAmazonTitle.equals(actualAmazonTitle)){
            System.out.println("Passsed");
        } else {
            System.out.println("Failed check again!!!");
        }
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        String expectedAmazonURL = "https://www.amazon.co.uk/";
        String actualAmazonURL = driver.getCurrentUrl();

        if (expectedAmazonTitle.equals(actualAmazonTitle) && expectedAmazonURL.equals(actualAmazonURL)){
            System.out.println("Title and URL are All working correctly!");
        } else {
            System.out.println("Title and URL are FAILED!");
        }

        driver.close();


    }
}
