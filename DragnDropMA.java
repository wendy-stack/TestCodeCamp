package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropMA {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        // launch browser
        WebDriver driver = new ChromeDriver();
        // maximize browser
        driver.manage().window().maximize();
        // navigate to browser
        driver.navigate().to("https://jqueryui.com/draggable/");
        //iframe.demo-frame
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        WebElement dragBox = driver.findElement(By.xpath("//div[@id='draggable']"));

        Actions drag = new Actions(driver);
        drag.clickAndHold(dragBox).moveByOffset(384,129).build().perform();





    }
}
