import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropActions {
    private WebDriver driver;
    private String baseUrl_1;
    private String baseUrl_2;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kamil\\Desktop\\code\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl_1 = "https://jqueryui.com/droppable/";
        baseUrl_2="https://jqueryui.com/slider/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testDragAndDrop() throws Exception {
        driver.get(baseUrl_1);
        Thread.sleep(2000);
        driver.switchTo().frame(0);

        WebElement fromElement = driver.findElement(By.id("draggable"));
        WebElement toElement = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        //Drag and drop
        action.dragAndDrop(fromElement, toElement).build().perform();

        //Click and hold, move to element, release, build and perform
//        action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
    }

    @Test
    public void testSliderActions() throws Exception {
        driver.get(baseUrl_2);
        driver.switchTo().frame(0);
        Thread.sleep(3000);

        // Using the actions class
        WebElement element=driver.findElement(By.xpath("//div[@id='slider']/span"));
        Actions action=new Actions(driver);
        action.dragAndDropBy(element,100,0).perform();
    }

    @After
    public void tearDown() throws Exception {
//        Thread.sleep(1000);
//        driver.quit();
    }
}