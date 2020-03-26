package listenerspackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {
    
    private static final Logger logger= LogManager.getLogger();
    
    @Override
    public void onTestStart(ITestResult result) {
        // When test method starts
     logger.info("onTestStart -> Test Name: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // If test method is successful
     logger.info("onTestSuccess -> Test Name: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // If test method is failed
     logger.info("onTestFailure -> Test Name: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // If test method is failed
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Ignore this
    }

    @Override
    public void onStart(ITestContext context) {
        // Before <test> tag of xml file
     logger.info("onStart -> Test Tag Name: " + context.getName());
        ITestNGMethod methods[] = context.getAllTestMethods();
     logger.info("These methods will be executed in this test tag:");
        for (ITestNGMethod method : methods) {
         logger.info(method.getMethodName());
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        // After <test> tag of xml file
     logger.info("onFinish -> Test Tag Name: " + context.getName());
    }
}