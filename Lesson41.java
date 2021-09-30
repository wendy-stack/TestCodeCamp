package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson41 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/frames");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(iframe);
        String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
        System.out.println(text);

    }
}
