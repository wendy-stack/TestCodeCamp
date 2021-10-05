package TestNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Officer {

@Test
    public void hardOne(){
        String name = "Adeyi";
        Assert.assertEquals(name, "Ade");
        System.out.println("code reached here------");

    }
    @Test
    public void softTwo(){
        String name = "Adeyi";
        SoftAssert sss = new SoftAssert();
        sss.assertEquals(name, "Ade");
        System.out.println("code reached here------");
        sss.assertAll();
    }


}
