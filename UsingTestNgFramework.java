package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;



public class WaitExample {
    WebDriver driver = null;

    @BeforeMethod
    public void openBrowser (){
            System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
            // launch browser
            driver = new ChromeDriver();
            // maximize browser
            driver.manage().window().maximize();
            // implicit wait
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("-----browser launched ----");

    }

    @Test
    public void firstName () throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.cssSelector("button[title='Allow All Cookies']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();



        driver.findElement(By.name("firstname")).sendKeys("Wendy");
        Thread.sleep(5000);
        System.out.println("----- inputed first name ----");
    }
    @Test
    public void lastName () throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.cssSelector("button[title='Allow All Cookies']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();

        driver.findElement(By.name("lastname")).sendKeys("Adeyi");
        Thread.sleep(5000);
        System.out.println("----inputed last name----");
    }
    @AfterMethod
   public void quitBrowser (){
//        driver.quit();
//
        System.out.println("---close browser---");
    }



}

