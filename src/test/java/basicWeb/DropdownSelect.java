package basicWeb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownSelect {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Kamil\\Desktop\\code\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        baseURL = "https://letskodeit.teachable.com/p/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testDropdown() throws Exception {
        driver.get(baseURL);
        WebElement element = driver.findElement(By.id("carselect"));
        Select select = new Select(element);

        Thread.sleep(2000);
        System.out.println("Select Benz by value");
        select.selectByValue("benz");

        Thread.sleep(2000);
        System.out.println("Select Honda by index");
        select.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Select BMW by visible text");
        select.selectByVisibleText("BMW");

        Thread.sleep(2000);
        System.out.println("Print the list of all options");
        List<WebElement> options = select.getOptions();
        int size = options.size();

        for (int i = 0; i < size; i++) {
            String optionName = options.get(i).getText();
            System.out.println(optionName);
        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
