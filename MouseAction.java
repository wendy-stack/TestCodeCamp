package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseAction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        // launch browser
        WebDriver driver = new ChromeDriver();
        // maximize browser
        driver.manage().window().maximize();
        // navigate to browser
        driver.navigate().to("https://www.konga.com/");
        WebElement computerAccessories = driver.findElement(By.xpath("//a[contains(text(),'Computers and Accessories')]"));
        Actions mouse = new Actions(driver);
        mouse.moveToElement(computerAccessories).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("._0e252_CDReQ > div:nth-of-type(1) > a:nth-of-type(2)")).click();


    }
}
