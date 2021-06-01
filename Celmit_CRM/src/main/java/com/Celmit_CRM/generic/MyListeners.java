package com.Celmit_CRM.generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.Celmit_CRM.generic.BaseTest;

public class MyListeners extends BaseTest implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" Started", true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" Passed", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" Failed", true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		try {
			wlib.getFullScreenshot("./Screenshots/"+result.getName()+".png");
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"Skipped", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+"Test Runner Started", true);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+"Test Runner Completed", true);
	}
}

