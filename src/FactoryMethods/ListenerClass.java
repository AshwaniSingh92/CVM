package FactoryMethods;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends DriverFactory implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		
		try {
			StepLogger.logitinfile(0, "Description", "Step", "Actual", "Expected");
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	//	System.out.println(result.getName()+"Passed");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {


		System.out.println(result.getName()+"Failed");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
}
