package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task43C {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        // launch browser
        WebDriver driver = new ChromeDriver();
        // maximize browser
        driver.manage().window().maximize();
        // navigate to browser
        driver.navigate().to("https://jqueryui.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
        driver.switchTo().frame(0);
        WebElement resizeFrame = driver.findElement(By.xpath("//body/div[@id='resizable']/div[1]"));
        Actions resize = new Actions(driver);
        resize.clickAndHold(resizeFrame).moveByOffset(298, 196).build().perform();
    }
}
