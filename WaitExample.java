package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        // launch browser
        WebDriver driver = new ChromeDriver();
        // maximize browser
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // navigate to browser
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.cssSelector("button[title='Allow All Cookies']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
        // using Explicit wait
        Wait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name = 'firstname']")));
        driver.findElement(By.cssSelector("input[name = 'firstname']")).sendKeys("Wendy");
    }
}
