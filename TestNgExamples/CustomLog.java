package TestNgExamples;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomLog extends TestListenerAdapter {


    @Override
    public void onTestSuccess(ITestResult tr) {
       log(tr.getName() + "----this is a test logging----");
    }

    private void log(String s) {
        System.out.println(s);
    }

}
