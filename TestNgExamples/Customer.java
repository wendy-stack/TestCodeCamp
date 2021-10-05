package TestNgExamples;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import scala.util.parsing.combinator.testing.Str;

public class Customer {

    @DataProvider(name = "testers")
    public Object[][] createCustomer(){
        return new Object[][] {{"Adeyi"},{"Wunmi"}, {"Priscilla"} };
    }
    @Test (dataProvider = "testers")

    public void customerB(String name){
        System.out.println("my name is "+ name );
    }
//    @Test (dependsOnMethods = "customerB")
//    public void customerA(){
//        System.out.println("---customer two method---");
//    }
//



}
