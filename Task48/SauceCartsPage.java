package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCartsPage {
    WebDriver Cdriver = null;

    public SauceCartsPage (WebDriver driver){
        Cdriver = driver;
        PageFactory.initElements(Cdriver, this);
    }
    @FindBy (xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    private WebElement addToCart;
    public WebElement getCart (){
        return addToCart;
    }

    @FindBy (xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;
    public WebElement getCheckoutButton(){
        return checkoutButton;
    }



}
