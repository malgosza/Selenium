package testNG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAsserts {
//  LogManager.getLogger(TestNG_SoftAsserts.class);
    private static final Logger logger = LogManager.getLogger();

    @Test
    public void testSum() {
        SoftAssert sa = new SoftAssert();
        logger.info("Running Test -> testSum");
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1, 2);
        sa.assertEquals(result, 2);
        logger.info("Result: {}, Line after assert 1", result);
        sa.assertEquals(result, 3);
        logger.info("Line after assert 2, result: {}", result);
        sa.assertAll();
    }
}
