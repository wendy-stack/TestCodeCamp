package TestNgExamples;


import org.testng.annotations.Test;

public class Officeer {

    @Test  (priority = 3)
    public void createOfficer(){
        System.out.println("---officer created---");
    }
    @Test (priority = 2)
    public void officerOne(){
        System.out.println("---officer one method---");
    }
    @Test (priority = 1)
    public void officerTwo(){
        System.out.println("---officer two method---");
    }

}
