package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNavigate {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //fi-q
        driver.get("https://www.amazon.co.uk/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy");


    }

}
