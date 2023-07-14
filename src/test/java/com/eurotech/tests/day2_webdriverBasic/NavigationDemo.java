package com.eurotech.tests.day2_webdriverBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");

        // i want to wait 2 sec, waiting method coming from java

        Thread.sleep(2000);

        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(2000);

        // goes back previous page
        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.close();









    }
}
