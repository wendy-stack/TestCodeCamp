package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task43D {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.browserstack.com/");
        WebElement prodMenu = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));

        Actions productsMenu = new Actions(driver);
        productsMenu.moveToElement(prodMenu).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/nav[1]/ul[1]/li" +
                "[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[3]")).click();

    }
}
