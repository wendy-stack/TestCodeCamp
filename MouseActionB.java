package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionB {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        // launch browser
        WebDriver driver = new ChromeDriver();
        // maximize browser
        driver.manage().window().maximize();
        // navigate to browser
        driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
        //right click
//        WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
//        Actions mouse = new Actions(driver);
//        mouse.contextClick(rightClick).build().perform();

        // click on the menu
//        driver.findElement(By.cssSelector(".context-menu-icon-paste")).click();
//        Thread.sleep(5000);
//        driver.switchTo().alert().accept();

        // Double click on the menu

        WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
        Actions mouse = new Actions(driver);
        mouse.doubleClick(doubleClick).build().perform();
        Thread.sleep(5000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println("-----success-----");
    }
}
