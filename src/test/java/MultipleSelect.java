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

public class MultipleSelect {
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
    public void testMultipleSelect() throws Exception {
        driver.get(baseURL);
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(element);

        Thread.sleep(2000);
        System.out.println("Select orange by value");
        select.selectByValue("orange");

        Thread.sleep(2000);
        System.out.println("De-Select orange by value");
        select.deselectByValue("orange");

        Thread.sleep(2000);
        System.out.println("Select peach by index");
        select.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("De-Select peach by index");
        select.deselectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Select Apple by visible text");
        select.selectByVisibleText("Apple");

        Thread.sleep(2000);
        System.out.println("Print all selected options");
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
