package testNG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

public class TestNG_Priority {

    private static final Logger logger = LogManager.getLogger();

    @BeforeClass
    public void setUp() {
        logger.info("TestNG_TestClass1 -> before class");
    }

    @AfterClass
    public void cleanUp() {
        logger.info("TestNG_TestClass1 -> after class");
    }

    @Test(priority = 2)
    public void testMethod1() {
        logger.info("TestNG_Prioritiy -> testMethod1");
    }

    @Test(priority = 1)
    public void testMethod2() {
        logger.info("TestNG_Prioritiy -> testMethod2");
    }

    @Test(priority = 0)
    public void testMethod3() {
        logger.info("TestNG_Prioritiy -> testMethod3");
    }
}
