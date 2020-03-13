import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        baseURL = "http://letskodeit.teachable.com/pages/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @Test
    public void test() throws InterruptedException {
        //Get the handle
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Handle: " + parentHandle);

        //Find Open Window button
        WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.click();

        //Get all handles
        Set<String> handles = driver.getWindowHandles();
        System.out.println("Size: "+handles.size());

        //Switching between handles
        for (String handle : handles) {
            System.out.println(handle);
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                WebElement searchBox = driver.findElement(By.id("search-courses"));
                Thread.sleep(2000);
                driver.close();
                break;
            }
        }

        //Switch back to the parent window
        driver.switchTo().window(parentHandle);
        driver.findElement(By.id("name")).sendKeys("Test successful");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
