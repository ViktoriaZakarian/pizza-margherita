package by.pizzatempo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {

    protected WebDriver webDriver;

    @BeforeMethod
    public void setup() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        webDriver.manage().window().maximize();
        webDriver.get("https://www.pizzatempo.by/");
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }
}
