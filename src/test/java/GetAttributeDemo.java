import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GetAttributeDemo {

    private WebDriver driver;
    private String baseURL;
    private GenericMethods gm;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Kamil\\Desktop\\code\\Selenium\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        baseURL = "https://letskodeit.teachable.com/pages/practice";
        gm = new GenericMethods(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testGetText() throws Exception {
        driver.get(baseURL);

//        WebElement element=driver.findElement(By.id("name"));
//        String attributeValue=element.getAttribute("type");
//
//        System.out.println("Value of attribute is: "+attributeValue);
        WebElement element = gm.getElement("name", "id");
        element.sendKeys("test");

        List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");
        int size = elementList.size();
        System.out.println("Size of element list is: " + size);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}