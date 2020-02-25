import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IdXPATHDemo {
    public static void main(String[] args) {
        String baseURL="https://learn.letskodeit.com";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kamil\\Desktop\\code\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
        driver.findElement(By.id("user_email")).sendKeys("letskodeit@gmail.com");
    }
}
