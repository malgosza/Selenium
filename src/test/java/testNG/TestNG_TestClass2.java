package testNG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

public class TestNG_TestClass2 extends BaseTestSuite {
    private static final Logger logger = LogManager.getLogger();

    @BeforeClass
    public void setUp() {
        logger.info("TestNG_TestClass1 -> before class");
    }

    @AfterClass
    public void cleanUp() {
        logger.info("TestNG_TestClass1 -> after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        logger.info("TestNG_TestClass1 -> before method");
    }

    @AfterMethod
    public void afterMethod() {
        logger.info("TestNG_TestClass1 -> after method");
    }

    @Test
    public void testMethod1() {
        logger.info("TestNG_TestClass1 -> testMethod1");
    }

    @Test
    public void testMethod2() {
        logger.info("TestNG_TestClass1 -> testMethod2");
    }
}
