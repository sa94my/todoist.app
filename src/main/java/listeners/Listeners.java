package listeners;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onTestFailure(ITestResult testResult) {
		if(testResult.getThrowable() != null) {
			StringWriter write = new StringWriter();
			PrintWriter print = new PrintWriter(write);
			testResult.getThrowable().printStackTrace(print);
			System.out.println(write.toString());
			
		}
	}

}
