package org.example;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeNavigate {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","/Users/wendyseth/IdeaProjects/SeleniumProjects/src/msedgedriver");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.msn.com/spartan/dhp");


    }
}
