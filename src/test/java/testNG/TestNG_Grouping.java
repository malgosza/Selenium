package testNG;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

public class TestNG_Grouping {

    private static final Logger logger = LogManager.getLogger();

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        logger.info("Before Class");
    }

    @Test(groups = {"cars", "suv"})
    public void testBMWX6() {
        logger.info("Running Test - BMW X6");
    }

    @Test(groups = {"cars", "sedan"})
    public void testAudiA6() {
        logger.info("Running Test - Audi A6 ");
    }

    @Test(groups = {"bikes"})
    public void testNinja() {
        logger.info("Running Test - Kawasaki Ninja");
    }

    @Test(groups = {"bikes"})
    public void testHondaCBR() {
        logger.info("Running Test - Honda CBR");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        logger.info("After Class");
    }
}