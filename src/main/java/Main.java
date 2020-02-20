import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver= new ChromeDriver();
//        String baseUrl="https://www.letskodeit.com/";
//        driver.get(baseUrl);
////        WebElement element = webDriver.findElement(By.id(""));

        String baseURL="https://learn.letskodeit.com/p/practice";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

//        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
//        driver.findElement(By.id("user_email")).sendKeys("letskodeit@gmail.com");
        driver.findElement(By.name("enter-name")).sendKeys("Automation");

    }
}
