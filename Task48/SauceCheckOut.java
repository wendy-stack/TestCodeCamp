package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckOut {
    WebDriver Odriver = null;

    public SauceCheckOut(WebDriver driver){
        Odriver = driver;
        PageFactory.initElements(Odriver, this);
    }
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public WebElement getFirstName (){
        return firstName;
    }
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public WebElement getLastName (){
        return lastName;
    }
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postCode;
    public WebElement getPostCode (){
        return postCode;
    }
    @FindBy(xpath = " //input[@id='continue']")
    private WebElement continueButton;
    public WebElement getContinueButton (){
        return continueButton;
    }

    @FindBy(xpath = " //button[@id='finish']")
    private WebElement finishButton;
    public WebElement getFinishButton (){
        return finishButton;
    }


}
