package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task40 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        driver.navigate().back();

       String login = driver.findElement(By.cssSelector("#login-button")).getAttribute("value");
        System.out.println(login);

        driver.navigate().forward();

        String productName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]" +
                "/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]")).getText();
        System.out.println(productName);







    }
}
