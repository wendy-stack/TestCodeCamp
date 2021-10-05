package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductsPage {

    WebDriver Pdriver = null;
    public SauceProductsPage(WebDriver driver){
        Pdriver = driver;
        PageFactory.initElements(Pdriver, this);
    }

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement firstProduct;
    public WebElement getFirstProduct (){
        return firstProduct;
    }

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement secondProduct;
    public WebElement getSecondProduct (){
        return secondProduct;
    }
    @FindBy (xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement removeFirstProd;
    public WebElement getRemoveProduct (){
        return removeFirstProd;
    }



}
