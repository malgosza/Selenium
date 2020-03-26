package listenerspackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener {

    private static final Logger logger= LogManager.getLogger();

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
}
