package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task44SelectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        // launch browser
        WebDriver driver = new ChromeDriver();
        // maximize browser
        driver.manage().window().maximize();
        // navigate to browser
        driver.navigate().to("https://selenium08.blogspot.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Demo dropdown");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='flat-icon-button ripple']//*[name()='svg']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[title='Demo Dropdown List']")).click();
        Thread.sleep(5000);
        WebElement countrySelect = driver.findElement(By.xpath("//select[@name='country']"));
        Select country = new Select(countrySelect);
        country.selectByValue("NG");
        WebElement monthSelect = driver.findElement(By.xpath("//select[@name='Month']"));
        Select month = new Select(monthSelect);
        month.selectByValue("Jan");
        Thread.sleep(5000);
        month.selectByValue("Feb");
        Thread.sleep(5000);
        month.selectByValue("Ma");




    }
}
