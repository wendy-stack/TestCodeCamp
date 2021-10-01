package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowPopUps {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.dezlearn.com/multiple-browser-windows/");
        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[@id='u_7_8']")).click();

        Set<String> windows = driver.getWindowHandles();

        String linkedIn = "";

        for (String window : windows) {
            driver.switchTo().window(window);
            Thread.sleep(5000);
            System.out.println(driver.getCurrentUrl());

            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/")) {
                linkedIn = driver.getCurrentUrl();
                driver.findElement(By.xpath("//a[contains(text(),'Join now')]")).click();
            }

        }




    }
}
