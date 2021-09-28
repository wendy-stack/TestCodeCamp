package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class FirefoxNavigate {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/wendyseth/IdeaProjects/SeleniumProjects/src/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mozilla.org/en-GB/");


    }
}
