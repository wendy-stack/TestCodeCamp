package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsState {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/wendyseth/IdeaProjects/SeleniumProjects/src/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        //
        //driver.get("https://www.google.com/");

        //driver.findElement(By.cssSelector("button#L2AGLb")).click();
        //boolean state = driver.findElement(By.cssSelector("img[alt='Google']")).isDisplayed();
        //System.out.println(state);

        /*driver.navigate().to("https://www.quora.com/");
        driver.findElement(By.id("email")).sendKeys("jason@gmail.com");
        driver.findElement(By.id("password")).sendKeys("abcdefgh");
        Thread.sleep(5000);
        boolean state = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]" +
                "/div[2]/div[2]/div[4]/button[1]")).isEnabled();
        Thread.sleep(5000);
        System.out.println(state);
*/

        driver.navigate().to("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.cssSelector("input[value='red']")).click();

        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[value='yellow']"));

        boolean red = driver.findElement(By.cssSelector("input[value='red']")).isSelected();
        boolean yellow = driver.findElement(By.cssSelector("input[value='yellow']")).isSelected();
        System.out.println(red + "--------i am red--------");
        System.out.println(yellow + "-----i am yellow-----");





    }
}
