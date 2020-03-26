package listenerspackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.*;

public class CustomListener implements IInvokedMethodListener, ITestListener, ISuiteListener {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        // Before every method in the Test Class
        logger.info("beforeInvocation: " + testResult.getTestClass().getName() +
                " => " + method.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        // After every method in the Test Class
        logger.info("afterInvocation: " + testResult.getTestClass().getName() +
                " => " + method.getTestMethod().getMethodName());
    }

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

    @Override
    public void onStart(ISuite suite) {
        // When <suite> tag starts
        logger.info("onStart: before suite starts");
    }

    @Override
    public void onFinish(ISuite suite) {
        // When <suite> tag completes
        logger.info("onFinish: after suite completes");
    }

}
