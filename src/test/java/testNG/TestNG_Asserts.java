package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Asserts {
    @Test
    public void testSum() {
        System.out.println("\nRunning Test -> testSum");
        SomeClassToTest someClassToTest = new SomeClassToTest();
        int result = someClassToTest.sumNumbers(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testString() {
        System.out.println("\nRunning Test -> testString");
        String expectedString = "Hello World";
        SomeClassToTest someClassToTest = new SomeClassToTest();
        String result = someClassToTest.addString("Hello", "World");
        Assert.assertEquals(result, expectedString);
    }

    @Test
    public void testArrays() {
        System.out.println("\n Running Test -> testArrays");
        int[] expectedArray = {1, 2, 3, 4};
        SomeClassToTest someClassToTest = new SomeClassToTest();
        int[] result = someClassToTest.getArray();
        Assert.assertEquals(result, expectedArray);
        System.out.println("\nEnd Test -> testArray");
    }
}
