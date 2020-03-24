package testNG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {

    private static final Logger logger= LogManager.getLogger();

    @BeforeClass
    @Parameters({"browser", "platform"})
    public void setUp(String browser, String platform) {
        logger.info("TestNG_Parameters -> Setup");
        logger.info("1. Parameter value from xml file: {}", browser);
        logger.info("2. Parameter value from xml file: " + platform);
    }

    @Test
    @Parameters({"response"}) // testng za pomoca javowej refleksji wypelnia ten parametr
    public void testMethod1(String response) throws InterruptedException {
        String[] stringArray = response.split(",");
        logger.info("TestNG_Parameters -> testMethod1");
        logger.info("Response from xml file: " + response);
        logger.info("stringArray[0] from xml file: " + stringArray[0]);
        logger.info("stringArray[1] from xml file: " + stringArray[1]);
    }
}
