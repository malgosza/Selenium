package listenerspackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Listeners(CustomListeners.class)
public class TestNG_ListenersTest2 {

    private static final Logger logger= LogManager.getLogger();

    @BeforeClass
    public void setUp() {
        logger.info("TestNG_ListenersTest2 -> Code in before class");
    }

    @AfterClass
    public void cleanUp() {
        logger.info("TestNG_ListenersTest2 -> Code in after class");
    }

    @Test
    public void testMethod1() {
        logger.info("TestNG_ListenersTest2 -> Code in testMethod1");
        Assert.assertTrue(true);
    }

    @Test
    public void testMethod2() {
        logger.info("TestNG_ListenersTest2 -> Code in testMethod2");
        Assert.assertTrue(false);
    }
}