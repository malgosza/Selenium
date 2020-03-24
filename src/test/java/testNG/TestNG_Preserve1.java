package testNG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestNG_Preserve1 {

    private static final Logger logger = LogManager.getLogger();

    @Test
    public void testMethod1() {
        logger.info("TestNG_Preserve1 -> testMethod1");
    }

    @Test
    public void testMethod2() {
        logger.info("TestNG_Preserve1 -> testMethod2");
    }
}
