package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.google.com/");
            driver.findElement(By.id("L2AGLb")).click();
            driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Testify Limited");
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("img[alt='Google']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).click();
            Thread.sleep(5000);
            driver.navigate().refresh();
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
            driver.navigate().forward();
    }
}
