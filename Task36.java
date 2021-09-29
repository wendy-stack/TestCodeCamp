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
        driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id = 'checkout']")).click();



    }
}
