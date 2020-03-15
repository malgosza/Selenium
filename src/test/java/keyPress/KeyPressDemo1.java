package keyPress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class KeyPressDemo1 {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kamil\\Desktop\\code\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testKeyPress() throws Exception {
        driver.get(baseUrl);
        Thread.sleep(2000);

//        driver.findElement(By.xpath("//a[contains(@href,'sign_in')]")).click();
//        driver.findElement(By.id("user_email")).sendKeys("test@gmail.com");
//        Thread.sleep(2000);
//        driver.findElement(By.id("user_email")).sendKeys(Keys.TAB);
//        driver.findElement(By.id("user_password")).sendKeys("123123");
//        Thread.sleep(1000);
//        driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);

        // Part II
        driver.findElement(By.id("openwindow")).sendKeys(Keys.COMMAND + "a");
        Thread.sleep(2000);
//        driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.COMMAND, "a"));
//        Thread.sleep(2000);
    }

    @After
    public void tearDone() throws Exception {
        driver.quit();
    }
}