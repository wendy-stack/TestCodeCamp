package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertss {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.dezlearn.com/javascript-alerts/");
        Thread.sleep(5000);

//        driver.findElement(By.xpath("//button[@id='c_alert2']")).click();
//
//        Alert alerts = driver.switchTo().alert();
//      //  alerts.accept();
//        alerts.dismiss();

        JavascriptExecutor scrolling = (JavascriptExecutor) driver;
        scrolling.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='p_alert3']")).click();
        Alert alerts = driver.switchTo().alert();
        Thread.sleep(5000);
        alerts.sendKeys("I am handling this alerts");
        System.out.println(alerts.getText());
        Thread.sleep(5000);
        alerts.accept();








    }
}
