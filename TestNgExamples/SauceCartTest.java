package TestNgExamples;

import org.example.SauceCartsPage;
import org.example.SauceCheckOut;
import org.example.SauceLoginPage;
import org.example.SauceProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceCartTest {

    WebDriver driver = null;

    @Test
    public void sauceTest () {

        System.setProperty("webdriver.chrome.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");

        SauceLoginPage loginPage = new SauceLoginPage(driver);
        SauceProductsPage productsPage = new SauceProductsPage(driver);
        SauceCartsPage cartsPage = new SauceCartsPage(driver);
        SauceCheckOut checkOut = new SauceCheckOut(driver);
        loginPage.getUsername().sendKeys("standard_user");
        loginPage.getPassword().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();
        productsPage.getFirstProduct().click();
        productsPage.getSecondProduct().click();
        cartsPage.getCart().click();
        driver.navigate().back();
        productsPage.getRemoveProduct().click();
        cartsPage.getCart().click();
        cartsPage.getCheckoutButton().click();
        checkOut.getFirstName().sendKeys("Wendy");
        checkOut.getLastName().sendKeys("Adebolu");
        checkOut.getPostCode().sendKeys("IG1 2ZE");
        checkOut.getContinueButton().click();
        checkOut.getFinishButton().click();



    }


}
