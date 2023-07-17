package com.eurotech.tests.day3_webelement_Intro;

import com.eurotech.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskHomeWork {
    public static void main(String[] args) throws InterruptedException {

         /*
          HomeWork
        --open the chrome browser
        --navigate the "http://eurotech.study/login"
        --enter email address "eurotech@gmail.com"
        --enter password "Test12345!"
        --Click login button
        --verify that dashboard text is visible
         */

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.navigate().to("http://eurotech.study/login");

        Thread.sleep(2000);
        WebElement confirmBtn = driver.findElement(By.id("rcc-confirm-button"));
        confirmBtn.click();

        Thread.sleep(2000);

        WebElement email = driver.findElement(By.id("loginpage-input-email"));
        email.sendKeys("eurotech@gmail.com");

        WebElement password = driver.findElement(By.id("loginpage-form-pw-input"));
        password.sendKeys("Test12345!");

        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));
        loginBtn.click();


        Thread.sleep(1000);

        WebElement dashboard = driver.findElement(By.id("dashboard-h1"));
        System.out.println("dashboard.getText() = " + dashboard.getText());

        System.out.println("dashboard.getAttribute(\"id\") = " + dashboard.getAttribute("id"));
        System.out.println("dashboard.getAttribute(\"class\") = " + dashboard.getAttribute("class"));
        Thread.sleep(1000);
        System.out.println("---");
        String actualURL = "http://eurotech.study/dashboard";
        String expectedURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        Thread.sleep(1000);

        driver.close();

    }
}
