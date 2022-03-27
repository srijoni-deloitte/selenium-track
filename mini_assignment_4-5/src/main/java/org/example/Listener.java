package org.example;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

import java.io.File;

public class Listener extends method_container implements ITestListener
{

    int i=1;
    @Override
    public void onTestStart(ITestResult result)
    {
        System.out.println("**Test case "+i+" started**");
    }
    @Override
    public void onTestSuccess(ITestResult result)
    {

        System.out.println("---Test case "+i+" ran successfully---");
        i+=1;
    }

}