import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        String baseURL = "https://facebook.com";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kamil\\Desktop\\code\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current of URL is: " + currentURL);
        String pageSource = driver.getPageSource();
        System.out.println("Page of Source is: " + pageSource);
    }
}
