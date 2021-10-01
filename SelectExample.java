package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        // launch browser
        WebDriver driver = new ChromeDriver();
        // maximize browser
        driver.manage().window().maximize();
        // navigate to browser
        driver.navigate().to("https://demoqa.com/select-menu");
        WebElement selectMenu = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        Thread.sleep(5000);
        Select select = new Select(selectMenu);
//        select.selectByVisibleText("Yellow");
//        select.selectByIndex(4);
          select.selectByValue("5");

    }
}
