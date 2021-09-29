package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task38 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //fi-q
        driver.get("https://worldweather.wmo.int/en/home.html");
        driver.findElement(By.cssSelector("#q_search")).sendKeys("London");
        driver.findElement(By.cssSelector("input[name = 'submit']")).click();
        String text = driver.findElement(By.xpath("//div[@class='col-7 city_right_side']")).getText();
        System.out.println(text);
    }
}
