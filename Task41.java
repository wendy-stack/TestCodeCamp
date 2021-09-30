package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task41 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
//        WebElement iframe = driver.findElement(By.xpath("button[title='Close']"));
//        driver.switchTo().frame(iframe);
//        driver.findElement(By.xpath("button[title='Close']")).click();
        driver.switchTo().frame(driver.findElement(By.name("Close")));
        driver.findElement(By.xpath("button[title='Close']")).click();







    }
}
