package testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_DependentTests {

    SomeClassToTest obj;

    @BeforeClass
    public void setUp() {
        obj = new SomeClassToTest();
        System.out.println("before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("after class");
    }

//    @Test(dependsOnMethods={ "testMethod2" }, alwaysRun=true)
//    public void testMethod1() {
//        System.out.println("testMethod1");
//    }
//
//    @Test
//    public void testMethod2() {
//        System.out.println("testMethod2");
//        int result = obj.sumNumbers(1, 2);
//        Assert.assertEquals(result, 3);
//    }

    @Test(timeOut = 200)
    public void testMethod3() throws InterruptedException {
        System.out.println("testMethod3");
        Thread.sleep(300);
    }

    @Test
    public void testMethod4() {
        System.out.println("testMethod4");
    }
}
