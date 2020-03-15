package javaScriptExecution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecution {
    private WebDriver driver;
    private String baseURL;
    private JavascriptExecutor javascriptExecutor;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        baseURL = "https://learn.letskodeit.com/p/practice";
        javascriptExecutor = (JavascriptExecutor) driver;

        //Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testJavaScriptExecution() throws Exception {
        // Navigation
//        driver.get(baseURL);
        javascriptExecutor.executeScript("window.location='https://learn.letskodeit.com/p/practice'");

        // driver.get() method waits for the page to load completely before going to the next statement
        // Adding Thread.sleep() because we are opening URL using js.executeScript() and it does not wait for the page to load completely
        // If we do not add wait, then Selenium WebDriver will immediately try to find the element and it might have issues with just a little slow connection
        Thread.sleep(3000);
        // Finding element
        // WebElement textBox = driver.findElement(By.id("name"));
        WebElement textBox = (WebElement) javascriptExecutor.executeScript("return document.getElementById('name');");
        textBox.sendKeys("test");

        SizeOfWindow();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    private void SizeOfWindow() {
        // Size of window
        long height = (Long) javascriptExecutor.executeScript("return window.innerHeight;");
        long width = (Long) javascriptExecutor.executeScript("return window.innerWidth;");

        System.out.println("Height is: " + height);
        System.out.println("Width is: " + width);
    }
}