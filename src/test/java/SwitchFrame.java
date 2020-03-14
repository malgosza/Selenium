import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchFrame {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kamil\\Desktop\\code\\Selenium\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        baseURL = "https://learn.letskodeit.com/p/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(2000);
        // Switch to frame by ID
        driver.switchTo().frame("courses-iframe");
        // Switch to frame by name
//        driver.switchTo().frame("iframe-name");
        // Switch to frame by numbers
//        driver.switchTo().frame(0);

        WebElement searchBox = driver.findElement(By.id("search-courses"));
        searchBox.sendKeys("python");

        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        ;
        driver.findElement(By.id("name")).sendKeys("Test successful");
    }

    @Test


    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
