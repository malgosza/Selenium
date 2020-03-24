package testNG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestNG_DataProviders {
    private static final Logger logger= LogManager.getLogger();

    @Test(dataProvider = "inputs", dataProviderClass = TestData.class)
    public void testMethod1(String input1, String input2){
        logger.info("Input 1: {}", input1);
        logger.info("Input 2: {}", input2);
    }
}
