package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task36 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        /*driver.findElement(By.xpath("/html/body/div[2]/a[1]")).click();*/
        driver.findElement(By.cssSelector("input[placeholder=Username]")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[name=add-to-cart-sauce-labs-bike-light]")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#shopping_cart_container")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button#checkout")).click();



    }
}
